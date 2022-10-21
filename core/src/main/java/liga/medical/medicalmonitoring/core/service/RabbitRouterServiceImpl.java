package liga.medical.medicalmonitoring.core.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.common.dto.MessageType;
import liga.medical.common.dto.RabbitMessageDto;
import liga.medical.medicalmonitoring.core.api.RabbitRouterService;
import liga.medical.medicalmonitoring.core.api.RabbitSenderService;
import liga.medical.medicalmonitoring.core.model.QueueNames;
import org.springframework.stereotype.Service;

@Service
public class RabbitRouterServiceImpl implements RabbitRouterService {

    private final RabbitSenderService rabbitSenderService;

    private final ObjectMapper objectMapper;

    public RabbitRouterServiceImpl(RabbitSenderService rabbitSenderService, ObjectMapper objectMapper) {
        this.rabbitSenderService = rabbitSenderService;
        this.objectMapper = objectMapper;
    }

    @Override
    public void routeMessage(String message) {
        try {
            RabbitMessageDto rabbitMessageDto = objectMapper.readValue(message, RabbitMessageDto.class);
            MessageType messageType = rabbitMessageDto.getMessageType();

            switch (messageType) {
                case DAILY:
                    rabbitSenderService.sendMessage(rabbitMessageDto, QueueNames.DAILY_QUEUE_NAME);
                    break;
                case ALERT:
                    rabbitSenderService.sendMessage(rabbitMessageDto, QueueNames.ALERT_QUEUE_NAME);
                    break;
                case ERROR:
                    rabbitSenderService.sendMessage(rabbitMessageDto, QueueNames.ERROR_QUEUE_NAME);
                    break;
                default:
                    System.out.println("Cannot send message");
            }
        } catch (Exception ex) {
            rabbitSenderService.sendError(ex.getMessage());
        }
    }
}

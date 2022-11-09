package liga.medical.medicalmonitoring.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.common.dto.RabbitMessageDto;

public interface RabbitSenderService {

    void sendMessage(RabbitMessageDto rabbitMessageDto, String queue) throws JsonProcessingException;

    void sendError(String message);
}

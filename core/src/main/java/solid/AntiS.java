package solid;

/*Этот класс описывает сущность «работник». Этот класс нарушет принцип Single Responsibility, так как
он имеет несколько назначений. Он представляет непосредственно сущность «работника», он и работает с бд,
он и отправляет письма , он и создает новый объект «машина».
Чтобы решить проблему  нужно разделить обязанности этого класса на несколько других классов */

public class AntiS {

    public int id;

    public String firstName;

    public String secondName;

    public int age;

    public void addEmployeeInDatabase() {
        //метод добавления работника в бд
    }

    public void sendEmailToEmployee() {
        //метод отправляющий письмо на почту работнику
    }

    public void getAllEmployee() {
        //метод возвращающий всех работников
    }

    public void getEmployeeById() {
        //метод возвращающий работника по id
    }

    public void addPhotoInProfile() {
        //метод добавляющий фото в профиль работника
    }

    public void createNewCar() {
        //метод создающий новую машину
    }
}

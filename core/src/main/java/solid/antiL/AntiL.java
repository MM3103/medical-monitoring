package solid.antiL;

//нарушаем принцип, если в метод перед класс Sub

public class AntiL {

    public void writeName(Parent parent) {

        System.out.println(parent.getName());

    }
}

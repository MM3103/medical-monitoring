package solid;

//если нам будет необходимо считать не только площадь круга и квадрата, то придется изменять метод,что нарушает принцип
//правильно создать абстрактный класс фигур с абстрактным методом рассчет площади
//каждая фигура будет рассширять этот класс и реализовывать свой рассчет площади

public class AntiO {

    public int getArea(String figure) {

        int area = 0;

        if ("Circle".equals(figure)) {

            System.out.println("");
            //рассчет площади круга
        }

        if ("Square".equals(figure)) {
            System.out.println("");
            //рассчет площади квадрата
        }

        return area;

    }
}

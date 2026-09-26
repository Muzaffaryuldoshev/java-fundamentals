package classesObjects_04;

public class CarClient {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.maker = "Toyota";
        car1.color = "Red";
        car1.model = "Corolla";
        car1.currenrtSpeed = 60;


        car1.printCarInfo();

        car1.drive();

        car1.showCurrentSpeed(50);

    }
}

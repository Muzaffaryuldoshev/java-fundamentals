package classesObjects_04;

public class Car {
    String maker;
    String model;
    String color;
    int currenrtSpeed;

    public void printCarInfo(){
        System.out.println("Maker : " + maker);
        System.out.println("Model : " + model);
        System.out.println("Current Speed  : " + currenrtSpeed);
        System.out.println("Color : " + color);
    }

    public void drive(){
        System.out.println(model + " is driving");
    }

    public void showCurrentSpeed(int speedLimit) {
        System.out.println(maker + " is driving at " + currenrtSpeed + " following the\n" +
                " speed limit " + speedLimit );

        if(currenrtSpeed <= speedLimit){
            System.out.println(maker + " is driving at " + currenrtSpeed + " over  the speed limit " +  speedLimit);
        }else if (currenrtSpeed > speedLimit) {
            System.out.println("Accelerating to 10");
        }
    }

}

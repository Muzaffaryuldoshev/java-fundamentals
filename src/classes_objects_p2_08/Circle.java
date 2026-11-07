package classes_objects_p2_08;

public class Circle {
    static int totalCircle;
    double radius;

    public Circle(double radius) {
        if (radius<0){
            System.out.println("Radius can not be negative");
        }
        this.radius = radius;
        totalCircle++;
    }

    public double calcArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public static int getTotalCircle(){
        return totalCircle;
    }

    public double getRadius(){
        return this.radius;
    }

    public static void main(String[] args) {
        System.out.println("Before creatinf circle: " + getTotalCircle());

        Circle c1 = new Circle(3);
        System.out.println("After first circle: " + getTotalCircle());
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area CIrlce: " + c1.calcArea());


    }

}

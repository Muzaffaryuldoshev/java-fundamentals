package classes_objects_p2_08;
import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 40;
        double radius = 4.5;
        double area = calcArea(radius);
        System.out.println(area);
        getMax(n1, n2);


    }

    public static void getMax(int n1, int n2){
        int maxNumber = 0;

        if(n1 == n2 ) {
            System.out.println("They are equal.");
        }else if(n1 > n2){
            maxNumber = n1;
        }else{
            maxNumber = n2;
        }

        System.out.println("Max number is: " + maxNumber);
    }


    public static double calcArea(double radius){
        return PI * pow(radius, 2);

    }

}

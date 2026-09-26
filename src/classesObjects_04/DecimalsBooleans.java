package classesObjects_04;
import java.nio.file.LinkPermission;
import java.util.Scanner;
public class DecimalsBooleans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first decimal: " );
        double input = scanner.nextDouble();
        System.out.print("Enter second decimal: ");
        double input1  = scanner.nextDouble();
        System.out.println("Are you Muzaffar? (true/false)");
        boolean input2 = scanner.nextBoolean();
        if(input2){
            System.out.println("Yes you are, Wellcome(:");
        }else{
            System.out.println("Sorry you are not him):");
        }
    }
}

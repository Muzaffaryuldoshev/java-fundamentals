package string_05;
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        System.out.print("Enter your last name: ");
        String secondName = scanner.next();

        System.out.println("Total number of chars in your full name is:  " + (firstName.length() + secondName.length()));

    }
}

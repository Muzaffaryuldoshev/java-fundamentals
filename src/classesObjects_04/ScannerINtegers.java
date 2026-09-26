package classesObjects_04;
import java.util.Scanner;

public class ScannerINtegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.print(i + " number: ");
            int input = scanner.nextByte();

        }
        scanner.close();

    }

}

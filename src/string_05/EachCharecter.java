package string_05;
import java.util.Scanner;

public class EachCharecter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put your random word: " );
        String randomWord = scanner.nextLine();

        if(randomWord == null || randomWord.isEmpty() ){
            System.err.println("The text can not be null or empty. ");
        }else{
            for (int i = 0; i < randomWord.length(); i++) {
                System.out.println(randomWord.charAt(i));
            }
        }

    }
}

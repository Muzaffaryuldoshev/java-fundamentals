package loops_02;

public class FibonacciSeries {
    public static void main(String[] args) {
        int input = 8;
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            System.out.print(firstNum + " ");
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}

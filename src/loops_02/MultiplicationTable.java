package loops_02;

public class MultiplicationTable {
    public static void main(String[] args) {
        int givenNum = 10;
        System.out.println("Multiplication Table for " + givenNum);
        System.out.println("---------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(givenNum + " x " + i + " = " + (givenNum * i));
        }
    }
}

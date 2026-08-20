package loops_02;

public class SquarePattern {
    public static void main(String[] args) {
        int givenNum = 6;
        for (int i = 0; i < givenNum; i++) {
            for (int j = 0; j < givenNum; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

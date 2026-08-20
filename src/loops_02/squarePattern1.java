package loops_02;

public class squarePattern1 {
    public static void main(String[] args) {
        int input = 6;
        while (input >= 1) {
            for (int i = 1; i <= 6; i++) {
                System.out.print("* ");
            }
            System.out.println();
            input--;

        }
    }
}

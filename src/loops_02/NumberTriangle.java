package loops_02;

public class NumberTriangle {
    public static void main(String[] args) {
        int givenNum = 5;
    for (int i = 1; i <= givenNum; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }
}

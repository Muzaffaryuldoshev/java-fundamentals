package loops_02;

public class DifferentStartEnd {
    public static void main(String[] args) {
        for (int i = 5; i <=20 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 20; i >10 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i <=100 ; i+=10) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 50; i > 10 ; i-=4) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print( i + ".Hello ");
        }
    }
}

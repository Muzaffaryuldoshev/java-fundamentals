package loops_02;

public class Pattern {
    public static void main(String[] args) {
        int givenNum = 7;
        for (int i = 1; i <= givenNum ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(j == 1) {
                    System.out.print("*");
                }else if(j == i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

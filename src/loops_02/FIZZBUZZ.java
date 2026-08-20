package loops_02;

public class FIZZBUZZ {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FIZZBUZZ ");
            }else if(i % 3 == 0){
                System.out.print("FIZZ ");
            }else if(i % 5 == 0){
                System.out.print("BUZZ ");
            }else{
                System.out.print(i + " ");
            }

        }
    }
}

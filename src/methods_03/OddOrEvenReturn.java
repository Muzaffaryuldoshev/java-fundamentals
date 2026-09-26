package methods_03;

public class OddOrEvenReturn {
    public static boolean isEven(int input){
     return input % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 10;
        if (isEven(n)){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}

package methods;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 10;
        checkOddOrEven(num);
    }

    public static void checkOddOrEven(int input){
        if(input % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}

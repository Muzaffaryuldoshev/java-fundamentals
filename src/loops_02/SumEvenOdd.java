package loops_02;

public class SumEvenOdd {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0){
               sumEven += i;
            }
            else{
               sumOdd += i;
            }
        }
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
}

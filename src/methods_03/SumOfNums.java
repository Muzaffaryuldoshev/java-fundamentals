package methods_03;

public class SumOfNums {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 10;
        num2 = 20;
        num3 = 30;
        calculate(num1, num2, num3);
    }

    public static void calculate(int nm1, int num2, int num3){
        System.out.println("Total: " + (nm1 + num2 + num3));
    }
}

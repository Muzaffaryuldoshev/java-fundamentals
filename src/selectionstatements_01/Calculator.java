package selectionstatements_01;

public class Calculator {
    public static void main(String[] args) {
        char operator = '+';
        int num1 = 5;
        int num2 = 3;

        switch(operator){
            case '+':
                System.out.println( "" + (num1 + num2));
                break;
            case '-':
                System.out.println("-: "+ (num1 - num2));
                break;
            case '*':
                System.out.println("*: " +num1 * num2);
                break;
            case '/':
                System.out.println("/: " + num1 / num2);
                break;
        }
    }
}

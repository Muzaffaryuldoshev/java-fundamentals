package methods_03;

public class PassByValue {
    public static void main(String[] args) {
        int num = 5;
        modifyValue(num);
        System.out.println("After method change but out of method: " + num);

    }
    public static void modifyValue(int input){
        System.out.println("before change: " + input);
        input = 10;
        System.out.println("After changing: " + input);
        System.out.println("So inside the method: " + input);
    }

}

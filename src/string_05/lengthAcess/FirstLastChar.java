package string_05.lengthAcess;

public class FirstLastChar {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(getFirstAndLast(str));
    }


    public static String getFirstAndLast(String input){
        input = input.toLowerCase();
        char lastLetter = ' ';
        char firstLetter = ' ';

        if (input.length() > 1) {
             firstLetter = input.charAt(0);
             lastLetter = input.charAt(input.length() - 1);
        }else{
            System.out.println("The length of the input shoould be bigger than 1!");
        }

        String newString = ""+firstLetter + lastLetter;
        return newString;
    }

}

package string_05.lengthAcess;

public class EmptyBlankSingleChar {

    public static void main(String[] args) {
        classifyInput("M");
    }

    public static void classifyInput(String input) {
        if(input.isEmpty()  ){
            System.out.println("String is empty");
        } else if (input.isBlank()) {
            System.out.println("String is blank");
        }else if (input.length() == 1){
            System.out.println("String is a single character");
        }else {
            System.out.println("String is valid.");
        }

    }

}

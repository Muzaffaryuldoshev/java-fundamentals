package Arrays;

public class HowManyWords {
    public static void main(String[] args) {
        String word = " In computer programming, white space refers to any character or sequence of characters\n" +
                "that represent empty space or have no visible representation when rendered.";
        System.out.println(countWords(word));

    }

    public static int countWords(String input){
        String[] newWord = input.split(" ");
        return newWord.length;
    }
}

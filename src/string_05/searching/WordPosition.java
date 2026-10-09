package string_05.searching;

public class WordPosition {
    public static int findWordPosition(String sentence, String word){
        int index = sentence.indexOf(word);
        if (index == -1) {
            System.out.println("Not Found");
        }

        return index;
    }

    public static void main(String[] args) {
        String sen = "You are the best";
        String word = "y";
        System.out.println(findWordPosition(sen,word));
    }

}

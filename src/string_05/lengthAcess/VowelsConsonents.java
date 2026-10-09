package string_05.lengthAcess;

public class VowelsConsonents {
    public static void main(String[] args) {
        String str = "Muzaffar   1!~";
        countVowelsConsonants(str);
    }


    public static void countVowelsConsonants(String input){
        input = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case 'a' : vowels++; break;
                case 'e' : vowels++; break;
                case 'i' : vowels++; break;
                case 'u' : vowels++; break;
                case 'o' : vowels++; break;
                case 'y' : vowels++; break;
                default: if(Character.isLetter(input.charAt(i))){
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels: " + vowels);
        System.out.println("The number of consonants: " +  consonants);
    }
}

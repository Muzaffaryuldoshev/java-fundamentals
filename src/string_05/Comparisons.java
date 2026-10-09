package string_05;

public class Comparisons {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println("First Comparison with `==` " + ( str1 == str3));
        System.out.println("Second comparison with method: " + str2.equals(str4));

    }
}

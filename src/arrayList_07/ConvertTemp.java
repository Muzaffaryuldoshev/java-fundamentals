package arrayList_07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertTemp {
    public static void main(String[] args) {
        String str = "Today, the weather is sunny and 68 degrees. It is a perfect day to practice";

        // Extract the number from the sentence using Regex
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            int int1 = Integer.parseInt(matcher.group());

            // Fixed the formula line
            int fahToCels = (int1 - 30) / 2;

            System.out.println(int1 + " Fahrenheit is equal to " + fahToCels + " celsius.");
        } else {
            System.out.println("No temperature number found in the string.");
        }
    }
}

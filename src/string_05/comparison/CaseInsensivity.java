package string_05.comparison;

public class CaseInsensivity {
    public static boolean isSameWord(String a, String b){
        return  a.equalsIgnoreCase(b);
    }

    public static void main(String[] args) {
        String str1 = "Java";
        String strt2 = "JAVA";
      //  System.out.println(isSameWord(str1,strt2));
        if (isSameWord(str1,strt2)){
            System.out.println("They are the same word.");
        }else{
            System.out.println("They are not the same:(");
        }
    }

}

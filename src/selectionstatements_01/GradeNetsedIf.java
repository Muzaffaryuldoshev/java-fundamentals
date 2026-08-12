package selectionstatements_01;

public class GradeNetsedIf {
    public static void main(String[] args) {
        int score =4;
        if(score >= 0 && score <= 100){
            if(score < 60){
                System.out.println("Fail");
            } else if(score >= 60 && score < 90){
                System.out.println("Pass");
            }else if(score >= 90){
                System.out.println("Passed with Distinction");
            }else if (score < 0 && score > 100){
                System.out.println("Invalid Score");
            }

        }else {
            System.out.println("Invalid Score");
        }

    }
}

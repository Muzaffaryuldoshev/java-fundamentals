package selectionstatements_01;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 20;
        int requiredAge = 18;
        if(age >= requiredAge){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
}

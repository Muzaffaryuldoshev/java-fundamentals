package selectionstatements_01;

public class GreetingHours {
    public static void main(String[] args) {
        int givenTime = 1;
        if((givenTime > 6 && givenTime < 12)){
            System.out.println("Good Morning");
        }else if(givenTime >= 12 && givenTime < 15){
            System.out.println("Good Afternoon");
        }else if(givenTime >= 15 && givenTime < 22){
            System.out.println("Good Evening");
        }else if (givenTime < 0 && givenTime > 23){
            System.out.println("Invalid Time");
        }
    }
}

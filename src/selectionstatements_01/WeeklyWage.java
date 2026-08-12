package selectionstatements_01;

public class WeeklyWage {
    public static void main(String[] args) {
        int weeklyWage = 900;
        double workingHours = 45;
        if(workingHours > 40){
            weeklyWage *= 1.5;
        }
        System.out.println(weeklyWage);
    }

}

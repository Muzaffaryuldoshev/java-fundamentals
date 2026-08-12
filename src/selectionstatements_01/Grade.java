package selectionstatements_01;

public class Grade {
    public static void main(String[] args) {
        int mathGrade = 50;
        int scienceGrade = 70;
        int biologyGrade = 80;
        double averageGrade = (mathGrade + scienceGrade + biologyGrade) / 3;
        System.out.println(averageGrade);
        if(averageGrade >= 0 && averageGrade <= 59){
            System.out.println("F");
        }else if(averageGrade >= 60 && averageGrade <= 69){
            System.out.println("D");
        }else if(averageGrade >= 70 && averageGrade <= 79){
            System.out.println("C");
        }else if(averageGrade >= 80 && averageGrade <= 89){
            System.out.println("B");
        }else if(averageGrade >= 90 && averageGrade <= 100){
            System.out.println("A");
        }

    }
}

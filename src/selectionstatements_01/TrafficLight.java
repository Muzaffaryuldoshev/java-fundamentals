package selectionstatements_01;

public class TrafficLight {
    public static void main(String[] args) {
        char currentColor = 'r';
        currentColor = Character.toLowerCase(currentColor);
        switch(currentColor){
            case 'r':
                System.out.println("Red");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'y':
                System.out.println("Yellow");
                break;
            default:
        }
    }
}

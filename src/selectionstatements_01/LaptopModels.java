package selectionstatements_01;

public class LaptopModels {
    public static void main(String[] args) {
        String laptopModel = "Apple";
        switch(laptopModel.toLowerCase()){
            case "apple":
                System.out.println("Apple-no virus");
                break;
            case "dell":
                System.out.println("Tough one");
                break;
            case "acer":
                System.out.println("Not recommended");
                break;
                default:
                    System.out.println("“Do not buy that one!");
        }
    }
}

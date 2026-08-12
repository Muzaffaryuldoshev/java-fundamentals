package selectionstatements_01;

public class Revenue {
    public static void main(String[] args) {
        double price =  1500;
        int quantity = 4;
        double revenue = price * quantity;
        System.out.println("Total Revenue: "+revenue);

    if(revenue > 5000){
        System.out.println("You are eligible for a 10% discount");
        System.out.println("Discounted Price: "+(revenue * 0.10));
        System.out.println("Final Price: "+(revenue - (revenue * 0.10)));
    }
    }
}

package loops_02;

public class FINRA {
    public static void main(String[] args) {
       int input = 1;

        do{
            if(input % 3 == 0){
                System.out.print("FIN" + " ");
            }else if(input % 5 == 0){
                System.out.print("RA" + " ");
            }else if (input % 3 == 0 & input % 5 == 0){
                System.out.print("FINRA" + " ");
            }else {
                System.out.print(input + " ");
            }
            input++;
        }while(input <= 20);

    }
}

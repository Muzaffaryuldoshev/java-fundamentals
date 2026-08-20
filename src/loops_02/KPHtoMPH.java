package loops_02;

import java.sql.SQLOutput;

public class KPHtoMPH {
    public static void main(String[] args) {
            System.out.println("KPH       MPH");
            System.out.println("-------------");

        for (int i = 20; i <= 140 ; i+=10) {
            int mph = (int) (i * 0.62);
            System.out.println(i + "       " + mph);
        }
    }
}

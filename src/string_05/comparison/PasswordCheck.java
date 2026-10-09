package string_05.comparison;

public class PasswordCheck {

    public static boolean isStrongPassword(String password){
        if (password.length() <= 8 || password.equalsIgnoreCase("password")
                || password.equalsIgnoreCase("12345678") ){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        String password = "Muzaffar1";
        System.out.println(isStrongPassword(password));
    }
}

package Arrays;

import java.util.Arrays;

public class InitialsOfEmployees {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Alice Smith", "Robert Johnson"};
        getInitials(names);

    }

    public static void getInitials(String[] names)
    {
        String[] initials = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String[] splittedNames;
            splittedNames = names[i].split(" ");
            char firstInitial = splittedNames[0].charAt(0);
            char lastInitial = splittedNames[1].charAt(0);
            initials[i] = ("" + firstInitial + lastInitial).toUpperCase();
        }
        System.out.println(Arrays.toString(initials));


    }

}

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String input = sc.nextLine();
        // public static boolean isNumeric(CharSequence cs)
        // Checks if the CharSequence contains only Unicode digits. A decimal point is not a Unicode digit and returns false.
        boolean isNum = StringUtils.isNumeric(input);
        // static String swapCase(String str)
        // Swaps the case of a String changing upper and title case to lower case, and lower case to upper case.
        String swapped = StringUtils.swapCase(input);
        // public static String reverse(String str)
        String reversed = StringUtils.reverse(input);

        if (isNum) {
            System.out.printf("%s is a number!%n", input);
        } else {
            System.out.printf("%s is not a number!%n", input);
        }
        System.out.println("----------------------------");
        System.out.println("Let's flip the case!");
        System.out.println(swapped);
        System.out.println("----------------------------");
        System.out.println("I played the Uno Reverse card!");
        System.out.println(reversed);
    }


}

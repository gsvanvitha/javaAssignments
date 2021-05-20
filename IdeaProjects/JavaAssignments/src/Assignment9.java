import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment9 {
    public static boolean matchPattern(String string) {
        String regexPattern = "[A-Z].*[.]";
        return Pattern.matches(regexPattern, string);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string for checking: ");
        String string = sc.nextLine();
        boolean correctMatch = matchPattern(string);
        if (correctMatch) {
            System.out.println("The given pattern matches starts with a capital and ends with a period");
        } else {
            System.out.println("No, the given pattern does not start with a capital and end with a period");
        }
    }
}
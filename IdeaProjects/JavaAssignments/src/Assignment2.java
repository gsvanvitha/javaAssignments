//Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
//Write time and space complexity of your solution as comments in the source file.
/* Time Complexity : O(n) , where 'n' is the length of the given string input.
        * Space Complexity : O(1)
 */
import java.util.*;
public class Assignment2 {
    //checking if string contains all alphabets
     public static boolean areAllAlphabetsPresent(String str){
         Set<Character> allAlphabets = new HashSet<>();
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)>='a' && str.charAt(i)<='z')allAlphabets.add(str.charAt(i));
         }
         return allAlphabets.size()==26;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings to check for alphabets from a-z (Type exit to stop)");

        while(true) {
            String str = sc.nextLine();
            if(str.toLowerCase().equals("exit")) {
                System.out.println("Exiting....");
                break;
            }
            if(areAllAlphabetsPresent(str)) {
                System.out.println("All alphabets from a-z are present in the string " + str);
            }
            else {
                System.out.println("Not all alphabets are present in the string " + str);
            }
        }
    }
}


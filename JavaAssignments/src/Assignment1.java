/*Create a java program to search through the home directory and look for files that match a regular expression.
The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class HomeDirectory{
    private static final String path = System.getProperty("user.home");
    private File file;
    HomeDirectory(){
        file = new File(path);
    }
    public void searchHomeDirectory(String regex) {
        //gets all files in the path
        File[] files = file.listFiles();
        int matchesFound = 0;
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        for(File file : files) {
            Matcher matcher = null;
            try {
                //matching in the path
                matcher = pattern.matcher(file.getCanonicalPath());
            } catch (IOException e) {
                System.out.println("Some error has occurred while processing");
            }
            boolean matchFound = matcher.find();
            if(matchFound) {
                try {
                    //counting the no of matches found in the entire list
                    matchesFound++;
                    System.out.println(file.getCanonicalPath());
                    file.getCanonicalPath();
                } catch (IOException e) {
                    System.out.println("Some error has occurred while processing");
                }
            }
        }
        //if no files matched
        if(matchesFound == 0) {
            System.out.println("No files match the given regular expression !!");
        }
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HomeDirectory homeDirectory = new HomeDirectory();
        System.out.println("Enter fileNames to match Regular Expressions (Type exit to quit)");
        while(true) {
            String regex = sc.nextLine();
            if(regex.toLowerCase().equals("exit")) {
                break;
            }
            homeDirectory.searchHomeDirectory(regex);
        }
    }
}
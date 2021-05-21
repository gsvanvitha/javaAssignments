/*I/O
Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument
and counts the occurrence of all the different characters. Save the results in a text file.
 */
import java.util.HashMap;
import java.io.*;
public class Assignment11 {
    public static void main(String[] args) throws IOException {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        fileReaderWriter.readFile();
    }
}
 class FileReaderWriter {
    HashMap<Character, Integer> countChar;
    public FileReaderWriter() {
        countChar = new HashMap<Character,Integer>();
    }
    public void readFile() throws IOException {

        FileReader fileReader = null;

        try {
            fileReader = new FileReader("/home/anvgsv/IdeaProjects/JavaAssignments/src/assignment11Read");
            int index;
            while ((index = fileReader.read()) != -1) {
                char letter = (char) index;
                if (Character.isLetter(letter)) {
                        countChar.put(letter, countChar.getOrDefault(letter,0) + 1);
                }
            }
            writeDataToFile();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fileReader.close();
        }
    }
    public void writeDataToFile() {
        try {
            File file = new File("/home/anvgsv/IdeaProjects/JavaAssignments/src/assignment11Write");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(countChar.toString());
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
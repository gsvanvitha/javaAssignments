/*
 * 4. Complete the previous exercise by creating objects to attach to the array of references.
 */
package Assignment6;

public class InitializationMessage1 {

    // Constructor which takes a string argument

    InitializationMessage1(String str){
        System.out.println("The String is: " + str);
    }

    // messages will be printed

    public static void main(String[] args) {
        InitializationMessage1[] initializationMessage1 = new InitializationMessage1[3];
        initializationMessage1[0] = new InitializationMessage1("String1");
        initializationMessage1[1] = new InitializationMessage1("String2");
        initializationMessage1[2] = new InitializationMessage1("String3");
    }
}
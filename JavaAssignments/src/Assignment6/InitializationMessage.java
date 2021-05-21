/*
 * 3. Create a class with a constructor that takes a String argument. During construction, print the argument.
 * Create an array of object references to this class, but don’t actually create objects to assign into the array.
 * When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */
package Assignment6;

public class InitializationMessage {

    // Constructor which takes a string argument

    InitializationMessage(String str){
        System.out.println("The String is: " + str);
    }

    // Nothing gets printed as the array contains all null values and not any reference to this class objects.

    public static void main(String[] args) {
        InitializationMessage[] initializationMessage = new InitializationMessage[10];
    }
}
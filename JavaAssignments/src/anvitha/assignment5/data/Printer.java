package anvitha.assignment5.data;

public class Printer {
    private int intInstaceVariable;
    private char charInstaceVariable;

    //This method prints the Instance variables

    public void printInstanceVariables() {
        System.out.println("intInstaceVariable : " + intInstaceVariable);
        System.out.println("charInstaceVariable : " + charInstaceVariable);
    }

    //This method prints the Local variables

    public void printLocalVariables() {
        int intLocalVariable;
        char charLocalVariable;

        // Compiler Error : Local variables cannot be printed when they are not initialized
        //System.out.println("intLocalVariable : " + intLocalVariable);
        //System.out.println("charLocalVariable : " + charLocalVariable);
        System.out.println("intLocalVariable and charLocalVariable are not initialized - Compiler error is given here");
    }
}
package anvitha.assignment5.main;

import anvitha.assignment5.data.Printer;
import anvitha.assignment5.singleton.stringClass;

public class Assignment5 {

    // We call the methods of both the classes here

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printInstanceVariables();
        printer.printLocalVariables();  // Will give a compilation error as local variables should be initialized before use

        stringClass sc = stringClass.getInstance("Hello world");
        sc.printString();
    }
}
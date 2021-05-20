package anvitha.assignment5.singleton;

public class stringClass {
    String str;

    public stringClass(String str) {
        this.str = str;
    }

    public static stringClass getInstance(String inputStr) {

        //Compiler error - Cannot make a static reference to the non-static field str
        //str = inputStr;
        stringClass stringclass= new stringClass(inputStr);
        return stringclass;
    }

    public void printString() {
        System.out.println(str);
    }
}
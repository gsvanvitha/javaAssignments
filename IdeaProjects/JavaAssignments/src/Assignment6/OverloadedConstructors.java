package Assignment6;

public class OverloadedConstructors {
    OverloadedConstructors() {
        this(0);
        System.out.println("No Argument constructor");
    }
    OverloadedConstructors(int num) {
        System.out.println("Integer argument");
        System.out.println("The parameter num = " + num);
    }
    public static void main(String[] args) {
        OverloadedConstructors overloadedConstructors = new OverloadedConstructors();
    }
}
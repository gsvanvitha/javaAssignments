package assignment7;

public class InheritancePart3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //solution instance is an instance of all the above interfaces , it can be passed into
        // all the 4 methods given
        solution.method1(solution);
        solution.method2(solution);
        solution.method3(solution);
        solution.method4(solution);
    }
}

//Interface 1 which has 2 Methods

interface Interface1 {
    public void getInterface1();
    public void printInterface1();
}

//Interface 2 which has 2 Methods

interface Interface2 {
    public void getInterface2();
    public void printInterface2();
}

//Interface 3 which has 2 Methods

interface Interface3 {
    public void getInterface3();
    public void printInterface3();
}

//New Interface which has 2 Methods

interface Interface4 extends Interface1,Interface2,Interface3{

    public void getInterface4();

}

//This class provides the body of all the abstract methods in the above interfaces
//It also extends a Concrete class

class Solution extends Concrete implements Interface4{
    public void getInterface1() {
        System.out.println("interface 1 get method");
    }

    public void printInterface1() {
        System.out.println("interface 1 print method");
    }

    public void getInterface2() {
        System.out.println("interface 2 get method");
    }

    public void printInterface2() {
        System.out.println("interface 2 print method");
    }

    public void getInterface3() {
        System.out.println("interface 3 get method");
    }

    public void printInterface3() {
        System.out.println("interface 3 print method");
    }

    public void getInterface4() {
        System.out.println("New interface get method ");
    }

    public void method1(Interface1 interface1) {
        System.out.println("Method 1 calls objects of Interface 1");
    }

    public void method2(Interface2 interface2) {
        System.out.println("Method 2 calls objects of Interface 2");
    }

    public void method3(Interface3 interface3) {
        System.out.println("Method 3 calls objects of Interface 3");
    }

    public void method4(Interface4 interface4) {
        System.out.println("Method 4 calls of Interface 4");
    }
}

class Concrete{
    Concrete(){
        System.out.println("Concrete constructor");
    }

    public void display() {
        System.out.println("Concrete display method");
    }
}
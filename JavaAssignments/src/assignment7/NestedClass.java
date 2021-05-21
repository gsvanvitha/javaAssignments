/*
5. Create a class with an inner class that has a non-default constructor (one that takes arguments).
Create a second class with an inner class that inherits from the first inner class.
 */
package assignment7;
public class NestedClass {
    public static void main(String[] args) {
        OuterClass2.InnerClass2 object = new OuterClass2().new InnerClass2(100);
    }
}

class OuterClass1 {
    OuterClass1() {
        System.out.println("OuterClass1 constructor");
    }
    class InnerClass1 {
        InnerClass1(int num) {
            System.out.println("Value of InnerClass1 = " + num);
            System.out.println("InnerClass1 constructor");
        }
    }
}

class OuterClass2{
    OuterClass2() {
        System.out.println("OuterClass2 constructor");
    }

    class InnerClass2 extends OuterClass1.InnerClass1 {
        InnerClass2(int num) {
            new OuterClass1().super(num);
            System.out.println("Value of InnerClass2 = " + num);
            System.out.println("InnerClass2 constructor");
        }
    }
}
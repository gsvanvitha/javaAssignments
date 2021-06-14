package CreationalDesignPatterns;

public class Test {
    public static void main(String[] args){
        A a = new A();
        a.methodA();
    }
}

class A{
    void methodA(){
        class B {
            void methodB() {
                System.out.println("inside B");
                abstract class Local {
                    abstract void methodLocal();
                }
                Local local = new Local() {
                    public void methodLocal() {
                        System.out.println("inside anonymous");
                    }
                };
                local.methodLocal();
            }
        }
        B b = new B();
        b.methodB();
    }
}

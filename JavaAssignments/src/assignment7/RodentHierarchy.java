/*
 * 1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are
 * common to all Rodents, and override these in the derived classes to perform different behaviors depending on the specific
 * type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class
 *  methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should have default
 *  constructors that print a message about that class.
 */
package assignment7;
public class RodentHierarchy {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].identity();
        rodent[0].activity();
        rodent[1] = new Gerbil();
        rodent[1].identity();
        rodent[1].activity();
        rodent[2] = new Hamster();
        rodent[2].identity();
        rodent[2].activity();
    }
}
abstract class Rodent {
    Rodent() {
        System.out.println("Constructor of Rodent class");
    }

    public abstract void activity();

    public abstract void identity();

}

class Mouse extends Rodent {
    Mouse() {
        System.out.println("Constructor-Mouse class");
    }

    public void activity() {
        System.out.println("Mouse is running");
    }

    public void identity() {
        System.out.println("I am a Mouse");
    }
};

class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("Constructor-Gerbil class");
    }

    public void activity() {
        System.out.println("Gerbil is playing");
    }

    public void identity() {
        System.out.println("I am a Gerbil ");
    }
}

class Hamster extends Rodent {
    Hamster() {
        System.out.println("Constructor-Hamster class");
    }

    public void activity() {
        System.out.println("Hamster is eating");
    }

    public void identity() {
        System.out.println("I am a Hamster");
    }
}

/*2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle.
 Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.
 */
package assignment7;
public class CycleHierarchy {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[0].balance();

        cycles[1] = new Bicycle();
        cycles[1].balance();

        cycles[2] = new Tricycle();
        cycles[2].balance();

//		Tricycle triCycle = (Tricycle)cycles[2];  //Downcasting explicitly
//		triCycle.balance();
    }
}
class Cycle {
    public void balance(){
        System.out.println("Cycle balance method");
    }
}

class Unicycle extends Cycle {
    public void balance() {
        System.out.println("Unicycle balance method");
    }
}

class Bicycle extends Cycle {
    public void balance() {
        System.out.println("Bicycle balance method");
    }
}

class Tricycle extends Cycle {

}
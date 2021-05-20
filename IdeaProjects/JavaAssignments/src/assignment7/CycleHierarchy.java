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
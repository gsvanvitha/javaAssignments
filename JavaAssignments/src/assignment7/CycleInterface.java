//4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
//Create factories for each type of Cycle, and code that uses these factories.
package assignment7;
public class CycleInterface {
    public static void main(String[] args) {

        Factory cycleFactory = new CycleFactory();

        InterfaceCycle uniCycle = cycleFactory.getCycle("unicycle");
        uniCycle.identity();

        InterfaceCycle biCycle = cycleFactory.getCycle("bicycle");
        biCycle.identity();

        InterfaceCycle triCycle = cycleFactory.getCycle("tricycle");
        triCycle.identity();
    }
}


interface InterfaceCycle {
    void identity();
}

class UniCycle implements InterfaceCycle {

    public void identity() {
        System.out.println("This is a UniCycle");
    }

}

class BiCycle implements InterfaceCycle {

    public void identity() {
        System.out.println("This is a BiCycle");
    }
}

class TriCycle implements InterfaceCycle {

    public void identity() {
        System.out.println("This is a TriCycle");
    }
}



abstract class Factory {
    public abstract InterfaceCycle getCycle(String cycle);
}

class CycleFactory extends Factory{

    @Override
    public InterfaceCycle getCycle(String cycle) {
        if(cycle.equalsIgnoreCase("uniCycle")) {
            return new UniCycle();
        }
        if(cycle.equalsIgnoreCase("biCycle")) {
            return new BiCycle();
        }
        if(cycle.equalsIgnoreCase("triCycle")) {
            return new TriCycle();
        }
        return null;
    }

}
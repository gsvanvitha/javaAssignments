package BehavioralDesignPatterns.ChainOfResponsibilty;

public class Dispense500 implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void nextChain(DispenseChain nextDispenseChain) {
        chain = nextDispenseChain;
    }

    @Override
    public void dispenseNotes(Money amount) {

        if(amount.getAmount() >= 500){
            int num = amount.getAmount()/500;
            int remainder = amount.getAmount() % 500;
            System.out.println("Dispensing "+num+" 500 rupee notes");
            if(remainder !=0) this.chain.dispenseNotes(new Money(remainder));
        }else{
            this.chain.dispenseNotes(amount);
        }
    }
}

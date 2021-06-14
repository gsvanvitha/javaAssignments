package BehavioralDesignPatterns.ChainOfResponsibilty;

public class Dispense10 implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void nextChain(DispenseChain nextDispenseChain) {
        chain = nextDispenseChain;
    }

    @Override
    public void dispenseNotes(Money amount) {

        if(amount.getAmount() >= 10){
            int num = amount.getAmount()/10;
            int remainder = amount.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10 rupee notes");
            if(remainder !=0) this.chain.dispenseNotes(new Money(remainder));
        }else{
            this.chain.dispenseNotes(amount);
        }
    }
}

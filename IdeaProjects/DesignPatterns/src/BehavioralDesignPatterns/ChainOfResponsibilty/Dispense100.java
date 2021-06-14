package BehavioralDesignPatterns.ChainOfResponsibilty;

public class Dispense100 implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void nextChain(DispenseChain nextDispenseChain) {
        chain = nextDispenseChain;
    }

    @Override
    public void dispenseNotes(Money amount) {

        if(amount.getAmount() >= 100){
            int num = amount.getAmount()/100;
            int remainder = amount.getAmount() % 100;
            System.out.println("Dispensing "+num+" 100 rupee notes");
            if(remainder !=0) this.chain.dispenseNotes(new Money(remainder));
        }else{
            this.chain.dispenseNotes(amount);
        }
    }
}

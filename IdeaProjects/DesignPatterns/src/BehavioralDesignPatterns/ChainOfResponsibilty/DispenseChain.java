package BehavioralDesignPatterns.ChainOfResponsibilty;

public interface DispenseChain {
     void nextChain(DispenseChain dispenseChain);
     void dispenseNotes(Money amount);
}

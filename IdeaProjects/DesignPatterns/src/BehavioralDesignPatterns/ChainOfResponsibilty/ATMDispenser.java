package BehavioralDesignPatterns.ChainOfResponsibilty;

import java.util.Scanner;

public class ATMDispenser {
    private DispenseChain dispenseChain1;

    public ATMDispenser(){
        this.dispenseChain1 = new Dispense500();
        DispenseChain dispenseChain2 = new Dispense100();
        DispenseChain dispenseChain3 = new Dispense10();
        dispenseChain1.nextChain(dispenseChain2);
        dispenseChain2.nextChain(dispenseChain3);
    }

    public static void main(String[] args){
        ATMDispenser atmDispenser = new ATMDispenser();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required amount in multiples of 10");
        int amount = sc.nextInt();
        if(amount % 10 != 0){
            System.out.println("Enter only in multiples of 10");
            return;
        }
        atmDispenser.dispenseChain1.dispenseNotes(new Money(amount));
    }
}

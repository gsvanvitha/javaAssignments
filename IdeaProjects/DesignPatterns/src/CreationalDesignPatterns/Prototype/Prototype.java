package CreationalDesignPatterns.Prototype;
import java.util.*;
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException{
        ServiceProvider serviceProvider = new ServiceProvider("Airtel", "Telangana");
        RechargeDealer rechargeDealer = new RechargeDealer(new ServiceProvider("Idea","Delhi"),"Data Recharge", 499);
        RechargeDealer rechargeDealerCloned = (RechargeDealer) rechargeDealer.clone();
        //before changing the value of cloned
        System.out.println(rechargeDealerCloned.getServiceProvider().getServiceProviderName());
        //changing the value of cloned
        rechargeDealerCloned.getServiceProvider().setServiceProviderName("BSNL");
        //original
        System.out.println(rechargeDealer.getServiceProvider().getServiceProviderName());
        //cloned
        System.out.println(rechargeDealerCloned.getServiceProvider().getServiceProviderName());
    }
}

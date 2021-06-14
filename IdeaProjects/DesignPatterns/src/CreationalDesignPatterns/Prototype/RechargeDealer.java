package CreationalDesignPatterns.Prototype;
import java.lang.Cloneable;
public class RechargeDealer implements Cloneable{
    private String rechargeType;
    private int rechargeAmount;
    private ServiceProvider serviceProvider;
    public RechargeDealer(ServiceProvider serviceProvider,String rechargeType, int rechargeAmount){
        this.rechargeType = rechargeType;
        this.rechargeAmount = rechargeAmount;
        this.serviceProvider = serviceProvider;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public int getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(int rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    protected Object clone() throws CloneNotSupportedException{
       // return super.clone();
        RechargeDealer cloned = (RechargeDealer) super.clone();
        cloned.setServiceProvider((ServiceProvider) cloned.getServiceProvider().clone());
        return cloned;
    }

}

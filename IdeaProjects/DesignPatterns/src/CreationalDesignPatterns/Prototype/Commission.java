package CreationalDesignPatterns.Prototype;

import java.lang.Cloneable;
public class Commission implements Cloneable{
    public double inCommission, outCommission;
    public Commission(double inCommission, double outCommission){
        this.inCommission = inCommission;
        this.outCommission = outCommission;
    }
    public Object clone() throws CloneNotSupportedException{
        return this.clone();
    }
}

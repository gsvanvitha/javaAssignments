package CreationalDesignPatterns.Builder;

public abstract class BeverageBuilder {
    private Beverage beverage;

    public void makeBeverage()
    {
        beverage = new Beverage();
    }
    public Beverage getBeverage()
    {
        return beverage;
    }

    public abstract void setBeverageType();
    public abstract void setWater();
    public abstract void setMilk();
    public abstract void setSugar();
    public abstract void setPowderQuantity();
}

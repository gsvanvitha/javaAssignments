package CreationalDesignPatterns.Builder;

public class TeaBuilder extends BeverageBuilder{
    @Override
    public void setWater()
    {
        System.out.println("Step 1 : Boil water");
        getBeverage().setWater(50);
    }
    @Override
    public void setMilk()
    {
        System.out.println("Step 2 : Add milk");
        getBeverage().setMilk(50);
    }
    @Override
    public void setSugar()
    {
        System.out.println("Step 3 : Add sugar");
        getBeverage().setSugar(20);
    }
    @Override
    public void setPowderQuantity()
    {
        System.out.println("Step 4 : Add 30gm of coffee powder");
        getBeverage().setPowderQuantity(30);
    }
    @Override
    public void setBeverageType()
    {
        System.out.println("Tea");
        getBeverage().setBeverageName("Tea");
    }
}

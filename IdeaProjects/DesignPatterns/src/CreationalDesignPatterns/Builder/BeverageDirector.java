package CreationalDesignPatterns.Builder;

public class BeverageDirector {
    public Beverage buildBeverage(BeverageBuilder beverageBuilder)
    {
        beverageBuilder.makeBeverage();
        beverageBuilder.setBeverageType();
        beverageBuilder.setWater();
        beverageBuilder.setMilk();
        beverageBuilder.setSugar();
        beverageBuilder.setPowderQuantity();

        return beverageBuilder.getBeverage();
    }
}

package CreationalDesignPatterns.Builder;

public class Order
{
   public static void main(String[] args)
    {
        Beverage beverage;
        BeverageDirector beverageDirector = new BeverageDirector();

        TeaBuilder tea = new TeaBuilder();
        beverage = beverageDirector.buildBeverage(tea);
        System.out.println(beverage.showIngredients());
        CoffeeBuilder coffee = new CoffeeBuilder();
        beverage = beverageDirector.buildBeverage(coffee);
        System.out.println(beverage.showIngredients());
    }
}

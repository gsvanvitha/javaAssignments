package CreationalDesignPatterns.Builder;

public class CoffeeBuilder extends BeverageBuilder {
        @Override
        public void setWater()
        {
            System.out.println("Step 1 : Boil water");
            getBeverage().setWater(40);
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
            getBeverage().setSugar(10);
        }
        @Override
        public void setPowderQuantity()
        {
            System.out.println("Step 4 : Add 15gm of coffee powder");
            getBeverage().setPowderQuantity(15);
        }
        @Override
        public void setBeverageType()
        {
            System.out.println("Coffee");
            getBeverage().setBeverageName("Coffee");
        }
    }


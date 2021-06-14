package CreationalDesignPatterns.Builder;

public class Beverage {
    private int water;
    private int milk;
    private int sugar;
    private int powderQuantity;
    private String beverageName;

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setPowderQuantity(int powderQuantity) {
        this.powderQuantity = powderQuantity;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public String showIngredients() {
        return "Hot " + beverageName + " [" + water + " ml of water, " + milk + "ml of milk, " + sugar
                + " gm of sugar, " + powderQuantity + " gm of " + beverageName + "Powder"+"]\n";
    }
}

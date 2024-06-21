public class Pizza {

    private String mass;
    private boolean cheese;
    private boolean sauce;
    private boolean pepperoni;

    public Pizza(PizzaBuilder pizzaBuilder){
        this.mass = pizzaBuilder.mass;
        this.cheese = pizzaBuilder.cheese;
        this.sauce = pizzaBuilder.sauce;
        this.pepperoni = pizzaBuilder.pepperoni;
    }

    public Pizza print(){
        return this;
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PizzaBuilder pizzaBuilder = new PizzaBuilder("small")
                .cheese(true).sauce(true).pepperoni(true);

        Pizza pizza = pizzaBuilder.build();
        pizza.print();

    }
}
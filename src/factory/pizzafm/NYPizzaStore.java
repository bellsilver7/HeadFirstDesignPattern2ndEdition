package factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYCheesePizza();
            case "veggie":
                return new NYVeggiePizza();
            case "clam":
                return new NYClamPizza();
            case "pepperoni":
                return new NYPepperoniPizza();
            default:
                return null;
        }
    }
}

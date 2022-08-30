package factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new ChicagoVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new ChicagoClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new ChicagoPepperoniPizza();
        } else return null;
    }
}

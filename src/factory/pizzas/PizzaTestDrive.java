package factory.pizzas;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("주문한 " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("주문한 " + pizza.getName() + "\n");
    }
}

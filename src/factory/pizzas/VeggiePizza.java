package factory.pizzas;


public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "야채 피자";
        dough = "크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("슈레드 모짜렐라 치즈");
        toppings.add("파마산 치즈");
        toppings.add("양파");
        toppings.add("버섯");
        toppings.add("레드페퍼");
        toppings.add("올리브");
    }
}

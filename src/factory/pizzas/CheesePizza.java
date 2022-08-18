package factory.pizzas;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "치즈 피자";
        dough = "일반 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("모짜렐라 치즈");
        toppings.add("파마산 치즈");
    }
}

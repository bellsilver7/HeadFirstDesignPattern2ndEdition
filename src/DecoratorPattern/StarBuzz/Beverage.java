package DecoratorPattern.StarBuzz;

public abstract class Beverage {
    String description = "제목없음";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}

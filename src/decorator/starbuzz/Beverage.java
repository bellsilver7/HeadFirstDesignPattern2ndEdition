package decorator.starbuzz;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}

    Size size = Size.TALL;
    String description = "제목없음";

    public String getDescription() {
        return this.description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}

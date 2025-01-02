package ch10;

public class Apple extends Fruit {
    private String color;

    public Apple(String color) {
        super("Apple");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }
}

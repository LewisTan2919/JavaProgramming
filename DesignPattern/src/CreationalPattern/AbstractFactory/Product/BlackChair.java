package CreationalPattern.AbstractFactory.Product;

public class BlackChair implements Chair {
    @Override
    public String color() {
        return "Black";
    }

    @Override
    public int size() {
        return 1;
    }
}

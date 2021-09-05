package CreationalPattern.AbstractFactory.Product;

public class WhiteChair implements Chair {
    @Override
    public String color() {
        return "White";
    }

    @Override
    public int size() {
        return 1;
    }
}

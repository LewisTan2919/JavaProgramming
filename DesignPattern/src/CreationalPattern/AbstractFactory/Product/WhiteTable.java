package CreationalPattern.AbstractFactory.Product;

public class WhiteTable implements Table {
    @Override
    public String color() {
        return "White";
    }

    @Override
    public int size() {
        return 2;
    }
}

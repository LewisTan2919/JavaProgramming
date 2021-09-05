package CreationalPattern.AbstractFactory.Product;

public class BlackTable implements Table {
    @Override
    public String color() {
        return "Black";
    }

    @Override
    public int size() {
        return 2;
    }
}

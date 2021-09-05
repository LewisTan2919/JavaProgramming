package CreationalPattern.Factory;

public class FruitPizza implements Pizza{
    @Override
    public void smell() {
        System.out.println("this smells like fruit");
    }

    @Override
    public void taste() {
        System.out.println("this taste like fruit");
    }

    @Override
    public double price() {
        return 2.0;
    }
}

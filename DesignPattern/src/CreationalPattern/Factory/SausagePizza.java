package CreationalPattern.Factory;

public class SausagePizza implements Pizza {
    @Override
    public void smell() {
        System.out.println("this smells like Sausage");
    }

    @Override
    public void taste() {
        System.out.println("this smells like Sausage");
    }

    @Override
    public double price() {
        return 3.0;
    }
}

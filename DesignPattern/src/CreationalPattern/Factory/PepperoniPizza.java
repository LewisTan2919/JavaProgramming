package CreationalPattern.Factory;

public class PepperoniPizza implements Pizza{
    @Override
    public void smell() {
        System.out.println("this smells like pepperoni");
    }

    @Override
    public void taste() {
        System.out.println("this taste like pepperoni");
    }

    @Override
    public double price() {
        return 3.0;
    }
}

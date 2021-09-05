package CreationalPattern.Factory;

public class run {
    public static void main(String[] args) {
        Pizza fruitPizza=PizzaFactory.makePizza(Food.FRUIT);
        print(fruitPizza);

        Pizza sausagePizza=PizzaFactory.makePizza(Food.SAUSAGE);
        print(sausagePizza);
    }

    public static void print(Pizza pizza){
        pizza.smell();
        pizza.taste();
        System.out.println("price would be: "+pizza.price());
    }
}

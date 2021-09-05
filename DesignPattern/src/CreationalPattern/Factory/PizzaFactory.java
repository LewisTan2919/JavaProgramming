package CreationalPattern.Factory;

public class PizzaFactory {

    public static Pizza makePizza(Food food){
        switch(food){
            case FRUIT:{
                return new FruitPizza();
            }
            case SAUSAGE:{
                return new SausagePizza();
            }
            case PEPPERONI:{
                return new PepperoniPizza();
            }
            default:{
                return null;
            }
        }
    }
}

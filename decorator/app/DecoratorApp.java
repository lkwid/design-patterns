package app;

import model.ingredient.*;
import model.pizza.Classic;
import model.pizza.Pizza;

public class DecoratorApp {

    public static void main(String[] args) {

        Pizza pizza = new Classic();

        pizza = new TomatoSauce(pizza);
        pizza = new Cheese(pizza);
        pizza = new Salami(pizza);
        pizza = new Olives(pizza);
        pizza = new Jalapeno(pizza);

        pizza.print();
    }

}

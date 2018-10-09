package model.ingredient;

import model.pizza.Pizza;

public class TomatoSauce implements Ingredient {

    private Pizza pizza;

    public TomatoSauce(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String composition() {
        return pizza.composition() + "tomato sauce ";
    }

    @Override
    public float price() {
        return pizza.price() + 1.0f;
    }
}

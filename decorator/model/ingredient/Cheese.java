package model.ingredient;

import model.pizza.Pizza;

public class Cheese implements Ingredient {

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String composition() {
        return pizza.composition() + "cheese ";
    }

    @Override
    public float price() {
        return pizza.price() + 2.0f;
    }
}

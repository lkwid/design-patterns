package model.ingredient;

import model.pizza.Pizza;

public class Olives implements Ingredient {

    private Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String composition() {
        return pizza.composition() + "olives ";
    }

    @Override
    public float price() {
        return pizza.price() + 1.0f;
    }
}

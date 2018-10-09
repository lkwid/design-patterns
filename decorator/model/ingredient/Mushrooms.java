package model.ingredient;

import model.pizza.Pizza;

public class Mushrooms implements Ingredient {

    private Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String composition() {
        return pizza.composition() + "mushrooms ";
    }

    @Override
    public float price() {
        return pizza.price() + 1.0f;
    }
}

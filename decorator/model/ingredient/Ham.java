package model.ingredient;

import model.pizza.Pizza;

public class Ham implements Ingredient {

    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String composition() {
        return pizza.composition() + "ham ";
    }

    @Override
    public float price() {
        return pizza.price() + 2.0f;
    }
}

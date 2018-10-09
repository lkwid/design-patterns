package model.ingredient;

import model.pizza.Pizza;

public class Salami implements Ingredient {

    private Pizza pizza;

    public Salami(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String composition() {
        return pizza.composition() + "salami ";
    }

    @Override
    public float price() {
        return pizza.price() + 2.0f;
    }
}

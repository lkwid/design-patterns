package model.ingredient;

import model.pizza.Pizza;

public class Jalapeno implements Ingredient {

    private Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String composition() {
        return pizza.composition() + "jalapeno ";
    }

    @Override
    public float price() {
        return pizza.price() + 2.0f;
    }
}

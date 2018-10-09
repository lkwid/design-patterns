package model.pizza;

public class Classic implements Pizza {

    @Override
    public String composition() {
        return "Delicious pizza on a traditional crust. Ingredients: ";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}

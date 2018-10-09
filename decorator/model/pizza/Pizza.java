package model.pizza;

public interface Pizza {

    String composition();
    float price();

    default void print() {
        System.out.format("%s, total price: %f\n", composition(), price());
    }

}

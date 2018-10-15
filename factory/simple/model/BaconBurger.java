package model;

public class BaconBurger extends Burger {

    private String cheese;
    private String bacon;

    @Override
    public double getPrice() {
        return 18;
    }
}

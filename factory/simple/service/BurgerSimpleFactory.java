package service;

import model.BaconBurger;
import model.Burger;
import model.CheesBurger;
import model.HamBurger;

public class BurgerSimpleFactory {

    public static Burger makeBurger(String type) {

        Burger burger;

        switch (type) {
            case "HAMBURGER": burger = new HamBurger();
                break;
            case "CHEESBURGER": burger = new CheesBurger();
                break;
            case "BACONBURGER": burger = new BaconBurger();
                break;
            default:
            throw new IllegalArgumentException("Burger not found");
        }

        return burger;
    }

}

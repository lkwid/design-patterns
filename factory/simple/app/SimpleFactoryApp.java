package app;

import model.Burger;
import service.BurgerSimpleFactory;

public class SimpleFactoryApp {

    public static void main(String[] args) {

        Burger burger;

        burger = BurgerSimpleFactory.makeBurger("HAMBURGER");
        System.out.println(burger.toString() + " " + burger.getPrice());

        burger = BurgerSimpleFactory.makeBurger("CHEESBURGER");
        System.out.println(burger.toString() + " " + burger.getPrice());

        burger = BurgerSimpleFactory.makeBurger("BACONBURGER");
        System.out.println(burger.toString() + " " + burger.getPrice());

    }
}

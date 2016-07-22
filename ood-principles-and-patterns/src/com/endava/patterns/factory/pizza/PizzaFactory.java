package com.endava.patterns.factory.pizza;

/**
 * Created by mipopescu on 7/22/2016.
 */
public class PizzaFactory {
    public Pizza makePizza(PizzaType type){
        switch(type){
            case DELUXE: return new DeluxePizza();
            case HAMANDMUSHROOM: return new HamAndMushroomPizza();
            case PROSCIUTO: return new ProsciutoPizza();
            default: return null;
        }
    }
}

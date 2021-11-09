package com.effectivejava.chapter1.item2.builderHierarquia;

import static com.effectivejava.chapter1.item2.builderHierarquia.NyPizza.Size.SMALL;
import static com.effectivejava.chapter1.item2.builderHierarquia.Pizza.Topping.*;

public class Teste {

    public static void main(String[] args) {
        Pizza nyPizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Pizza calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println(nyPizza.getClass());
        System.out.println(calzone.getClass());
    }
}

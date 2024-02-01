package org.example;

public class Main {
    public static void main (String[] args) {
        Pizza pizza = Pizza.PizzaBuilder.aPizza()
                .withBoyut("Büyük boy")
                .withMantar(false)
                .withPeynir(true)
                .withSosis(true)
                .withZeytin(true)
                .build();

        System.out.println(pizza);
    }
}
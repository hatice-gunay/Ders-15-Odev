package org.example;
public class Pizza {
    private String boyut;
    private boolean peynir;

    private boolean sosis;
    private boolean mantar;
    private boolean zeytin;

    public static class PizzaBuilder {
        private String boyut;
        private boolean peynir;
        private boolean sosis;
        private boolean mantar;
        private boolean zeytin;

        private PizzaBuilder() {
        }

        public static PizzaBuilder aPizza() {
            return new PizzaBuilder();
        }

        public PizzaBuilder withBoyut(String boyut) {
            this.boyut = boyut;
            return this;
        }

        public PizzaBuilder withPeynir(boolean peynir) {
            this.peynir = peynir;
            return this;
        }

        public PizzaBuilder withSosis(boolean sosis) {
            this.sosis = sosis;
            return this;
        }

        public PizzaBuilder withMantar(boolean mantar) {
            this.mantar = mantar;
            return this;
        }

        public PizzaBuilder withZeytin(boolean zeytin) {
            this.zeytin = zeytin;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.mantar = this.mantar;
            pizza.zeytin = this.zeytin;
            pizza.boyut = this.boyut;
            pizza.sosis = this.sosis;
            pizza.peynir = this.peynir;
            return pizza;
        }
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "boyut='" + boyut + '\'' +
                ", peynir=" + peynir +
                ", sosis=" + sosis +
                ", mantar=" + mantar +
                ", zeytin=" + zeytin +
                '}';
    }
}
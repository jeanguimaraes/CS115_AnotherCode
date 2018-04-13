package edu.ldsbc.Assignment4;

/**
 * Created by XPS on 2/1/2017.
 */
        public class IceCream extends DessertItem {

            private int cost;

            IceCream( String name, int cost) {
                super(name);
                this.cost = cost;
            }

            @Override
            public String toString() {
                return this.getName() + " - " + cost;
            }

            @Override
            public int calculateItemCost(){
                return cost;
            }




}
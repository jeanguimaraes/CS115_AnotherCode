package edu.ldsbc.assignment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    @Test
    public void calculateItemCost() throws Exception {

        IceCream iceCream = (new IceCream("Strawberry Ice Cream",145));
        assertEquals(133, iceCream.calculateItemCost());
    }

}
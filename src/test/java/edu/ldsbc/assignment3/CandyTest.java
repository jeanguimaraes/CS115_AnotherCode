package edu.ldsbc.assignment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {
    @Test
    public void calculateItemCost() throws Exception {

        Candy candy = (new Candy("Salt Water Taffy", 1.5, 209));
        assertEquals(209, candy.calculateItemCost());
    }

}
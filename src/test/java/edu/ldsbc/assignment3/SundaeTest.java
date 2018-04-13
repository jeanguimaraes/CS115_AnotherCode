package edu.ldsbc.assignment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SundaeTest {
    @Test
    public void calculateItemCost() throws Exception {

        Sundae sundae = (new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
        assertEquals(133, sundae.calculateItemCost());
    }

}
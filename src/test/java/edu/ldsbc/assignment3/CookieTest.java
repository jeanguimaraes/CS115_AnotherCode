package edu.ldsbc.assignment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CookieTest {
    @Test
    public void calculateItemCost() throws Exception {

        Cookie cookie = (new Cookie("Chocolate Chip Cookies", 4, 399));
        assertEquals(133, cookie.calculateItemCost());

    }



}
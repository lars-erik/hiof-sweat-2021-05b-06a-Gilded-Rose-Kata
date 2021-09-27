package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Conjured_items extends RetailItemTest {
    public Conjured_items() {
        super("Conjured Mana Cake");
    }

    @Test
    public void degrades_twice_as_fast() {
        RetailItem item = createAndUpdate(10, 10);
        assertEquals(8, item.quality);
    }

    @Test
    public void degrades_quadruple_as_fast_after_selling() {
        RetailItem item = createAndUpdate(0, 10);
        assertEquals(6, item.quality);
    }
}

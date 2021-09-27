package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Legendary_items {

    @Test
    public void dont_age() {
        RetailItem item = createAndUpdate();
        assertEquals(10, item.sellIn);
    }

    @Test
    public void dont_spoil() {
        RetailItem item = createAndUpdate();
        assertEquals(80, item.quality);
    }

    private RetailItem createAndUpdate() {
        return RetailItemTest.createAndUpdate("Sulfuras, Hand of Ragnaros", 10, 80);
    }
}

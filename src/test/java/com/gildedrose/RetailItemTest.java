package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class RetailItemTest {

    private final String name;

    public RetailItemTest(String name) {
        this.name = name;
    }

    @Test
    public void decrease_in_sellin_every_day() {
        RetailItem item = createAndUpdate(10, 0);
        assertEquals(9, item.sellIn);
    }

    protected RetailItem createAndUpdate(int sellIn, int quality) {
        return createAndUpdate(name, sellIn, quality);
    }

    public static RetailItem createAndUpdate(String name, int sellIn, int quality) {
        RetailItem item = new RetailItem(name, sellIn, quality);
        item.update();
        return item;
    }
}

package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aged_brie extends RetailItemTest {

    public Aged_brie() {
        super("Aged Brie");
    }

    @Test
    public void increase_in_quality_the_older_it_gets() {
        RetailItem item = createAndUpdate(10, 0);
        assertEquals(1, item.quality);
    }

    @Test
    public void increase_even_more_in_quality_after_sell_date() {
        RetailItem item = createAndUpdate(0, 0);
        assertEquals(2, item.quality);
    }

    @Test
    public void cant_increase_past_fifty_quality() {
        RetailItem item = createAndUpdate(0, 50);
        assertEquals(50, item.quality);
    }

}

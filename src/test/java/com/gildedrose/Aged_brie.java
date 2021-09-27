package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aged_brie {
    @Test
    public void decrease_in_sellin_every_day()
    {
        RetailItem item = createAndUpdate(10, 0);
        assertEquals(9, item.sellIn);
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

    private RetailItem createAndUpdate(int sellIn, int quality) {
        RetailItem item = new RetailItem("Aged Brie", sellIn, quality);
        item.update();
        return item;
    }
}

package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Normal_items extends RetailItemTest {

    public Normal_items() {
        super("+5 Dexterity Vest");
    }

    @Test
    public void degrade_one_quality_per_day() {
        RetailItem item = createAndUpdate(10, 10);
        assertEquals(9, item.quality);
    }

    @Test
    public void degrades_twice_as_fast_after_sell_date() {
        RetailItem item = createAndUpdate(0, 10);
        assertEquals(8, item.quality);
    }

    @Test
    public void never_have_negative_quality() {
        RetailItem item = createAndUpdate(0, 0);
        assertEquals(0, item.quality);
    }
}

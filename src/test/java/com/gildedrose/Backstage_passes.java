package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Backstage_passes extends RetailItemTest {

    public Backstage_passes() {
        super("Backstage passes to a TAFKAL80ETC concert");
    }

    @Test
    public void increase_in_quality_as_sellin_approaches() {
        RetailItem item = createAndUpdate(11, 0);
        assertEquals(1, item.quality);
    }

    @ParameterizedTest
    @ValueSource(ints={10, 6})
    public void increase_two_in_quality_when_10_or_less_days(int sellIn) {
        RetailItem item = createAndUpdate(sellIn, 0);
        assertEquals(2, item.quality);
    }

    @ParameterizedTest
    @ValueSource(ints={5, 1})
    public void increase_three_in_quality_when_5_or_less_days(int sellIn) {
        RetailItem item = createAndUpdate(sellIn, 0);
        assertEquals(3, item.quality);
    }

    @Test
    public void drops_to_zero_after_concert() {
        RetailItem item = createAndUpdate(0, 50);
        assertEquals(0, item.quality);
    }

}

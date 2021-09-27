package com.gildedrose;

public class LegendaryItem extends RetailItem {
    protected LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void update() {
        // Legendary items don't age and don't spoil. :)
    }
}

package com.gildedrose;

public class AgedBrie extends RetailItem {

    protected AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();

        if (expiresIn(0)) {
            increaseQuality();
        }
    }
}

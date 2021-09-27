package com.gildedrose;

public class ConjuredItem extends RetailItem {
    protected ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        decreaseQuality(2);
        if (expiresIn(0)) {
            decreaseQuality(2);
        }
    }
}

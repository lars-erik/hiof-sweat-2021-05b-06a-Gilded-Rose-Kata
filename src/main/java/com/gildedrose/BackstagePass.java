package com.gildedrose;

public class BackstagePass extends RetailItem {
    protected BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();

        if (expiresIn(10)) {
            increaseQuality();
        }

        if (expiresIn(5)) {
            increaseQuality();
        }

        if (expiresIn(0)) {
            decreaseQuality(quality);
        }
    }
}

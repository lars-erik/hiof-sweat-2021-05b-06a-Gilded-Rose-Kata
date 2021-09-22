package com.gildedrose;

public class RetailItem extends Item {
    public RetailItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void update() {
        if (name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }

        age();
        updateQuality();
    }

    private void updateQuality() {
        if (name.equals("Aged Brie")) {
            increaseQuality();

            if (sellIn < 0) {
                increaseQuality();
            }
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {

            increaseQuality();

            if (sellIn < 10) {
                increaseQuality();
            }

            if (sellIn < 5) {
                increaseQuality();
            }

            if (sellIn < 0) {
                quality = quality - quality;
            }
        } else {
            decreaseQuality();
            if (sellIn < 0) {
                decreaseQuality();
            }
        }

    }

    private void age() {
        sellIn = sellIn - 1;
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}

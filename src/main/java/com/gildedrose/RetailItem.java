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

            if (expiresIn(0)) {
                increaseQuality();
            }
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {

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

        } else if (name.equals("Conjured Mana Cake")) {

            decreaseQuality(2);
            if (expiresIn(0)) {
                decreaseQuality(2);
            }

        } else {

            decreaseQuality(1);
            if (expiresIn(0)) {
                decreaseQuality(1);
            }

        }

    }

    private boolean expiresIn(int days) {
        return sellIn < days;
    }

    private void age() {
        sellIn = sellIn - 1;
    }

    private void decreaseQuality(int amount) {
        if (quality > 0) {
            quality = quality - amount;
        }
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}

package com.gildedrose;

public class RetailItem extends Item {
    protected RetailItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static RetailItem create(String name, int sellIn, int quality) {
        switch(name) {
            case "Aged Brie": return new AgedBrie(name, sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert": return new BackstagePass(name, sellIn, quality);
            case "Conjured Mana Cake": return new ConjuredItem(name, sellIn, quality);
            case "Sulfuras, Hand of Ragnaros": return new LegendaryItem(name, sellIn, quality);
        }

        return new RetailItem(name, sellIn, quality);
    }

    void update() {
        age();
        updateQuality();
    }

    protected void updateQuality() {
        decreaseQuality(1);
        if (expiresIn(0)) {
            decreaseQuality(1);
        }
    }

    protected boolean expiresIn(int days) {
        return sellIn < days;
    }

    private void age() {
        sellIn = sellIn - 1;
    }

    protected void decreaseQuality(int amount) {
        if (quality > 0) {
            quality = quality - amount;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}

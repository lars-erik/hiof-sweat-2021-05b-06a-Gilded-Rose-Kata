package com.gildedrose;

public class RetailItem extends Item {
    public RetailItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void update() {
        age();
        updateQuality();
    }

    private void updateQuality() {
        if (!name.equals("Aged Brie")
                && !name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                decreaseQuality();
            }
        } else {
            increaseQuality();

            if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (sellIn < 10) {
                    increaseQuality();
                }

                if (sellIn < 5) {
                    increaseQuality();
                }
            }
        }

        if (sellIn < 0) {
            if (!name.equals("Aged Brie")) {
                if (!name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                        decreaseQuality();
                    }
                } else {
                    quality = quality - quality;
                }
            } else {
                increaseQuality();
            }
        }
    }

    private void age() {
        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            sellIn = sellIn - 1;
        }
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

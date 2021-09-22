package com.gildedrose;

public class RetailItem extends Item {
    public RetailItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateItemQuality() {
        if (!name.equals("Aged Brie")
                && !name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                decreaseQuality();
            }
        } else {
            increaseQuality();

            if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (sellIn < 11) {
                    increaseQuality();
                }

                if (sellIn < 6) {
                    increaseQuality();
                }
            }
        }

        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            sellIn = sellIn - 1;
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

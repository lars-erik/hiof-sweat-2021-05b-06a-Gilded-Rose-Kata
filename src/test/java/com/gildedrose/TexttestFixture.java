package com.gildedrose;

public class TexttestFixture {

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = createItems();

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        String report = createReport(items, app, days);
        System.out.println(report);
    }

    public static String createReport(Item[] items, GildedRose app, int days) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < days; i++) {
            builder.append("-------- day " + i + " --------\n");
            builder.append("name, sellIn, quality\n");
            for (Item item : items) {
                builder.append(item + "\n");
            }
            builder.append("\n");
            app.updateQuality();
        }
        return builder.toString();
    }

    public static Item[] createItems() {
        return new Item[] {
                RetailItem.create("+5 Dexterity Vest", 10, 20), //
                RetailItem.create("Aged Brie", 2, 0), //
                RetailItem.create("Elixir of the Mongoose", 5, 7), //
                RetailItem.create("Sulfuras, Hand of Ragnaros", 0, 80), //
                RetailItem.create("Sulfuras, Hand of Ragnaros", -1, 80),
                RetailItem.create("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                RetailItem.create("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                RetailItem.create("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                RetailItem.create("Conjured Mana Cake", 3, 6)};
    }
}
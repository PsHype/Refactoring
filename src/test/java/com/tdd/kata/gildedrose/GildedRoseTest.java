package com.tdd.kata.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GildedRoseTest {

    @ParameterizedTest
    @MethodSource({"provideAgedBries", "provideBackstagePass", "provideSulfuras", "provideRegularItems"})
    void should_update_item_correctly(TestFixture testFixture) {
        Item item = createItem(testFixture.name, testFixture.sellIn, testFixture.quality);

        new GildedRose(new Item[]{item}).update_quality();

        Item expectedItem = createItem(testFixture.name, testFixture.updatedSellIn, testFixture.updatedQuality);
        assertEquals(expectedItem.toString(), item.toString());
    }

    private static Stream<TestFixture> provideAgedBries() {
        return Stream.of(
                TestFixture.createAgedBrie(2, 0, 1, 1),
                TestFixture.createAgedBrie(2, 49, 1, 50),
                TestFixture.createAgedBrie(2, 50, 1, 50),
                TestFixture.createAgedBrie(0, 20, -1, 22),
                TestFixture.createAgedBrie(-1, 20, -2, 22)
        );
    }

    private static Stream<TestFixture> provideBackstagePass() {
        return Stream.of(
                TestFixture.createBackstagePass(15, 20, 14, 21),
                TestFixture.createBackstagePass(11, 20, 10, 21),
                TestFixture.createBackstagePass(10, 45, 9, 47),
                TestFixture.createBackstagePass(9, 45, 8, 47),
                TestFixture.createBackstagePass(10, 49, 9, 50),
                TestFixture.createBackstagePass(10, 50, 9, 50),
                TestFixture.createBackstagePass(6, 45, 5, 47),
                TestFixture.createBackstagePass(5, 45, 4, 48),
                TestFixture.createBackstagePass(5, 49, 4, 50),
                TestFixture.createBackstagePass(1, 20, 0, 23),
                TestFixture.createBackstagePass(0, 20, -1, 0)
        );
    }

    private static Stream<TestFixture> provideSulfuras() {
        return Stream.of(
                TestFixture.createSulfuras(-1, 50, -1, 50),
                TestFixture.createSulfuras(-1, 1, -1, 1),
                TestFixture.createSulfuras(-2, 1, -2, 1),
                TestFixture.createSulfuras(1, 1, 1, 1)
        );
    }

    private static Stream<TestFixture> provideRegularItems() {
        return Stream.of(
                TestFixture.createRegular("+5 Dexterity Vest", 10, 20, 9, 19),
                TestFixture.createRegular("Elixir of the Mongoose", 2, 0, 1, 0),
                TestFixture.createRegular("Conjured Mana Cake", 3, 6, 2, 5),
                TestFixture.createRegular("1664 Beer", 0, 6, -1, 4),
                TestFixture.createRegular("1664 Beer", -1, 6, -2, 4)
        );
    }

    private static Item createItem(String name, int sellIn, int quality) {
        return new Item(name, sellIn, quality);
    }

    private static class TestFixture {
        String name;
        int sellIn;
        int quality;
        int updatedSellIn;
        int updatedQuality;

        private TestFixture(String name, int sellIn, int quality, int updatedSellIn, int updatedQuality) {
            this.name = name;
            this.sellIn = sellIn;
            this.quality = quality;
            this.updatedSellIn = updatedSellIn;
            this.updatedQuality = updatedQuality;
        }

        public static TestFixture createRegular(String name, int sellIn, int quality, int updatedSellIn, int updatedQuality) {
            return new TestFixture(name, sellIn, quality, updatedSellIn, updatedQuality);
        }

        public static TestFixture createAgedBrie(int sellIn, int quality, int updatedSellIn, int updatedQuality) {
            return new TestFixture("Aged Brie", sellIn, quality, updatedSellIn, updatedQuality);
        }

        public static TestFixture createSulfuras(int sellIn, int quality, int updatedSellIn, int updatedQuality) {
            return new TestFixture("Sulfuras, Hand of Ragnaros", sellIn, quality, updatedSellIn, updatedQuality);
        }

        public static TestFixture createBackstagePass(int sellIn, int quality, int updatedSellIn, int updatedQuality) {
            return new TestFixture("Backstage passes to a TAFKAL80ETC concert", sellIn, quality, updatedSellIn, updatedQuality);
        }
    }
}

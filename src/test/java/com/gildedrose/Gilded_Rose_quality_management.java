package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Gilded_Rose_quality_management {

    @Test
    void decreases_sellin_and_updates_quality() {
        Item[] items = TexttestFixture.createItems();
        GildedRose app = new GildedRose(items);
        String report = TexttestFixture.createReport(items, app, 2);

        String expected = getExpectedReport();

        assertEquals(expected, report);
    }

    private String getExpectedReport() {
        try {
            Path path = Paths.get(getClass().getClassLoader()
                    .getResource("ApprovedSimulation.txt").toURI());
            byte[] fileBytes = new byte[0];
            fileBytes = Files.readAllBytes(path);
            String expected = new String(fileBytes);
            expected = expected.replaceAll("\\r\\n", "\n");
            return expected;
        } catch (IOException | URISyntaxException e) {
            return null;
        }
    }

}
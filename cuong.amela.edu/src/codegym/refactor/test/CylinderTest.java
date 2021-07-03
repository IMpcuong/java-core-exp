package codegym.refactor.test;

import codegym.refactor.source.Cylinder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    @DisplayName("Testing getTotalArea(4, 5)")
    void testGetTotalArea4and5() {
        int radius = 4;
        int height = 5;
        double expected = 226.1946711;

        double result = Cylinder.getTotalArea(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(0, 0)")
    void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 6.283185307;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}

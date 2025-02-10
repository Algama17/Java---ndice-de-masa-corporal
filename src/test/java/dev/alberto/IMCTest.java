package dev.alberto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IMCTest {
@Test
    public void testCalculatePeso() {
        assertEquals(24.22, IMC.calculatePeso(70, 1.70), 0.01);
        assertEquals(29.39, IMC.calculatePeso(90, 1.75), 0.01);
        assertEquals(19.53, IMC.calculatePeso(50, 1.60), 0.01);
        assertEquals(37.04, IMC.calculatePeso(120, 1.80), 0.01);
    }
}
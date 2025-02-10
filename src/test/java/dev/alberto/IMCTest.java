package dev.alberto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class IMCTest {
@Test
    public void testCalculatePeso() {
        assertEquals(24.22, IMC.calculatePeso(70, 1.70), 0.01);
        assertEquals(29.39, IMC.calculatePeso(90, 1.75), 0.01);
        assertEquals(19.53, IMC.calculatePeso(50, 1.60), 0.01);
        assertEquals(37.04, IMC.calculatePeso(120, 1.80), 0.01);
    }
    @Test
    public void testInvalidInputs() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IMC.calculatePeso(70, -1.70);
        });
        assertEquals("La altura debe ser mayor que cero.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            IMC.calculatePeso(-70, 1.70);
        });
        assertEquals("El peso debe ser mayor que cero.", exception.getMessage());
    }
    @Test
    public void testClassifyIMC() {
        assertEquals("Delgadez severa", IMC.classifyIMC(15.99));
        assertEquals("Delgadez moderada", IMC.classifyIMC(16.5));
        assertEquals("Peso normal", IMC.classifyIMC(22.0));
        assertEquals("Obesidad leve", IMC.classifyIMC(32.0));
        assertEquals("Obesidad mórbida", IMC.classifyIMC(40.0));
    }
}
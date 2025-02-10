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
    @Test
    public void testEdgeCases() {
        assertEquals("Delgadez severa", IMC.classifyIMC(15.99));
        assertEquals("Delgadez moderada", IMC.classifyIMC(16.99));
        assertEquals("Peso normal", IMC.classifyIMC(24.99));
        assertEquals("Obesidad leve", IMC.classifyIMC(34.99));
    }
    @Test
    public void testExtremeValues() {
        assertEquals("Delgadez severa", IMC.classifyIMC(0.1));
        assertEquals("Obesidad mórbida", IMC.classifyIMC(100.0));
    }

    @Test
    public void testExtremeHeights() {
        assertEquals(437.5, IMC.calculatePeso(70, 0.4), 0.01);
        assertEquals(1.94, IMC.calculatePeso(70, 6.0), 0.01);
    }

    @Test
    public void testClassifyIMCExactBoundaries() {
        assertEquals("Delgadez severa", IMC.classifyIMC(15.99));
        assertEquals("Delgadez moderada", IMC.classifyIMC(16.0));
        assertEquals("Delgadez leve", IMC.classifyIMC(17.0));
        assertEquals("Peso normal", IMC.classifyIMC(18.5));
        assertEquals("Sobrepeso", IMC.classifyIMC(25.0));
        assertEquals("Obesidad leve", IMC.classifyIMC(30.0));
        assertEquals("Obesidad moderada", IMC.classifyIMC(35.0));
        assertEquals("Obesidad mórbida", IMC.classifyIMC(40.0));
    }
}
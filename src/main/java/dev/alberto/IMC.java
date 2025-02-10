package dev.alberto;


public class IMC {
    public static double calculatePeso(double weight, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero.");
        }
        double imc = weight / Math.pow(height, 2);
        return Math.round(imc * 100.0) / 100.0;
    }
}
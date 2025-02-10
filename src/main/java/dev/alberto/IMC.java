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
    public static String classifyIMC(double imc) {
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc >= 16 && imc < 17) {
            return "Delgadez moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "Delgadez leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad leve";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }
}
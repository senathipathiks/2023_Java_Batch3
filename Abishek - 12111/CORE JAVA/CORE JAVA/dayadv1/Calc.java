package com.dayadv1;

class Calculate {
    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float multiply(int a, float b) {
        return a * b;
    }

    public float multiply(float a, int b) {
        return a * b;
    }
}

public class Calc {
    public static void main(String[] args) {
        Calculate calculator = new Calculate();

        int intResult = calculator.multiply(2, 3);
        System.out.println("2 * 3 = " + intResult);

        float floatResult = calculator.multiply(2.5f, 3.5f);
        System.out.println("2.5f * 3.5f = " + floatResult);

        float mixedResult1 = calculator.multiply(2, 3.5f);
        System.out.println("2 * 3.5f = " + mixedResult1);

        float mixedResult2 = calculator.multiply(2.5f, 3);
        System.out.println("2.5f * 3 = " + mixedResult2);
    }
}

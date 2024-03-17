package CoreTopic;



class Calculator2 {
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

public class Calculatormain {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();

        System.out.println("Integer multiplication: " + calculator.multiply(5, 10));
        System.out.println("Float multiplication: " + calculator.multiply(5.5f, 10.5f));
        System.out.println("Mixed type multiplication: " + calculator.multiply(5, 10.5f));
        System.out.println("Mixed type multiplication: " + calculator.multiply(5.5f, 10));
    }
}


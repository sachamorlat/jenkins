public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }

    public double divide(double num1, double num2) {
        if (num2 != 0.0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }
}

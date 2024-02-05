package activitat4;
/**
* The activitat4 class provides basic mathematical operations.
 */

public class activitat4 {

    // Constants for mathematical calculations
    private static final double PI = 3.14159265358979;
    private static final double E = 2.718281828459;

    /**
     * Default constructor for the activitat4 class.
     */
    public activitat4() {
    }

    /**
     * Adds two numbers.
     * @param a The first operand.
     * @param b The second operand.
     * @return The sum of the two numbers.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     * @param a The minuend.
     * @param b The subtrahend.
     * @return The result of the subtraction.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a The first factor.
     * @param b The second factor.
     * @return The product of the multiplication.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * @param a The dividend.	
     * @param b The divisor.
     * @return The result of the division.
     * @throws ArithmeticException If the divisor is zero.
     */
    public double dividir(double a, double b) throws ArithmeticException {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Intent de divisió entre zero.");
        }
    }

    /**
     * Raises a base to a given exponent.
     * @param base (The base).
     * @param exponent (The exponent).
     * @return The result of the exponentiation.
     */
    public double potencia(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Returns the absolute value of a number.
     * @param valor The input value.
     * @return The absolute value of the input.
     */
    public double valorAbsolut(double valor) {
        return Math.abs(valor);
    }
}


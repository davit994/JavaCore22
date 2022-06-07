package classwork.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(4, 7));
        System.out.println(calculator.minus(4, 7));
        System.out.println(calculator.multiply(4, 7));
        System.out.println(calculator.divide(4, 7));
    }
}

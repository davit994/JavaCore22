package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.plus(10, 20));
        System.out.println(calculator.minus(10, 20));
        System.out.println(calculator.divide(10, 20));
        System.out.println(calculator.multiply(10, 20));
    }
}

package classwork.lesson6;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + ", ");
        }
    }
}

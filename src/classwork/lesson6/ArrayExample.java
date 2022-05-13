package classwork.lesson6;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 11;
        numbers[1] = 12;
        numbers[2] = 13;
        numbers[3] = 14;
        numbers[4] = 15;
        numbers[5] = 16;
        numbers[6] = 17;
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);
        int lastIndex = numbers.length - 1;
        System.out.println(numbers[lastIndex]);
        System.out.println(numbers.length);
    }
}

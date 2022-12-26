package homework.homework3;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;
            }
        }
        System.out.print(a);
        System.out.println();

        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                b++;
            }
        }
        System.out.print(b);
        System.out.println();

        int c = 0;
        for (int i = 0; i < array.length; i++) {
            c = array[i] + c;
        }
        System.out.print(c / array.length);
        System.out.println();

        System.out.println(c);

        System.out.println(array[0]);

        System.out.println(array[array.length - 1]);

        if (array.length % 2 == 0) {
            System.out.print("Нету среднего элемента");
        } else {
            System.out.print(array[array.length / 2]);
        }
    }
}
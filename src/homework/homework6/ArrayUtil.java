package homework.homework6;

public class ArrayUtil {

    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    void min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    void findEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void findOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void countOfEven(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;
            }
        }
        System.out.println(a);
    }

    void countOfOdd(int[] array) {
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                b++;
            }
        }
        System.out.println(b);
    }

    void arithmeticMean(int[] array) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            c = array[i] + c;
        }
        System.out.println(c / array.length);
    }

    void sum(int[] array) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            c = array[i] + c;
        }
        System.out.println(c);
    }

    void firstElement(int[] array) {
        System.out.println(array[0]);
    }

    void lastElement(int[] array) {
        System.out.println(array[array.length - 1]);
    }

    void middleElement(int[] array) {
        if (array.length % 2 == 0) {
            System.out.println("Нету среднего элемента");
        } else {
            System.out.println(array[array.length / 2]);
        }
    }
}
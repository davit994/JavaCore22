package homework.arrayutil;

public class ArrayUtil2 {
    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int evenCount(int[] array) {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    int oddCount(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        return sum;
    }

    int mid(int[] array) {
        int sum = sum(array);
        int mid = sum / array.length;
        return mid;
    }

    int[] sortDesc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmp;
                }
            }
        }
        return numbers;
    }

    int[] sortAsc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmp;
                }
            }
        }
        return numbers;
    }

    char[] removeSpaces(char[] spaceArray) {
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startIndex] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        int length = endIndex - startIndex + 1;
        char[] result = new char[length];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = spaceArray[i];
        }
        return result;
    }
}

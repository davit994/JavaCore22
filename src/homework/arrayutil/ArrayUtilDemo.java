package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil2 arrayUtil2 = new ArrayUtil2();

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        arrayUtil2.print(array);
        int max = arrayUtil2.max(array);
        System.out.println(max);
        int min = arrayUtil2.min(array);
        System.out.println(min);
        int evenCount = arrayUtil2.evenCount(array);
        System.out.println(evenCount);
        int oddCount = arrayUtil2.oddCount(array);
        System.out.println(oddCount);
        int sum = arrayUtil2.sum(array);
        System.out.println(sum);
        int mid = arrayUtil2.mid(array);
        System.out.println(mid);
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int[] sortDesc = arrayUtil2.sortDesc(numbers);
        arrayUtil2.print(sortDesc);
        int[] sortAsc = arrayUtil2.sortAsc(numbers);
        arrayUtil2.print(sortAsc);
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] removeSpaces = arrayUtil2.removeSpaces(spaceArray);
        System.out.println(removeSpaces);
    }
}

package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};

        ArrayUtil au = new ArrayUtil();
        au.print(array);
        au.max(array);
        au.min(array);
        au.findEven(array);
        au.findOdd(array);
        au.countOfEven(array);
        au.countOfOdd(array);
        au.arithmeticMean(array);
        au.sum(array);
        au.firstElement(array);
        au.lastElement(array);
        au.middleElement(array);
    }
}

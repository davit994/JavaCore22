package homework;

public class PracticeDemo {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();

        long seconds = practiceHomework.convert(7);
        System.out.println(seconds);
        int daysInYear = practiceHomework.calcAge(3);
        System.out.println(daysInYear);
        int plusOne = practiceHomework.nextNumber(19);
        System.out.println(plusOne);
        boolean isSameNum = practiceHomework.isSameNum(4, 6);
        System.out.println(isSameNum);
        boolean lessThanOrEqualToZero = practiceHomework.lessThanOrEqualToZero(6);
        System.out.println(lessThanOrEqualToZero);
        boolean reverseBool = practiceHomework.reverseBool(false);
        System.out.println(reverseBool);
        int[] array1 = {4, 5, 7, 9};
        int[] array2 = {7, 4, 9};
        int maxLength = practiceHomework.maxLength(array1, array2);
        System.out.println(maxLength);
    }
}

package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int start = 0;
        int end = spaceArray.length - 1;

        while (spaceArray[start] == ' ') {
            start++;
        }
        while (spaceArray[end] == ' ') {
            end--;
        }

        char[] result = new char[end - start + 1];

        int j = 0;

        for (int i = start; i <= end; i++) {
            result[j] = spaceArray[i];
            System.out.print(result[j]);
            j++;
        }
    }
}

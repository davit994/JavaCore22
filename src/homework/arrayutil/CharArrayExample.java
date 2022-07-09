package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int countOfC = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                countOfC = countOfC + 1;
            }
        }
        System.out.println(countOfC);

        int l = chars.length / 2;
        int o = l + 1;
        System.out.println(chars[l] + ", " + chars[o]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        System.out.println(chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y');

        char[] bobArray = {'b', 'a', 'o', 'l', 'b', 'a', 'b' };
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                System.out.println(true);
            }
        }

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}
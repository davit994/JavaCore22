package chapters.chapter2;

public class BlockTest {
    public static void main(String[] args) {
        int x;
        int y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            y = y - 2;
        }
    }
}

package chapters.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x poqra y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x havasara y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x meca y");
        }
        if (x == y) {
            System.out.println("Cem tena es text@");
        }
    }
}

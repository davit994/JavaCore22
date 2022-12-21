package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {

        int a, b;
        a = 10;
        b = 40;

        if (a > b) {
            System.out.println("max: " + a);
        }

        if (b > a) {
            System.out.println("max: " + b);
        }


        a = 5;
        b = 10;
        for (a = 5; a <= b; a++) {
            System.out.print(a + " ");
        }
        System.out.println();


        System.out.println((char) a);
        System.out.println((char) b);


        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a != b");
        }
    }
}

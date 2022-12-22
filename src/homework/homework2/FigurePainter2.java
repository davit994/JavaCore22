package homework.homework2;

public class FigurePainter2 {
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print(" ");
            }
            for (int l = 3; l > k; l--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
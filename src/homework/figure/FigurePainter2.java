package homework.figure;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4 - k; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

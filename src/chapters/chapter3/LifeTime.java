package chapters.chapter3;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int у = -1;
            System.out.println("Y = : " + у);
            у = 100;
            System.out.println("Y = " + у);
        }
    }
}

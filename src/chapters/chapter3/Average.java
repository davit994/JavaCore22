package chapters.chapter3;

public class Average {
    public static void main(String[] args) {
        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (int i = 0; i < 5; i++) {
            result = result + numbers[i];
            // 0: result = 0 + 10.1 => 10.1
            // 1: result = 10.1 + 11.2 => 21.3
            // 2: result = 21.3 + 12.3 => 33.6
            // 3: result = 33.6 + 13.4 => 47
            // 4: result = 47 + 14.5 => 61.5
        }
        System.out.println("Mijin arjeqne " + result / 5);
    }
}

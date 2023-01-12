package chapters.chapter5;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int х : nums) {
            System.out.println("Знaчeниe равно: " + х);
            sum += х;
        }
        System.out.println("Cyммa равна: " + sum);
    }
}

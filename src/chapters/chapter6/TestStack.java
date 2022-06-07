package chapters.chapter6;

public class TestStack {
    public static void main(String[] args) {
        Stack mysteck1 = new Stack();
        Stack mysteck2 = new Stack();

        for (int i = 0; i < 10; i++) mysteck1.push(i);
        for (int i = 10; i < 20; i++) mysteck2.push(i);

        System.out.println("Content Steck mysteck1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mysteck1.рор());
        System.out.println("Content Steck mysteck2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mysteck2.рор());
    }
}

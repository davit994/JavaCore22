package chapters.chapter6;

public class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Steck is full");
        else
            stck[++tos] = item;
    }

    int рор() {
        if (tos < 0) {
            System.out.println("Steck is not full");
            return 0;
        } else
            return stck[tos--];
    }
}

package chapters.chapter7;

public class Stack {
    private final int[] stck = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        }
        else {
            stck[++tos] = item;
        }
    }

    int рор() {
        if (tos < 0) {
            System.out.println("Stack is not full");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

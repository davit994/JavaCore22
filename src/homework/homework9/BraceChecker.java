package homework.homework9;

public class BraceChecker {

    private String text;
    private Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                switch (c) {
                    case ')':
                        char p1 = stack.pop();
                        if (p1 != '(') {
                            System.out.println("Error: opened " + p1 + " but closed " + c + " at " + i);
                        }
                        break;
                    case '}':
                        char p2 = stack.pop();
                        if (p2 != '{') {
                            System.out.println("Error: opened " + p2 + " but closed " + c + " at " + i);
                        }
                        break;
                    case ']':
                        char p3 = stack.pop();
                        if (p3 != '[') {
                            System.out.println("Error: opened " + p3 + " but closed " + c + " at " + i);
                        }
                        break;
                }
            }
        }
        int s = stack.getSize();
        if (s > 0) {
            System.out.println("Error. Some braces are not closed");
        }
    }
}

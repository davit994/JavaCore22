package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 0; i < 20; i++) {
            dynamicArray.add(i + 1);
        }

        System.out.println(dynamicArray.getIndexByValue(4));
    }
}

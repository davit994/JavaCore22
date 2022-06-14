package homework;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(3);
        dynamicArray.add(7);
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.printArray();
        System.out.println();

        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getByIndex(5));
        System.out.println(dynamicArray.getFirstIndexByValue(3));
        dynamicArray.set(2,7);
        dynamicArray.printArray();
        System.out.println();
        dynamicArray.add(1, 89);
        dynamicArray.printArray();
        System.out.println();
        dynamicArray.delete(4);
        dynamicArray.printArray();
    }
}

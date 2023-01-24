package homework.homework8;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong index");
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong index");
        } else {

            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong index");
        } else {
            array[index] = value;
        }
    }

    public void add(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong index");
        } else {
            int[] newArray = new int[array.length + 1];
            for (int i = newArray.length - 1; i > index; i--) {
                newArray[i] = array[i - 1];
            }
            newArray[index] = value;
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            size++;
        }
    }

    public boolean exists(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

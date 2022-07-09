package homework.books;

public class BookStorage {

    private Book[] array = new Book[10];
    private int count = 0;

    public void add(Book book) {
        if (count == array.length) {
            increaseArray();
        }
        array[count++] = book;
    }

    public int getCount() {
        return count;
    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < count; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index >= count) {
            System.out.println("invalid index");
        } else {
            for (int i = index; i < count; i++) {
                array[i] = array[i + 1];

            }
            count--;
        }
    }
    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i < count; i++) {
            if (array[i].getAuthor().getName().equals(authorName)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printBooksByGenre(String genre) {
        for (int i = 0; i < count; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printBooksByPriceRange(double min, double max) {
        for (int i = 0; i < count; i++) {
            if (array[i].getPrice() > min && array[i].getPrice() < max) {
                System.out.println(array[i]);
            }
        }
    }



    public Book getBookByIndex(int index) {
        if (index < 0 || index >= count) {
            return null;
        }
        return array[index];
    }
}

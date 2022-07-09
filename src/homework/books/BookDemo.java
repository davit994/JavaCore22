package homework.books;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_BOOK + " for add book");
            System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private static void printBooksByAuthorName() {
        System.out.println("please input author name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName);
    }

    private static void printBooksByGenre() {
        System.out.println("please input genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        System.out.println("please input min price");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("please input max price");
        double max = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(min, max);
    }

    private static void addBook() {

        System.out.println("please input title");
        String title = scanner.nextLine();
        System.out.println("please input author name");
        String authorName = scanner.nextLine();
        System.out.println("please input author surname");
        String authorSurname = scanner.nextLine();
        System.out.println("please input email");
        String email = scanner.nextLine();
        System.out.println("please input gender");
        String gender = scanner.nextLine();
        System.out.println("please input price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("please input genre");
        String genre = scanner.nextLine();

        Author author = new Author(authorName, authorSurname, email, gender);
        Book book = new Book(title, author, price, count, genre);
        bookStorage.add(book);
        System.out.println("book created");
    }
}

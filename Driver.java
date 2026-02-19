import java.util.ArrayList;
import java.util.HashSet;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Book> books = DatasetReader.readBooks("data.csv");

        System.out.println("Total books by George Orwell: " +
                totalBooksByAuthor("George Orwell", books));

        printAllAuthors(books);

        printBooksByAuthor("George Orwell", books);

        printBooksByRating(4.7, books);

        printPriceByAuthor("George Orwell", books);
    }

    // 1️⃣ Total number of books by author
    public static int totalBooksByAuthor(String author,
                                         ArrayList<Book> books) {

        int count = 0;

        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                count++;
            }
        }

        return count;
    }

    // 2️⃣ Print all authors
    public static void printAllAuthors(ArrayList<Book> books) {

        HashSet<String> authors = new HashSet<>();

        for (Book b : books) {
            authors.add(b.getAuthor());
        }

        System.out.println("\nAll Authors:");
        for (String author : authors) {
            System.out.println(author);
        }
    }

    // 3️⃣ Names of all books by author
    public static void printBooksByAuthor(String author,
                                          ArrayList<Book> books) {

        System.out.println("\nBooks by " + author + ":");

        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(b.getTitle());
            }
        }
    }

    // 4️⃣ Books with specific rating
    public static void printBooksByRating(double rating,
                                          ArrayList<Book> books) {

        System.out.println("\nBooks with rating " + rating + ":");

        for (Book b : books) {
            if (b.getUserRating() == rating) {
                b.printDetails();
            }
        }
    }

    // 5️⃣ Names and prices of books by author
    public static void printPriceByAuthor(String author,
                                          ArrayList<Book> books) {

        System.out.println("\nBooks and Prices by " + author + ":");

        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(b.getTitle() +
                        " - $" + b.getPrice());
            }
        }
    }
}

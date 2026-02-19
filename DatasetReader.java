import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DatasetReader {

    public static ArrayList<Book> readBooks(String fileName) {

        ArrayList<Book> books = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 7) {

                    String title = data[0];
                    String author = data[1];
                    double rating = Double.parseDouble(data[2]);
                    int reviews = Integer.parseInt(data[3]);
                    double price = Double.parseDouble(data[4]);
                    int year = Integer.parseInt(data[5]);
                    String genre = data[6];

                    Book book = new Book(title, author, rating,
                            reviews, price, year, genre);

                    books.add(book);
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }
}

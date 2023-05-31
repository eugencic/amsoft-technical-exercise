public class Book extends Product {
    private String author;
    private String genre;

    public Book(String name, double price, int quantity, String author, String genre) {
        super(name, price, quantity);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}

public class Book {
    // Attributes
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Getter methods (optional, but can be useful for accessing the attributes)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }


    public static void main(String[] args) {
        // Instantiate three Book objects with different values using the constructor
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print out the details of each book
        System.out.println("Book 1:");
        printBookDetails(book1);

        System.out.println("\nBook 2:");
        printBookDetails(book2);

        System.out.println("\nBook 3:");
        printBookDetails(book3);
    }

    // Helper method to print book details
    private static void printBookDetails(Book book) {
        System.out.println("Title: \"" + book.getTitle() + "\"");
        System.out.println("Author: \"" + book.getAuthor() + "\"");
        System.out.println("Year Published: " + book.getYearPublished());
        System.out.println("Price: $" + book.getPrice());
    }
}

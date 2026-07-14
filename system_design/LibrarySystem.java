package system_design;
class Book {
    private String title;
    private String author;
    private double price;

    /**
     *constructor for book
     * @param title book's title
     * @param author books's author
     * @param price book's price
     */
    public Book(String title, String author, double price) {
       this.title = title;
       this.author = author;
       this.price = price;
    }

    /**
     *title getter
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     *title setter
     * @param title new title
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * author getter
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * author setter
     * @param author new author
     */
    public void setAuthor(String author){
        this.author = author;
    }

    /**
     * price getter
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * price setter
     * @param price new price
     */
    public void setPrice(double price){
        this.price = price;
    }
}
class Library {
    protected String libraryName;
    private Book[] books;
    private int count;

    /**
     * library's constructor
     * @param libraryName name of the library
     * @param capacity capacity of the library
     */
    public Library(String libraryName, int capacity) {
        this.libraryName = libraryName;
        this.books = new Book[capacity];
        this.count = 0;
    }

    /**
     * adds a book to library
     * @param book the book to add
     */
    public void addBook(Book book){
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("the library is full");
        }
    }

    /**
     * shows the list of books in the library
     */
    void showBooks() {
        System.out.println(libraryName + " books:");
        for (int i = 0; i < count; i++){
            System.out.println(books[i]);
        }
    }
    public static class LibrarySystem {
        public static void main(String[] args) {
            Book book1 = new Book("Harry Potter", "J.K. Rowling", 12.99);
            Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 10.50);
            Book book3 = new Book("1984", "George Orwell", 9.99);
            Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", 8.75);
            Book book5 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 7.99);

            Library library1 = new Library("Library 1", 3);
            library1.addBook(book1);
            library1.addBook(book2);
            library1.addBook(book3);

            Library library2 = new Library("Library 2", 3);
            library2.addBook(book4);
            library2.addBook(book5);
            library2.addBook(book1);

            library1.showBooks();
            System.out.println();
            library2.showBooks();
        }
    }
}

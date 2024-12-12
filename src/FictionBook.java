public class FictionBook {
    private Book book;
    private String category;

    public FictionBook() {
        this.book = new Book();
    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        this.book = new Book(bookCode, name, price, author);
        this.category = category;
    }

    public String getBookCode() {
        return book.getBookCode();
    }

    public void setBookCode(String bookCode) {
        book.setBookCode(bookCode);
    }

    public String getName() {
        return book.getName();
    }

    public void setName(String name) {
        book.setName(name);
    }

    public double getPrice() {
        return book.getPrice();
    }

    public void setPrice(double price) {
        book.setPrice(price);
    }

    public String getAuthor() {
        return book.getAuthor();
    }

    public void setAuthor(String author) {
        book.setAuthor(author);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "bookCode='" + getBookCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", author='" + getAuthor() + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
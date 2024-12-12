public class ProgrammingBook {
    private Book book;
    private String language;
    private String framework;

    public ProgrammingBook() {
        this.book = new Book();
    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        this.book = new Book(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "bookCode='" + getBookCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", author='" + getAuthor() + '\'' +
                ", language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}
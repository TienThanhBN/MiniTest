public class Main {
    public static void main(String[] args) {
            class Library {

            public static class Book {
                private String bookCode;
                private String name;
                private double price;
                private String author;

                public Book() {
                }

                public Book(String bookCode, String name, double price, String author) {
                    this.bookCode = bookCode;
                    this.name = name;
                    this.price = price;
                    this.author = author;
                }

                public String getBookCode() {
                    return bookCode;
                }

                public void setBookCode(String bookCode) {
                    this.bookCode = bookCode;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }

                @Override
                public String toString() {
                    return "Book{" +
                            "bookCode = '" + bookCode + '\'' +
                            ", name = '" + name + '\'' +
                            ", price = " + price +
                            ", author = '" + author + '\'' +
                            '}';
                }
            }

            public static class ProgrammingBook {
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
                            "bookCode = '" + getBookCode() + '\'' +
                            ", name = '" + getName() + '\'' +
                            ", price = " + getPrice() +
                            ", author = '" + getAuthor() + '\'' +
                            ", language = '" + language + '\'' +
                            ", framework = '" + framework + '\'' +
                            '}';
                }
            }

            public static class FictionBook {
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
                            "bookCode = '" + getBookCode() + '\'' +
                            ", name = '" + getName() + '\'' +
                            ", price = " + getPrice() +
                            ", author = '" + getAuthor() + '\'' +
                            ", category = '" + category + '\'' +
                            '}';
                }
            }

            public static void main(String[] args) {

                Book book = new Book("001", "Java Basics", 29.99, "Author A");
                System.out.println(book);

                ProgrammingBook progBook = new ProgrammingBook("002", "Effective Java", 45.99, "Joshua Bloch", "Java", "Spring");
                System.out.println(progBook);

                FictionBook fictionBook = new FictionBook("003", "The Great Gatsby", 10.99, "F. Scott Fitzgerald", "Classic");
                System.out.println(fictionBook);
            }
        }
    }
}
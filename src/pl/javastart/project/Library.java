package pl.javastart.project;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book("W pustyni i w puszczy","Henryk Sienkiewicz",
                2010,296,"Greg","9788373271890");

        Book book2 = new Book("Java. Efektywe programowanie. Wydanie II","Joshua Bloch",
                2009,352,"Helion","9788324620845");

        Book book3 = new Book("SCJP Sun Certified Programer for Java 6 Study Guide","Bert Bates, Katherine Sierra",
                2008,851,"McGrawm-Hill Osborne Media","9780071591065");


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);
    }
}

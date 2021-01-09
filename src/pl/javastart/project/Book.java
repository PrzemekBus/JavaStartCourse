package pl.javastart.project;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String booktitle, String bookAuthor, int bookRelease,
         int bookPages, String bookPublisher, String bookIsbn){
        title = booktitle;
        author = bookAuthor;
        releaseDate =  bookRelease;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = bookIsbn;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}

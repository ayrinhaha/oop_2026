package activity1;

class Book {

    String title;
    String author;
    String isbn;
    String publicationDate;

    public Book(String title, String author, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    public Book(){

    }

    void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publication date: " + publicationDate);

    }

}

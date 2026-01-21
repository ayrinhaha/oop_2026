package activity1;

class Book {

    String title;
    String author;
    String isbn;
    String publicationDate;

    // constructor with paramenters
    public Book(String title, String author, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    
    //constructor without parameters
    public Book() {

    }


    //print book info
    void printBookInfo() {
        System.out.println("**************************************");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publication date: " + publicationDate);

    }

}

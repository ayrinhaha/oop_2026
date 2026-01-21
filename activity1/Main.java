package activity1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "To Kill a Mockingbird";
        book1.author = "Harper Lee";
        book1.isbn = "9780060935467"; 
        book1.publicationDate = "July 11, 1960";

        Book book2 = new Book();
        book2.title = "Fire & Blood";
        book2.author = "George R.R. Martin";
        book1.isbn = "9781524796280";
        book2.publicationDate = "November 20, 2018"; //without parameters

        Book book3 = new Book("Atomic Habits","James Clear", "9780735211292", "October 16, 2018" );
        Book book4 = new Book("Goldilocks and the Three Bears","Jan Brett", "9780399220333", "April 1, 1992" ); //with parameters
        
        
        book1.printBookInfo();
        book2.printBookInfo();
        book3.printBookInfo();
        book4.printBookInfo(); // call the book information

    }
}

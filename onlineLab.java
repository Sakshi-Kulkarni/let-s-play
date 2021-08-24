
// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
import java.util.*;

class Library {
    Scanner sc = new Scanner(System.in);

    String[] books;

    int noOfBooks;

    public Library() {

        this.noOfBooks = 10;

        this.books = new String[100];

        this.books[0] = "The book theif";
        this.books[1] = "A thousand splendid suns";
        this.books[2] = "The hunger games";
        this.books[3] = "Game of Throns";
        this.books[4] = "victorious";
        this.books[5] = "The Vampire daires";
        this.books[6] = "Peaky Blinders";
        this.books[7] = "Ignited Minds";
        this.books[8] = "Fuck you";
        this.books[9] = "We Don't talk Anymore";

    }

    public void addBook() {
        System.out.println("Enter the Name of the Book");
        String nameOfBook = sc.nextLine();
        this.books[noOfBooks++] = nameOfBook;
        System.out.println("The Book has been successfully added In the Lab");
    }

   public void issueBook() {
        System.out.print("Enter the name of the Book you want to issue: ");

        String issuebookName = sc.nextLine();

        for (int i = 0; i < this.books.length; i++) {

            if (issuebookName.equals(books[i])) {

                System.out.println("The book has been issued");

                this.books[i] = null;

                noOfBooks--;

                return;
            }
        }
        System.out.println("This book does not exist");

    }

    public void returnBook() {
        System.out.print("Enter the name of the book you want to return: ");

        String rebook = sc.nextLine();

        for (String e : books) {

            if (rebook.equals(e)) {

                System.out.println("This book is already available with us");

                return;

            }

        }

        this.books[noOfBooks++] = rebook;

        System.out.println("The book has been successfully added");
    }

     public void showAvailableBooks() {
        System.out.println("Available books are: ");

        for (String element : books) {

            if (element == null) {

                break;

            }

            System.out.println("- " + element);

        }

    }
}

public class onlineLab {
    public static void main(String[] args) {
        Library lib = new Library();

        Scanner sca = new Scanner(System.in);

        boolean exit = false;

        while (exit == false) {

            System.out.println();

            System.out.println("1. Show all the Available Books, 2. Add a Book, 3. Issue a book, 4. Return a book");

            System.out.print("What do you want to do: ");

            int inp = sca.nextInt();

            System.out.println();

            if (inp == 1) {
                lib.showAvailableBooks();
            }

            else if (inp == 2) {
                lib.addBook();
            }

            else if (inp == 3) {
                lib.issueBook();
            }

            else if (inp == 4) {
                lib.returnBook();
            }

            else {
                System.out.println("Wrong input");
            }

        }

        sca.close();

    }

}
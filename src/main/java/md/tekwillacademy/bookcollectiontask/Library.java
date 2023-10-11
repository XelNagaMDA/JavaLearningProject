package md.tekwillacademy.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> libraryStock;
    private String libraryName;

    public Library(String name) {
        libraryName = name;
        libraryStock = new ArrayList<>();
    }

    public void addBook(Book bookElement) {
        boolean addOperationStatus = libraryStock.add(bookElement);
        if (addOperationStatus) {
            System.out.println("The book: " + bookElement.getTitle() + " was added to the library.");
        } else {
            System.out.println("The book: " + bookElement.getTitle() + " wasn't added to the library.");
        }
    }

    public int getLibraryBookNumber() {
        return libraryStock.size();
    }

    public boolean isTheBookPresentInOurLibrary(Book book) {
        return libraryStock.contains(book);
    }

    public void removeBookIfPresent(Book book) {
        if (libraryStock.remove(book)) {
            System.out.println("The book: " + book.getTitle() + " was removed from the library.");
        } else {
            System.out.println("There is no " + book.getTitle() + " book in our library to be removed.");
        }
    }

    public void printAllTheBooksFromTheLibrary() {
        for (int i = 0; i < libraryStock.size(); i++) {
            libraryStock.get(i).printTheBookDetails();

        }
    }
}

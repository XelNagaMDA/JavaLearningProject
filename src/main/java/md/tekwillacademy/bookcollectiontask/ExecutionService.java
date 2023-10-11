package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {

        Book book1 = new Book("'Lord Of The Rings: The Return Of The King'", "'J.R.R. Tolkien'");
        Book book2 = new Book("'Anxious People'", "'F. Backman'");
        Book book3 = new Book("'Dune'", "'F. Herbert'");
        Book book4 = new Book("'It'", "'S. King'");
        Book book5 = new Book("'Foundation'", "'I. Asimov'");


        System.out.println(book3.getTitle());
        book1.printTheBookDetails();
        book2.printTheBookDetails();
        book3.printTheBookDetails();
        book4.printTheBookDetails();
        book5.printTheBookDetails();

        Library cartier = new Library("Cartier");

        cartier.addBook(book5);
        cartier.addBook(book5);
        cartier.addBook(book4);

        System.out.println(cartier.getLibraryBookNumber());
        System.out.println(cartier.isTheBookPresentInOurLibrary(book2));

        cartier.removeBookIfPresent(book1);

        cartier.removeBookIfPresent(book5);
        System.out.println(cartier.getLibraryBookNumber());

        cartier.printAllTheBooksFromTheLibrary();

        Library librarius = new Library("Librarius");

        librarius.addBook(book1);
        librarius.addBook(book3);
        librarius.addBook(book4);

        System.out.println(librarius.getLibraryBookNumber());

        librarius.printAllTheBooksFromTheLibrary();

        Map<String, Library> librariesMap = new HashMap<>();

        librariesMap.put("Stefan Cel Mare", cartier);
        librariesMap.put("Dacia", librarius);


        librariesMap.get("Stefan Cel Mare").printAllTheBooksFromTheLibrary();
        System.out.println(librariesMap.get("Dacia").isTheBookPresentInOurLibrary(book2));


        int[] numberTable = new int[6];

        numberTable[0] = 23;
        numberTable[1] = 66;
        numberTable[2] = 43;
        numberTable[3] = 4;
        numberTable[4] = 11;
        numberTable[5] = 3;

        System.out.println(IntNumberArrayService.detectMin(numberTable));

        System.out.println(IntNumberArrayService.calculateAverage(numberTable));


    }
}

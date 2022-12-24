package libraryServiceIpm;

import Entities.Book;
import Entities.Library;
import predicate.IsBookExistPredicate;


import java.util.List;
import java.util.function.Predicate;

public class LibraryServicesIpm {


    static IsBookExistPredicate isBookExistPredicate = new IsBookExistPredicate(Library.getListOfBooks());
    public static List<Book> addBook(Book book, Predicate<Book> predicate){
         if(isBookExistPredicate.test(book)){
             book.setCopies(book.getCopies() + 1);
         }
         else {
             Library.getListOfBooks().add(book);
         }
         return Library.getListOfBooks();
    }
}

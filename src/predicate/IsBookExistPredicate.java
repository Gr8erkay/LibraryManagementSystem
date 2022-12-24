package predicate;

import Entities.Book;

import java.util.List;
import java.util.function.Predicate;

public class IsBookExistPredicate implements Predicate<Book> {

    private List<Book> books;
    public IsBookExistPredicate(List<Book> book){
        this.books = book;
    }

    @Override
    public boolean test(Book book) {
        return this.books.contains(book);
    }

}

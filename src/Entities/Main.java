package Entities;
import enums.Status;
import libraryServiceIpm.LibraryServicesIpm;
import predicate.IsBookExistPredicate;


import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.RESET;
import static java.awt.Color.BLUE;

public class Main {

    public static void main(String[] args) {

        Book prose = new Book("Things Fall Apart", "Chinua Achebe", 3);
        Book drama = new Book("Incorruptible Judge", "Unknown", 10);
        Book documentary = new Book("There Was a Country", "Chinua Achebe", 1);

        LibraryUser ade = new LibraryUser("Ade", 20, drama, Status.TEACHER);

        LibraryServicesIpm libraryServicesIpm = new LibraryServicesIpm();
        IsBookExistPredicate predicate = new IsBookExistPredicate(Library.getListOfBooks());
        libraryServicesIpm.addBook(prose, predicate);
        libraryServicesIpm.addBook(prose, predicate);
        libraryServicesIpm.addBook(drama, predicate);
        libraryServicesIpm.addBook(drama, predicate);

        System.out.println(Library.getListOfBooks());



    }
}

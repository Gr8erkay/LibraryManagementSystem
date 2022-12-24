package Entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private static ArrayList<Book> listOfBooks = new ArrayList<>();

    private static  ArrayList<LibraryUser> libraryUserList = new ArrayList<>();

    public static ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        Library.listOfBooks = listOfBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "listOfBooks=" + listOfBooks +
                '}';
    }
}


//ArrayList<Integer> listOfBooks = new ArrayList<>();
package Entities;

import enums.Status;

public class LibraryUser {
    private String name;
    private int age;

    private Status status;

    private Book book;

    public LibraryUser(String name, int age, Book book, Status status) {
        this.name = name;
        this.age = age;
        this.book = book;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status=" + status +
                ", book=" + book +
                '}';
    }
}

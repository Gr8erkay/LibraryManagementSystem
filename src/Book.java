public class Book {
    private String bookId;
    private String title;
    private String author;
    private int copies;
    private boolean availableStatus;

    public Book(){

    }

    public Book(String bookId, String title, String author, int copies){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.copies = copies;

    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString(){
        return "Book{" +
                "BookId='" + bookId + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Copies='" + copies + '\'' +
                ", Availability='" + availableStatus + '\'' +
                '}';

    }
}

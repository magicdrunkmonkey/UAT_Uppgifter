package files;


import java.io.Serializable;

public class Book implements Serializable {

    //public static final long serialVerionUID = 234234324234;

    private String author;
    private String title;
    private int price;


    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book { \n\tAuthor: " + author + "\n\tTitle: " + title + "\n";
    }
}

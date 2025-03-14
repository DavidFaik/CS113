import java.util.Scanner;

public class Book {
    private String title;
    private int pages;

    // Default constructor
    public Book() {
        this.title = "Java Programming";
        this.pages = 200;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for pages
    public int getPages() {
        return pages;
    }

    // Setter for pages
    public void setPages(int pages) {
        this.pages = pages;
    }

    // toString method
    public String toString() {
        return "Title: " + title + ", Pages: " + pages;
    }
}
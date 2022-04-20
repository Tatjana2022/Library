import java.util.*;
import java.io.*;

public class Book implements Cloneable {
    protected String authors;
    protected String bookName;
    protected String genre;
    protected int publicYear;
    public Book(String authors, String bookName, String genre, int publicYear) {
        this.authors = authors;
        this.bookName = bookName;
        this.genre = genre;
        this.publicYear = publicYear;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public String getAuthors() {
        return this.authors;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName() {
        return this.bookName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }
    public int getPublicYear() {
        return this.publicYear;
    }

    public String toString() {
        return this.authors + " - " + this.bookName  + "," + this.genre + ", " + this.publicYear + ";";
    }

    public Book clone(){
        try{
            return (Book) super.clone();
        } catch ( CloneNotSupportedException cnse) {
            System.out.println("Cloning not supported");
        }
        return null;
    }





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
/*
    public static void main(String args[]) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Agata Christie","The Secret of Chimneys"," criminal", 1944));
        books.add(new Book("Luisas-Ferdinandas Selinas","Kelionė į nakties pakraštį"," drama", 1932));
        books.add(new Book("Andrė Malro","Žmogaus būtis"," criminal", 1933));
        books.add(new Book("Antuanas de Sent Egziuperi","Mažasis princas"," drama", 1943));
        books.add(new Book("Margaret Mitčel","Vėjo nublokšti"," drama", 1936));
        books.add(new Book("Agata Christie","The Secret"," criminal", 1949));
        books.add(new Book("Agata Christie","The Secret of Chimneys"," criminal", 1909));
    }

 */
 }
/*
    public Book clone(){
        try{
            return (Book) super.clone();
        } catch ( CloneNotSupportedException cnse) {
            System.out.println("Cloning not supported");
        }
        return null;
    }
 */





import java.util.*;
import java.io.*;

class BookCompareByAuthor implements Comparator<Book> {
    public int compare(Book name1, Book name2) {
        if (!name1.getAuthors().equalsIgnoreCase(name2.getAuthors())) {
            return  name1.getAuthors().compareTo(name2.getAuthors());
        } else if (name1.getPublicYear() != (name2.getPublicYear())) {
            return Integer.compare(name1.getPublicYear(), name2.getPublicYear());
        } else {
            return name1.getBookName().compareTo(name2.getBookName());
        }
    }
}
public class Catalogue  {
    protected ArrayList<Book> bookList = new ArrayList<>();

    public Catalogue(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String authName = sc.nextLine();
            String authLastName = sc.nextLine();
            String genre = sc.nextLine();
            int publicYear = Integer.parseInt(sc.nextLine());
            Book book = new Book(authName, authLastName, genre, publicYear);
            bookList.add(book);
        }
        sc.close();
    }

    public void print(){
        for(int i = 0; i < bookList.size(); ++i){
            Book book = bookList.get(i);
            System.out.println(book);
        }
        System.out.println();
    }

    public void sort(){
        Collections.sort(bookList, new Comparator<Book>(){
                    public int compare(Book name1, Book name2){
                        return name1.getAuthors().compareTo(name2.getAuthors());
                    }
                }
        );
    }
    public void sort(Comparator<Book> cmp){
        Collections.sort(bookList, cmp);
    }

    public static void main(String args[]) {
        try{
            Catalogue bookList = new Catalogue(new File("file.txt"));

            bookList.sort();
            bookList.print();

            Comparator<Book> cmpPublicYear = new Comparator<Book>(){
                public int compare(Book name1, Book name2){
                    return Integer.compare(name1.getPublicYear(), name2.getPublicYear());
                }
            };
            bookList.sort(cmpPublicYear);
            bookList.print();

            Comparator<Book> cmpBookName = new Comparator<Book>(){
                public int compare(Book name1, Book name2){
                    return name1.getBookName().compareTo(name2.getBookName());
                }
            };
            bookList.sort(cmpBookName);
            bookList.print();

        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Unexpected error, sorry!");
        }
    }
}

















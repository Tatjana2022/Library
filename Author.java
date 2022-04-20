import java.util.*;
import java.io.*;

public class Author extends Person {
    protected String authName;
    protected String authLastName;
    protected ArrayList<Book> books = new ArrayList<>();

    public Author(String authName, String authLastName){
        super (authName, authLastName);
        this.authName = authName;
        this.authLastName = authLastName;
    }
    public String getAuthName() {
        return this.authName = authName;
    }
    public void setAuthName(String authName) {
        if (Character.isUpperCase(authName.charAt(0))) {
            this.authName = authName;
        } else {
            throw new IllegalArgumentException("Vardas rašomas iš didžiosios raidės");
        }
    }
    public String getAuthLastName() {
        return this.authLastName;
    }
    public void setAuthLastName(String authLastName) {
        if (Character.isUpperCase(authLastName.charAt(0))) {
            this.authLastName = authLastName;
        } else {
            throw new IllegalArgumentException("Pavardė rašoma iš didžiosios raidės");
        }
    }
    public Person clone() {
        return (Author) (super.clone());
    }
    public String toString(){
        return  super.toString();
    }


    public static void main(String args[]) {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author(" Agata", "Christie"));
        authors.add(new Author("Luisas-Ferdinandas", " Selinas"));
        authors.add(new Author("Andrė ", "Malro"));
        authors.add(new Author("Antuanas de Sent", "Egziuperi"));
        System.out.println(authors);


        Author persona = new Author("Jonas", "Jonaitis");
        Author personaCopy = (Author)persona.clone();
        System.out.println(personaCopy);


    }
}


/*
//Collections.sort(authors, new AuthorCompareByLastName());
class AuthorCompareByLastName implements Comparator<Author> {
    public int compare(Author name1, Author name2) {
        if (!name1.getAuthLastname().equalsIgnoreCase(name2.getAuthLastname()) ) {
            return name1.getAuthLastname().compareTo(name2.getAuthLastname());
        } else{
            return name1.getAuthName().compareTo(name2.getAuthName());
    }
}
 */
//Collections.sort(authors);
//Author authors1 = new Author("Jonas", "Jonaitis", "Parašyta");
/*
public Author implements Comparable<Authors> {
            public int compareTo(Author name2) {
                if (!this.getAuthLastname().equalsIgnoreCase(name2.getAuthLastname()) ) {
                    return this.getAuthLastname().compareTo(name2.getAuthLastname());
                } else if (!this.getAuthName().equalsIgnoreCase(name2.getAuthName())) {
                    return this.getAuthName().compareTo(name2.getAuthName());
                } else {
                    return Integer.compare(this.getAge(), name2.getAge());
                }
            }
        }
 */
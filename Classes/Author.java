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


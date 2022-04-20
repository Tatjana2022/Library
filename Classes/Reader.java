import java.util.*;
import java.io.*;
class Reader extends Person {
    protected String readerName;
    protected String readerLastName;
    protected ArrayList<Book> currently = new ArrayList<>();
    protected ArrayList<Book> unRead = new ArrayList<>();

    public Reader(String readerName, String readerLastName){
        super (readerName, readerLastName);
        this.readerName = readerName;
        this.readerLastName = readerLastName;
    }
    public String getReaderName() {
        return this.readerName = readerName;
    }
    public void setReaderName(String readerName) {
        if (Character.isUpperCase(readerName.charAt(0))) {
            this.readerName = readerName;
        } else {
            throw new IllegalArgumentException("Vardas rašomas iš didžiosios raidės");
        }
    }
    public String getReaderLastName() {
        return this.readerLastName = readerLastName;
    }
    public void setReaderLastName(String readerLastName) {
        if (Character.isUpperCase(readerLastName.charAt(0))) {
            this.readerLastName = readerLastName;
        } else {
            throw new IllegalArgumentException("Vardas rašomas iš didžiosios raidės");
        }
    }
    public Reader clone() {
        return (Reader) (super.clone());
    }
    public String toString(){
        return  super.toString();
    }

    public static void main(String args[]) {
        ArrayList<Reader> reader = new ArrayList<>();
        reader.add(new Reader("Petras", "Petraitis"));
        System.out.println(reader);

    }
}


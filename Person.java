import java.util.*;
import java.io.*;


public class Person implements Comparable<Person>, Cloneable {
    protected String name;
    protected String lastname;
    protected int age;

    public Person(String name, String lastname) {
        setName(name);
        setLastname(lastname);
        setAge(0);
    }
    public Person(String name, String lastname, int age) {
        setName(name);
        setLastname(lastname);
        setAge(age);
    }
    public String getName() {
        return this.name = name;
    }
    public void setName(String name) {
        if (Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Vardas rašomas iš didžiosios raidės");
        }
    }
    public String getLastname() {
        return this.lastname;
    }
    public void setLastname(String lastname) {
        if (Character.isUpperCase(lastname.charAt(0))) {
            this.lastname = lastname;
        } else {
            throw new IllegalArgumentException("Pavardė rašoma iš didžiosios raidės");
        }
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Klaida, amžius negali būti neigiamas");
        }
    }
    public String toString() {
        if(age > 0) {
            return this.name + " " + this.lastname + " " + this.age;
        }else {
            return this.name + " " + this.lastname;
        }
    }
    public int compareTo(Person name2) {
        if (!this.getLastname().equalsIgnoreCase(name2.getLastname()) ) {
            return this.getLastname().compareTo(name2.getLastname());
        } else if (!this.getName().equalsIgnoreCase(name2.getName())) {
            return this.getName().compareTo(name2.getName());
        } else {
            return Integer.compare(this.getAge(), name2.getAge());
        }
    }
    public Person clone(){
        try{
            return (Person) super.clone();
        } catch ( CloneNotSupportedException cnse) {
            System.out.println("Cloning not supported");
        }
       return null;
    }
}
class PersonCompareByLastName implements Comparator<Person> {
    public int compare(Person name1, Person name2) {
        if (!name1.getLastname().equalsIgnoreCase(name2.getLastname()) ) {
            return name1.getLastname().compareTo(name2.getLastname());
        } else if (!name1.getName().equalsIgnoreCase(name2.getName())) {
            return name1.getName().compareTo(name2.getName());
        } else {
            return Integer.compare(name1.getAge(), name2.getAge());
        }
    }
}

   class Uzd_0410_Uzduoteles {
        public static void main(String args[]) {
            try {

                ArrayList<Person> person = new ArrayList<>();
                person.add(new Person("Agatha", "Christie"));
                person.add(new Person("Marius", "Petrauskas", 28));
                person.add(new Person("Austė", "Katliūtė", 7));
                person.add(new Person("Marytė", "Sinaprė", 67));
                person.add(new Person("Sandra", "Karliūtė", 9));
                person.add(new Person("Sandra", "Katliūtė", 10));
                Collections.sort(person);
                //Collections.sort(person, new PersonCompareByLastName());
                System.out.println(person);

                Person persona = new Person("Marius", "Petrauskas", 28);
                Person personaCopy = (Person)persona.clone();

                System.out.println(personaCopy);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Unexpected error, sorry!");
            }
        }
    }


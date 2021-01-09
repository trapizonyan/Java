package pr12;

public class Person {
    private String firstName, secondName, middleName;

    Person(String secondName) {
        this.secondName = secondName;
    }

    Person(String surname, String name, String middleName) {
        this.secondName = surname;
        this.firstName = name;
        this.middleName = middleName;
    }

    public String toString() {
        if (firstName == null || middleName == null) {
            return (secondName);
        } else {
            return (secondName + " " + ((firstName.toUpperCase()).toCharArray())[0] + "." + ((middleName.toUpperCase()).toCharArray())[0] + ".");

        }
    }

    public static void main(String[] args) {
        Person people = new Person("Trapizonyan", "Rafik", "Ashotovich");
        System.out.println(people.toString());
        Person people1 = new Person("Trapizonyan");
        System.out.println(people1.toString());
    }
}
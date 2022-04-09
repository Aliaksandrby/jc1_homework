package by.exercise51;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final int id;

    public Person(String name, String surname, int age,int id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person id: " + id + "\n" +
                "   name: " + name + "\n" +
                "   surname: " + surname + "\n" +
                "   age: " + age + "\n\n";
    }
}

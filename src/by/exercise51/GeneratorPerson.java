package by.exercise51;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratorPerson {
    private int numberOfPerson;
    private int id;

    public GeneratorPerson(int numberOfPerson) {
        this.setNumberOfPerson(numberOfPerson);
    }

    private void setNumberOfPerson(int numberOfPerson) {
        if(numberOfPerson < 1) {
            System.out.println("WRONG number of person");
            System.exit(1);
        }
        this.numberOfPerson = numberOfPerson;
    }

    private Person generatePerson() {
        Generator generator = new Generator();
        String name = generator.generateName();
        String surname = generator.generateSurname();
        int age = generator.generateAge();
        return new Person(name,surname,age,++id);
    }

    private ArrayList<Person> generatePersons() {
        ArrayList<Person> listPersons = new ArrayList<>();
        for (int i = 0; i < numberOfPerson; i++) {
            Person person = generatePerson();
            System.out.println(person);
            listPersons.add(person);
        }
        return listPersons;
    }

    public void writeFile(String fileName) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            ArrayList<Person> listPersons = generatePersons();
            for (Person person : listPersons) {
                writer.write(person.toString());
            }
        } catch (IOException exc) {
            System.out.println("ERROR WRITE: " + exc);
        }
    }
}

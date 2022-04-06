package by.exercise49;

import java.io.*;
import java.util.ArrayList;

public class OutInBinaryFile {

    private final String nameFile;

    public OutInBinaryFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public void writeFile(Numbers numbers) {
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(nameFile))) {
            for (int num : numbers.getRandomNumbers()) {
                out.write(num);
            }
        } catch (IOException exc) {
            System.out.println("ERROR write: " + exc);
        }
    }

    public ArrayList<Integer> readFile() {
        ArrayList<Integer> numbers = new ArrayList<>();
        try(DataInputStream in = new DataInputStream(new FileInputStream(nameFile))) {
            while(in.available() > 0) {
                numbers.add(in.read());
            }
        } catch (IOException exc) {
            System.out.println("ERROR read: " + exc);
        }
        return numbers;
    }
}

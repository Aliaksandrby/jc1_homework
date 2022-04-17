package by.exercise56;

public class SomeObject {

    private final String nameObject;

    public SomeObject(String nameObject) {
        this.nameObject = nameObject;
    }

    @Override
    public String toString() {
        return nameObject;
    }
}

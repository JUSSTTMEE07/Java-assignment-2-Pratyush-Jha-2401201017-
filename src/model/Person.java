package model;

public abstract class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void displayInfo();

    // Final method
    public final void finalMessage() {
        System.out.println("This is a final method in an abstract class Person.");
    }
}

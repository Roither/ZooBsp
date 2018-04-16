package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Animal {

    private int id;
    private String name;
    private double weight;

    private static long nextId = 0;

    private static long getNextId() {
        nextId++;
        return nextId;
    }

    public Animal(String name, double weight) {
        this.id = (int) getNextId();

        // alternativ kann auch direkt mit den Settern gearbeitet werden
        // dann kann code-reuse angewendet werden
        this.name = name;
        // setName(name);
        this.weight = weight;
        // setWeight(weight);
    }

    public void printInfo() {
        // sout(this) - nutzt .toString() implizit
        System.out.println(this.toString());
    }

    // Overrides werden später noch erklärt
    @Override
    public String toString() {
        return ("basics.Animal #" + id + ": " + name + ", " + weight + " kg");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double value) {
        weight = value;
    }

    public double getWeight() {
        return weight;
    }
}

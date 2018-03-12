import java.util.ArrayList;
import java.util.Arrays;

public class Animal {

    private int id;
    private String name;
    private Type type;
    private ArrayList<Gehege> gehegen;
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayList<Gehege> getGehegen() {
        return gehegen;
    }

    public void setGehegen(ArrayList<Gehege> gehegen) {
        this.gehegen = gehegen;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public double getMaxGesch() {
        return maxGesch;
    }

    public void setMaxGesch(double maxGesch) {
        this.maxGesch = maxGesch;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void setNextId(long nextId) {
        Animal.nextId = nextId;
    }

    public void setWeight(int value) {
        weight = value;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(String name, Type type, ArrayList<Gehege> gehegen, int weight) {

        this.id = (int) getNextId();
        this.name = name;
        this.type = type;
        this.gehegen = gehegen;
        this.weight = weight;

    }

    private double geschwindigkeit = 0;
    private double maxGesch = 100;

    public double accelerate() {
        if (geschwindigkeit <= maxGesch - 10)
            geschwindigkeit = geschwindigkeit + 10;

        return geschwindigkeit;
    }

    public void brake() {
    }

    public void drive(int kilometers) {
        for(int i = 0; i < kilometers; i++) {
            accelerate();
            brake();
            accelerate();
            accelerate();
            brake();
            brake();
        }
    }

    private int i = 0;

    private static long nextId = 0;

    private static long getNextId() {
        nextId++;
        return nextId;
    }

    @Override
    public String toString() {
        return ("Animal #" + id + ": " + name + geschwindigkeit + type);
    }

}

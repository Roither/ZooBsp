package klausurvorbereitung1;

public class Cow extends Animal {
    private double weight;

    public Cow(int age, double weight) {
        super(age);
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("mooh");
    }
}

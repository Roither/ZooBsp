package klausurvorbereitung1;

public class Giraffe extends Animal {
    private int neckHeight;

    public Giraffe(int age, int neckHeight) {
        super(age);
        setNeckHeight(neckHeight);
    }

    public int getNeckHeight() {
        return this.neckHeight;
    }

    public void setNeckHeight(int neckHeight) {
        this.neckHeight = neckHeight;
    }

    @Override
    public void makeSound() {
        // TODO find out sound of giraffe
        System.out.println("what does the giraffe say");
    }
}

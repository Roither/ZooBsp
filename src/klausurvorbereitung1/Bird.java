package klausurvorbereitung1;

public class Bird extends Animal{
    private int wingspan;

    public Bird() {
        super(0);
        this.wingspan = 0;
    }

    public Bird(int age, int wingspan) {
        super(age);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return this.wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
}

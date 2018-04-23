package klausurvorbereitung1;

public abstract class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();
}

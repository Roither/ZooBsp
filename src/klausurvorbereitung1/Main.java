package klausurvorbereitung1;

public class Main {
    public static void main(String[] args) {
        Animal giri = new Giraffe(0, 100);
        if (giri instanceof Giraffe)
            System.out.println(((Giraffe) giri).getNeckHeight());

        Animal birdi = new Bird(0, 10);
        if (birdi instanceof Giraffe)
            System.out.println(((Giraffe) birdi).getNeckHeight());

        birdi.makeSound();
    }
}

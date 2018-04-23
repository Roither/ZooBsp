package single4life;

public class Main {

    public static void main(String[] args) {
        Singleton test = Singleton.getInstance();
        Singleton t2 = Singleton.getInstance();

        test.doSomething();
        t2.doSomething();

        if (test == t2)
            System.out.println("must be singleton \uD83E\uDD14");
    }
}

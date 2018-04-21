package klausurvorbereitung1.aufg2_4;

public class Main {
    public static void main(String args[]) {
        B b1 = new B();
        System.out.println(b1.answer);          // 42
        System.out.println(b1.getClassName());  // B
        System.out.println(b1.callMethod());    // B
        A b2 = new B();
        System.out.println(b2.answer);          // 0
        System.out.println(b2.getClassName());  // A
        System.out.println(b2.callMethod());    // B
    }
}

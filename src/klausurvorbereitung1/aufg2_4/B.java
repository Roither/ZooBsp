package klausurvorbereitung1.aufg2_4;

public class B extends A {
    public static int answer = 42;

    public static String getClassName() {
        return "Name of class: B";
    }

    @Override
    public String callMethod() {
        return "Method of class: B";
    }
}

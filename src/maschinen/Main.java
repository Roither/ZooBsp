package maschinen;

import maschinen.impl.BaggerLaderImpl;
import maschinen.interfaces.Baumaschine;

public class Main {
    public static void main(String[] args) {
        Baumaschine l = new BaggerLaderImpl("name",
                100, 10, 5);

        // abstract class kann nicht instanziiert werden
        // AbstractClass ac = new AbstractClass();
    }
}

package maschinen;

import java.util.List;

public abstract class AbstractClass {
    private String name = "";

    // ist schon konkrete methode
    public String getName() {
        return name;
    }

    // ist noch abstrakt weil AlgoDat
    public abstract List<Integer> sort();

    public AbstractClass() {

    }

    public AbstractClass(int i) {

    }
}

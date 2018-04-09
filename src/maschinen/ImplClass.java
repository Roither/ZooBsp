package maschinen;

import java.util.List;

public class ImplClass extends AbstractClass {
    @Override
    public List<Integer> sort() {
        // muss implementiert werden!
        return null;
    }

    public ImplClass(int i) {
        // aufruf eines anderen super konstruktors
        super(i);
    }
}

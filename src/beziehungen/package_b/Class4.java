package beziehungen.package_b;

import beziehungen.package_a.Class1;

public class Class4 extends Class1 {
    public int attPub4;
    private int attPriv4;
    protected int attProt4;
    int attPackPri4;

    public void meth4() {
        super.attProt1 = 1;
    }

    public static void stat4() {
        Class3.attPubStat3 = 1;
    }
}

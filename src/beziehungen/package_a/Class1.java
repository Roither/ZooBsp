package beziehungen.package_a;

import beziehungen.package_b.Class3;
import beziehungen.package_b.Class4;

public class Class1 {
    public int attPub1;
    private int attPriv1;
    protected int attProt1;
    int attPackPriv1;

    public void meth1() {
        // objects for instance variables
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();

        attPub1 = 1;
        attPriv1 = 1;
        attProt1 = 1;
        attPackPriv1 = 1;

        class2.attPub2 = 1;
        class2.attProt2 = 1;
        class2.attPackPriv2 = 1;

        class3.attPubStat3 = 1;
        Class3.attPubStat3 = 1;

        class4.attPub4 = 1;
    }
}

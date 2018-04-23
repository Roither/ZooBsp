package beziehungen.package_a;

import beziehungen.package_b.Class3;
import beziehungen.package_b.Class4;

public class Class2 extends Class1 {
    public int attPub2;
    private int attPriv2;
    protected int attProt2;
    int attPackPriv2;

    public void meth2() {
        Class1 class1 = new Class1();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();

        class1.attPub1 = 1;
        class1.attProt1 = 1;
        class1.attPackPriv1 = 1;

        attPub2 = 1;
        attPriv2 = 1;
        attProt2 = 1;
        attPackPriv2 = 1;

        class3.attPubStat3 = 1;
        Class3.attPubStat3 = 1;

        class4.attPub4 = 1;
    }
}

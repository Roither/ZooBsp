package Beziehungen.PackageA;

import Beziehungen.PackageB.Class3;
import Beziehungen.PackageB.Class4;

public class Class1 {
    public int attPub1;
    private int Priv1;
    protected int Prot1;


    Class2 class2 = new Class2();
    Class3 class3 = new Class3();
    Class4 class4 = new Class4();

    public void meth1(){

        attPub1=1;
        Priv1=1;
        Prot1=1;

        class2.attPub1=1;
        class2.Prot2=1;

        class3.attPub3=1;

        class4.attPub4=1;
  }
}

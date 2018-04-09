package maschinen.impl;

import maschinen.interfaces.Bagger;
import maschinen.interfaces.Baumaschine;
import maschinen.interfaces.Lader;

public class BaggerLaderImpl extends BaggerImpl implements Lader {
    private double schaufelvolumen = 0;

    public BaggerLaderImpl(String name, double geschwindigkeit,
                           double grabtiefe, double schaufelvolumen) {
        super(name, geschwindigkeit, grabtiefe);

        setSchaufelvolumen(schaufelvolumen);
    }

    @Override
    public double getSchaufelvolumen() {
        return this.schaufelvolumen;
    }

    @Override
    public void setSchaufelvolumen(double schaufelvolumen) {
        // TODO check borders analog to BaggerImpl

        this.schaufelvolumen = schaufelvolumen;
    }
}

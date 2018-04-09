package maschinen.impl;

import maschinen.interfaces.Bagger;

public class BaggerImpl extends BaumaschineImpl implements Bagger {
    private double grabtiefe = 0;

    public BaggerImpl(String name, double geschwindigkeit, double grabtiefe) {
        super(name, geschwindigkeit);

        setGrabtiefe(grabtiefe);
    }

    @Override
    public double getGrabtiefe() {
        return grabtiefe;
    }

    @Override
    public void setGrabtiefe(double grabtiefe) {
        // check borders
        if (grabtiefe < 0 || grabtiefe > Bagger.MAX_GRABTIEFE)
            throw new IllegalArgumentException("grabtiefe");

        this.grabtiefe = grabtiefe;
    }
}
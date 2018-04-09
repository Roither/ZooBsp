package maschinen.interfaces;

import maschinen.impl.BaggerImpl;

public interface Baumaschine {
    String getName();

    void setName(String name);

    double getGeschwindigkeit();

    void setGeschwindigkeit(double geschwindigkeit);

    void druckeBeschreibung();
}

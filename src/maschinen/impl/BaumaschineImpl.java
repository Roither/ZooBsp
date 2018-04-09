package maschinen.impl;

import maschinen.interfaces.Baumaschine;

public class BaumaschineImpl implements Baumaschine {
    private String name = "";
    private double geschwindigkeit = 0;

    public BaumaschineImpl(String name, double geschwindigkeit) {
        setName(name);
        setGeschwindigkeit(geschwindigkeit);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getGeschwindigkeit() {
        return this.geschwindigkeit;
    }

    @Override
    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public void druckeBeschreibung() {
        // TODO
    }
}

package maschinen.interfaces;

public interface Bagger extends Baumaschine {
    double MAX_REICHWEITE = 8.0;

    double getGrabtiefe();

    void setGrabtiefe(double grabtiefe);

    // public im interface automatisch
    public void druckeBeschreibung();

    // final im interface automatisch
    final double MAX_GRABTIEFE = 15;
}

package maschinen.interfaces;

public interface Lader {
    double MAX_SCHAUFELVOLUMEN = 10;
    double MAX_KIPPHOEHE = 5;

    double getSchaufelvolumen();

    void setSchaufelvolumen(double schaufelvolumen);
}

package smarthome.examples;

public class Lightbulb {
    private boolean on = false;

    public void on() {
        on = true;
    }

    public void off() {
        on = true;
    }

    public boolean getOn() {
        return on;
    }
}

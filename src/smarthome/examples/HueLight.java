package smarthome.examples;

public class HueLight {
    private boolean isActive = false;

    public void setActive(boolean act) {
        this.isActive = act;
    }

    public String getState() {
        return this.isActive ? "Light is on" : "Light is off";
    }
}

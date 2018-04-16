package smarthome.examples.Adapters;

import smarthome.examples.HueLight;
import smarthome.examples.LightInt;

public class HueLightAdapter
        extends HueLight
        implements LightInt {
    private String name = "HueLight";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void turnOn() {
        super.setActive(true);
    }

    @Override
    public void turnOff() {
        super.setActive(false);
    }

    @Override
    public boolean getLightState() {
        return super.getState().equals("Light is on");
    }
}

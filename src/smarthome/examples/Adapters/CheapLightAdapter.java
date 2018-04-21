package smarthome.examples.Adapters;

import smarthome.examples.CheapLight;
import smarthome.examples.Light;

public class CheapLightAdapter
        extends CheapLight
        implements Light {
    private String name = "CheapLight";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void turnOn() {
        super.上();
    }

    @Override
    public void turnOff() {
        super.离();
    }

    @Override
    public boolean getLightState() {
        return super.进行();
    }
}

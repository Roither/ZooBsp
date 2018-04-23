package smarthome.examples.Adapters;

import smarthome.examples.Light;
import smarthome.examples.Lightbulb;

public class LightbulbAdapter extends Lightbulb implements Light {
    private String name;

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
        super.on();
    }

    @Override
    public void turnOff() {
        // can also be used with this. but super is more specific
        this.off();
    }

    @Override
    public boolean getLightState() {
        boolean resultFromSuper = super.getOn();
        return resultFromSuper;
    }
}

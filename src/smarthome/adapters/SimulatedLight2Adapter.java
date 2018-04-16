package smarthome.adapters;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation2.SimulatedLight2;

public class SimulatedLight2Adapter
        extends SimulatedLight2
        implements Actor {
    private String id = "";

    @Override
    public void switchOn() {
        super.set(1);
    }

    @Override
    public void switchOff() {
        super.set(0);
    }

    @Override
    public void setId(String s) {
        this.id = s;
    }

    @Override
    public String getId() {
        return this.id;
    }
}

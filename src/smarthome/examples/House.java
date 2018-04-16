package smarthome.examples;

import java.util.List;

public class House {
    private List<LightInt> lights;

    public void addLights(List<LightInt> lights) {
        this.lights = lights;
    }

    public void setStateOfAllLights(boolean on) {
        for (LightInt light : this.lights) {
            if (on)
                light.turnOn();
            else
                light.turnOff();
        }
    }

    public void printAllInfos() {
        System.out.println("House:");
        for (LightInt light : this.lights) {
            light.printInfo();
        }
    }
}

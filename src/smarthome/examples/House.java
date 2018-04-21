package smarthome.examples;

import java.util.List;

public class House {
    private List<Light> lights;

    public void addLights(List<Light> lights) {
        this.lights = lights;
    }

    public void setStateOfAllLights(boolean on) {
        for (Light light : this.lights) {
            if (on)
                light.turnOn();
            else
                light.turnOff();
        }
    }

    public void printAllInfos() {
        System.out.println("House:");
        for (Light light : this.lights) {
            light.printInfo();
        }
    }
}

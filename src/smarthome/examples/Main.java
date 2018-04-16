package smarthome.examples;

import smarthome.examples.Adapters.CheapLightAdapter;
import smarthome.examples.Adapters.HueLightAdapter;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House h = new House();
        List<LightInt> lights = new LinkedList<>();

        LightInt light1 = new CheapLightAdapter();
        LightInt light2 = new HueLightAdapter();
        lights.add(light1);
        lights.add(light2);

        h.addLights(lights);
        h.setStateOfAllLights(true);
        h.printAllInfos();
    }
}

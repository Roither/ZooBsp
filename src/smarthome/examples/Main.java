package smarthome.examples;

import smarthome.examples.adapters.CheapLightAdapter;
import smarthome.examples.adapters.HueLightAdapter;
import smarthome.examples.adapters.LightbulbAdapter;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House h = new House();
        List<Light> lights = new LinkedList<>();

        Light light1 = new CheapLightAdapter();
        Light light2 = new HueLightAdapter();
        Light light3 = new LightbulbAdapter();
        lights.add(light1);
        lights.add(light2);
        lights.add(light3);

        h.addLights(lights);
        h.setStateOfAllLights(true);
        h.printAllInfos();
    }
}

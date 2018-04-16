package smarthome;

import java.awt.EventQueue;
import java.util.ArrayList;

import at.omi.smarthome.gui.SmarthomeGUI;
import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.simulation1.SimulatedLight1;
import at.omi.smarthome.simulation2.SimulatedLight2;
import smarthome.adapters.SimulatedLight1Adapter;
import smarthome.adapters.SimulatedLight2Adapter;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ArrayList<Device> devices = new ArrayList<Device>();

                    Actor a1 = new SimulatedLight1Adapter();
                    a1.setId("1");
                    a1.setName("1");
                    devices.add(a1);

                    Actor a2 = new SimulatedLight2Adapter();
                    a2.setId("2");
                    a2.setName("2");
                    devices.add(a2);

                    SmarthomeGUI smarthome = new SmarthomeGUI(devices);
                    smarthome.setVisible(true);


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}

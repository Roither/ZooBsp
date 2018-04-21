package smarthome.examples;

public interface Light {
    public void setName(String name);

    public String getName();

    public void turnOn();

    public void turnOff();

    public boolean getLightState();

    // default method for infos IN INTERFACE
    public default void printInfo() {
        System.out.println(getName() + ": " + getLightState());
    }
}

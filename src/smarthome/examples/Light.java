package smarthome.examples;

public interface Light {
    public final int i = 5;

    public void setName(String name);

    public String getName();

    public void turnOn();

    public void turnOff();

    public boolean getLightState();

    public default void printInfo() {
        System.out.println(getName() + ": has state " + getLightState());
    }
}

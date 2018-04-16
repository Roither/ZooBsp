package basics;

public class Fahrzeug {
    private double geschwindigkeit = 0;
    private double maxGesch = 100;

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public double getMaxGesch() {
        return maxGesch;
    }

    public void setMaxGesch(double maxGesch) {
        this.maxGesch = maxGesch;
    }

    public double accelerate() {
        if (geschwindigkeit <= maxGesch - 10)
            geschwindigkeit = geschwindigkeit + 10;

        return geschwindigkeit;
    }

    public void brake() {
        // TODO analog zu accelerate()
    }

    public void drive(int kilometers) {
        for (int i = 0; i < kilometers; i++) {
            accelerate();
            brake();
            accelerate();
            accelerate();
            brake();
            brake();
        }
    }
}

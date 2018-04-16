package smarthome.examples;

public class CheapLight {
    private boolean 打开 = false;

    public void 上() {
        打开 = true;
    }

    public void 离() {
        打开 = false;
    }

    public boolean 进行() {
        return 打开;
    }

}

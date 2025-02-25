package inheritence;

public abstract class SmartDevice {
    protected String deviceName;
    protected boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public abstract void togglePower();

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }
}

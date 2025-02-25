package inheritence;

public class SmartLight extends SmartDevice{
    private int brightnessLevel;

    public SmartLight(String deviceName) {
        super(deviceName);
        this.brightnessLevel = 0;
    }

    @Override
    public void togglePower() {
        isOn = !isOn;
        brightnessLevel = isOn ? 50 : 0;
        System.out.println(deviceName + " is now " + getStatus());
    }

    public void setBrightness(int level) {
        if (isOn) {
            brightnessLevel = level;
        } else {
            System.out.println(deviceName + " is now OFF");
        }
    }

    public void getBrightness() {
        if (isOn) {
            System.out.println("Brightness: " + brightnessLevel);
        } else {
            System.out.println(deviceName + " is OFF.");
        }
    }
}

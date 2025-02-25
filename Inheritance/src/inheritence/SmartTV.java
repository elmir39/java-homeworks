package inheritence;

public class SmartTV extends SmartDevice{
    private int soundLevel;

    public SmartTV(String deviceName) {
        super(deviceName);
        this.soundLevel = 0;
    }

    @Override
    public void togglePower() {
        isOn = !isOn;
        soundLevel = isOn ? 50 : 0;
        System.out.println(deviceName + " is now " + getStatus());
    }

    public void setSound(int level) {
        if (isOn) {
            soundLevel = level;
        } else {
            System.out.println(deviceName + " is now OFF");
        }
    }

    public void getSound() {
        if (isOn) {
            System.out.println("Sound: " + soundLevel);
        } else {
            System.out.println(deviceName + " is OFF.");
        }
    }
}

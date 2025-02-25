package inheritence;

public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("light");
        SmartTV tv = new SmartTV("TV");

        light.togglePower();
        tv.togglePower();

        System.out.println(light.getStatus());

        light.togglePower();

        light.setBrightness(80);
        light.getStatus();

        tv.setSound(30);
        tv.getSound();
    }
}
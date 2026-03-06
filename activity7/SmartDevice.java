
public class SmartDevice {

    // attributes
    String deviceName;
    boolean isOn;

    // constructor
    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = isOn;
    }

    public void togglePower() {
        this.isOn = !this.isOn;
    }

    public void displayStatus(){
        System.out.println("Device name: " + deviceName + "\nPower state: " + isOn);
    }

}

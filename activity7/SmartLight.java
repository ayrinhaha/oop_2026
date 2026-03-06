
class SmartLight extends SmartDevice {
    
    //attribute
    int brightness;

    // constructor
    public SmartLight(String deviceName, boolean isOn) {
        super(deviceName, isOn);
        this.brightness = 0;
    }
    // print the brightness level 
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Brightness: " + brightness);
    }

   //only sets the brightness if the device is isOn
    public void setBrightness(int level) {
        if (isOn) {
            if (level >= 0 && level <= 100) {
                this.brightness = level;
                System.out.println("Brightness adjusted to " + level + "%.");
            }
        } else {
            System.out.println("Cannot set brightness while " + deviceName + " is OFF.");
        }
    }
}
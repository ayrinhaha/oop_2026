class SmartLight extends SmartDevice {
    int brightness;

    public SmartLight(String deviceName, boolean isOn) {
        super(deviceName, isOn);
        this.brightness = 0;

    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Brightness: " + brightness);
    }

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

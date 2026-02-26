class SmartThermostat extends SmartDevice {
    private double temperature;

    public SmartThermostat(String deviceName, boolean isOn) {
        super(deviceName, isOn);
        this.temperature = 20.0; 
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println(" | Temperature: " + temperature + "°C");
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println("Temperature set to " + temp + "°C.");
        if (temp > 30.0) {
            System.out.println("WARNING: Temperature is set above 30°C!");
        }
    }
}
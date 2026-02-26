public class Main {
    public static void main(String[] args) {

        SmartLight light = new SmartLight("Living Room Light", false);

        light.setBrightness(80);

        light.togglePower();
        light.setBrightness(80);
        light.displayStatus();

        System.out.println("-----------------------------------");

        SmartThermostat thermostat = new SmartThermostat("Main Thermostat", false);

        thermostat.togglePower();
        thermostat.setTemperature(32.0);
        thermostat.displayStatus();
    }
}

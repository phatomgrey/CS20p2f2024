// Add Phidgets Library
import com.phidget22.*;

public class DataInterval {
    // Handle Exceptions
    public static void main(String[] args) throws Exception {

        // Create TemperatureSensor object
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Add Temperature Event Listener
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature());
            }
        });

        // Open the sensor
        temperatureSensor.open(5000);

        // Set Data Interval to minimum value: 500ms
        System.out.println("Setting data interval to 500ms...");
        temperatureSensor.setDataInterval(500);

        // Run for 10 seconds to observe output at 500ms
        Thread.sleep(10000);

        // Set Data Interval to maximum value: 60000ms
        System.out.println("Setting data interval to 60000ms...");
        temperatureSensor.setDataInterval(60000);

        // Run for another 2 minutes to observe output at 60000ms
        Thread.sleep(120000);

        // Close the sensor
        temperatureSensor.close();
        System.out.println("Program completed.");
    }
}



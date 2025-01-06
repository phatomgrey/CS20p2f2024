// Add Phidgets Library
import com.phidget22.*;

public class ClosingPhidgets {
    public static void main(String[] args) throws Exception {

        // Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Open
        temperatureSensor.open(1000);

        // Use your Phidgets
        System.out.println("Temperature (before close): " + temperatureSensor.getTemperature() + " °C");

        // Close your Phidgets
        temperatureSensor.close();
        System.out.println("Phidget closed.");

        try {
            // Attempt to print temperature after close
            System.out.println("Temperature (after close): " + temperatureSensor.getTemperature() + " °C");
        } catch (PhidgetException e) {
            System.out.println("Error after close: " + e.getMessage());
        }

        // Reopen and use again
        System.out.println("Reopening Phidget...");
        temperatureSensor.open(1000);
        System.out.println("Temperature (after reopen): " + temperatureSensor.getTemperature() + " °C");

        // Final close
        temperatureSensor.close();
        System.out.println("Phidget closed.");
    }
}
// Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness {
    // Handle Exceptions 
    public static void main(String[] args) throws Exception {

        // Create 
        DigitalOutput redLED = new DigitalOutput();

        // Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        // Open 
        redLED.open(1000);

        // Gradually increase and decrease brightness of the LED
        while (true) {
            // Increase brightness
            for (double dutyCycle = 0.0; dutyCycle <= 1.0; dutyCycle += 0.1) {
                redLED.setDutyCycle(dutyCycle);
                Thread.sleep(200); // Wait to observe brightness change
            }

            // Decrease brightness
            for (double dutyCycle = 1.0; dutyCycle >= 0.0; dutyCycle -= 0.1) {
                redLED.setDutyCycle(dutyCycle);
                Thread.sleep(200); // Wait to observe brightness change
            }

            // Turn off LED
            redLED.setDutyCycle(0.0);
            break; // Exit loop after one cycle
        }

        redLED.close();
    }
}

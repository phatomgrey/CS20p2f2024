// Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HOTorCOLD {
    public static void main(String[] args) throws Exception {

        // Create | Create objects for the TemperatureSensor and DigitalOutputs for the LEDs
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

        greenLED.setChannel(0); // Assuming green LED is connected to channel 0
        redLED.setChannel(1); // Assuming red LED is connected to channel 1

        // Open | Establish connection with the Phidget and the LEDs
        temperatureSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

        // Use your Phidgets | Monitor temperature and control LEDs
        while (true) {
            double temperature = temperatureSensor.getTemperature();

            if (temperature >= 20 && temperature <= 24) {
                greenLED.setState(true);  // Turn on green LED
                redLED.setState(false);  // Turn off red LED
                System.out.println("Temperature: " + temperature + " °C - Green LED ON");
            } else {
                greenLED.setState(false); // Turn off green LED
                redLED.setState(true);   // Turn on red LED
                System.out.println("Temperature: " + temperature + " °C - Red LED ON");
            }

            Thread.sleep(150);
        }
    }
}

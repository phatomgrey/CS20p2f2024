
// Add Phidgets Library
import com.phidget22.*;
public class Thermostat {
   public static void main(String[] args) throws Exception {
       // Create TemperatureSensor, DigitalOutput objects for red and green LEDs.
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
       // Create DigitalInput objects for the green and red buttons
       DigitalInput greenButton = new DigitalInput();
       DigitalInput redButton = new DigitalInput();
       // Assign the correct HubPort for each LED and button
       redLED.setHubPort(1);  // Assign red LED to Hub Port 1
       redLED.setIsHubPortDevice(true);
       greenLED.setHubPort(4);  // Assign green LED to Hub Port 4
       greenLED.setIsHubPortDevice(true);
       greenButton.setHubPort(5);  // Assign green button to Hub Port 2
       greenButton.setIsHubPortDevice(true);
       redButton.setHubPort(0);    // Assign red button to Hub Port 3
       redButton.setIsHubPortDevice(true);
       // Open the sensor, LEDs, and buttons (with timeout of 1000ms)
       temperatureSensor.open(1000);
       redLED.open(1000);
       greenLED.open(1000);
       greenButton.open(1000);
       redButton.open(1000);
       // Initialize the set temperature (in Celsius)
       double setTemperature = 26.0;  // Set temperature starts at 21°C
       long lastPrintTime = System.currentTimeMillis();  // Time tracking for 10-second print
       // Continuously check the temperature and control LEDs
       while (true) {
           // Get the current temperature
           double currentTemperature = temperatureSensor.getTemperature();
           // Check if the green button is pressed to increase the set temperature
           if (greenButton.getState()) {
               setTemperature += 1; // Increase the set temperature by 1°C
               System.out.println("Set Temperature Increased: " + setTemperature + " °C");
               while (greenButton.getState()) {
                   Thread.sleep(10); // Wait to debounce the button press
               }
           }
           // Check if the red button is pressed to decrease the set temperature
           if (redButton.getState()) {
               setTemperature -= 1; // Decrease the set temperature by 1°C
               System.out.println("Set Temperature Decreased: " + setTemperature + " °C");
               while (redButton.getState()) {
                   Thread.sleep(10); // Wait to debounce the button press
               }
           }
           // Check if 10 seconds have passed to print the temperatures
           long currentTime = System.currentTimeMillis();
           if (currentTime - lastPrintTime >= 10000) {  // 10000ms = 10 seconds
               System.out.println("Current Temperature: " + currentTemperature + " °C");
               System.out.println("Set Temperature: " + setTemperature + " °C");
               lastPrintTime = currentTime;  // Update the last print time
           }
           // Check if the current temperature is within 2°C of the set temperature
           if (Math.abs(currentTemperature - setTemperature) <= 2) {
               // Turn on the green LED and turn off the red LED
               greenLED.setState(true);   // Green LED ON
               redLED.setState(false);    // Red LED OFF
           } else {
               // Turn on the red LED and turn off the green LED
               redLED.setState(true);     // Red LED ON
               greenLED.setState(false);  // Green LED OFF
           }
           // Pause for 150ms before checking the temperature again
           Thread.sleep(150);
       }
   }
}

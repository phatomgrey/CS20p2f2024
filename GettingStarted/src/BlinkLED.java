// Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class BlinkLED {
 // Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
 public static void main(String[] args) throws Exception {
     // Create | Here you've created a DigitalOutput object for your LED. An object represents how you interact with your device. DigitalOutput is a class from the Phidgets library that's used to provide a voltage to things like LEDs.
     DigitalOutput redLED = new DigitalOutput();
     // Address | This tells your program where to find the device you want to work with. Your LED is connected to port 1 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
     redLED.setHubPort(4);
     redLED.setIsHubPortDevice(true);
     // Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
     redLED.open(1000);
     // Counter to track how many times the LED has flashed
     int flashCount = 0;
     // Use your Phidgets | Here is where you can have some fun and use your Phidgets! The LED will turn on and off, and the flashCount will limit it to 3 times.
     while (flashCount < 3) {
         redLED.setState(true);  // Turn LED on
         Thread.sleep(2000);     // Keep LED on for 2 seconds
         redLED.setState(false); // Turn LED off
         Thread.sleep(1000);     // Wait for 1 second before flashing again
         flashCount++;           // Increment the flash counter
     }
 }
}

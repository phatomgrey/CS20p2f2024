// Add Phidgets Library
import com.phidget22.*;

public class ButtonEvents {
    // Handle Exceptions
    public static void main(String[] args) throws Exception {

        // Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        // Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(1);

        // Event for red button
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (e.getState()) {
                    System.out.println("Red Button: Pressed");
                } else {
                    System.out.println("Red Button: Not Pressed");
                }
            }
        });

        // Event for green button
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (e.getState()) {
                    System.out.println("Green Button: Pressed");
                } else {
                    System.out.println("Green Button: Not Pressed");
                }
            }
        });

        // Open
        redButton.open(1000);
        greenButton.open(1000);

        // Keep program running with different delays for testing
        while (true) {
            Thread.sleep(10);   
        }
    }
}
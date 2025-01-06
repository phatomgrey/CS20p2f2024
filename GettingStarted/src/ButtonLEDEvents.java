// Add Phidgets Library
import com.phidget22.*;

public class ButtonLEDEvents {
    // Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;
    static int redButtonPressCount = 0;
    static int greenButtonPressCount = 0;

    // Handle Exceptions
    public static void main(String[] args) throws Exception {

        // Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        // Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Event for red button (controls green LED)
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                turnGreenLEDOn = e.getState();
                if (e.getState()) {
                    redButtonPressCount++;
                }
            }
        });

        // Event for green button (controls red LED)
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                turnRedLEDOn = e.getState();
                if (e.getState()) {
                    greenButtonPressCount++;
                }
            }
        });

        // Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        // Tug of War variables
        boolean gameWon = false;

        // Use your Phidgets
        while (!gameWon) {
            // Control LEDs
            redLED.setState(turnRedLEDOn);
            greenLED.setState(turnGreenLEDOn);

            // Check for a winner
            if (redButtonPressCount >= 10) {
                System.out.println("Red wins!");
                redLED.setState(true);
                greenLED.setState(true);
                gameWon = true;
            } else if (greenButtonPressCount >= 10) {
                System.out.println("Green wins!");
                redLED.setState(true);
                greenLED.setState(true);
                gameWon = true;
            }

            // Sleep for 150 milliseconds
            Thread.sleep(150);
        }

        // Close Phidgets
        redLED.close();
        greenLED.close();
        redButton.close();
        greenButton.close();
    }
}


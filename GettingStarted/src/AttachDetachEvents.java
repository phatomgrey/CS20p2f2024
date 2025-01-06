// Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEvents {

    public static void main(String[] args) throws Exception {
       
         // Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput button = new DigitalInput();
        DigitalOutput led = new DigitalOutput();

        // Address
        button.setHubPort(0);
        button.setIsHubPortDevice(true);
        led.setHubPort(1);
        led.setIsHubPortDevice(true);

        // Temperature Data Event
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        // Attach Event for Temperature Sensor
        temperatureSensor.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: Temperature Sensor");
            }
        });

        // Detach Event for Temperature Sensor
        temperatureSensor.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: Temperature Sensor");
            }
        });

        // Attach Event for Button
        button.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: Button");
            }
        });

        // Detach Event for Button
        button.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: Button");
            }
        });

        // Attach Event for LED
        led.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: LED");
            }
        });

        // Detach Event for LED
        led.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: LED");
            }
        });

        // Open
        temperatureSensor.open(1000);
        button.open(1000);
        led.open(1000);

        // Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}

// Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadHumidity {
    public static void main(String[] args) throws Exception {

        // Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        // Use your Phidgets | This code will print humidity and temperature read by the sensor based on conditions every 150ms.
        while (true) {
            double humidity = humiditySensor.getHumidity();
            double temperature = temperatureSensor.getTemperature();

            if (humidity > 30) {
                System.out.println("Humidity: " + humidity + " %RH");
            } else {
                System.out.println("Humidity is low");
            }

            if (temperature > 21) {
                System.out.println("Temperature: " + temperature + " °C");
            } else {
                System.out.println("Room is too cold");
            }

            Thread.sleep(150);
        }
    }
}
  
    
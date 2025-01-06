<<<<<<< HEAD
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadTemperature {
    public static void main(String[] args) throws Exception{

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(150);

        //Use your Phidgets | This code will print the temperature every 150ms
        while (true) {
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
=======
// Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;

public class ReadTemperature {
    public static void main(String[] args) throws Exception {

        // Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);

        // Use your Phidgets | This code will print the temperature in both Celsius and Fahrenheit every 150ms
        while (true) {
            double celsius = temperatureSensor.getTemperature();
            double fahrenheit = (celsius * 1.8) + 32; // Convert Celsius to Fahrenheit
            
            System.out.println("Temperature: " + celsius + " °C / " + fahrenheit + " °F");
>>>>>>> branch 'master' of https://github.com/phatomgrey/CS20p2f2024.git
            Thread.sleep(150);
        }
    }
}
  
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class UseButtonsandLEDs {
  
	//Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
   public static void main(String[] args) throws Exception {
       // Create | Create objects for your buttons and LEDs.
       DigitalInput redButton = new DigitalInput();
    
       DigitalOutput redLED = new DigitalOutput();
    
       DigitalInput greenButton = new DigitalInput();
    
       DigitalOutput greenLED = new DigitalOutput();
       //Address | Address your four objects which lets your program know where to find them.
       redButton.setHubPort(0);
     
       redButton.setIsHubPortDevice(true);
    
       redLED.setHubPort(4);
     
       redLED.setIsHubPortDevice(true);
      
       greenButton.setHubPort(5);
     
       greenButton.setIsHubPortDevice(true);
     
       greenLED.setHubPort(1);
   
       greenLED.setIsHubPortDevice(true);
       //Open | Connect your program to your physical devices.
       redButton.open(1000);
     
       redLED.open(1000);
     
       greenButton.open(1000);
     
       greenLED.open(1000);
       //Initialize the counter for button presses
       int pressCount = 0;
       //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released.
   
       while (true) {
         
       	//Check the red button state and update the LED
           if (redButton.getState()) {
             
           	redLED.setState(false);
        
           } else {
             
           	redLED.setState(true);
           }
           //Check the green button state and update the LED
           if (greenButton.getState()) {
             
           	greenLED.setState(false);
        
           } else {
             
           	greenLED.setState(true);
           }
           //If either button is pressed, increment the press count
           if (redButton.getState() || greenButton.getState()) {
             
           	pressCount++;
              
           	System.out.println("Total button presses: " + pressCount);
           }
           //avoid over-counting
           Thread.sleep(140);
       }
   }
}



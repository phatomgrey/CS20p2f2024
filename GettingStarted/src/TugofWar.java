import com.phidget22.*;
public class TugofWar {
   public static void main(String[] args) throws Exception {
      
       //Create objects for the buttons and LEDs.
       DigitalInput redButton = new DigitalInput();
      
       DigitalOutput redLED = new DigitalOutput();
    
       DigitalInput greenButton = new DigitalInput();
     
       DigitalOutput greenLED = new DigitalOutput();
       //Address the objects to their respective hub ports.
       redButton.setHubPort(0);
    
       redButton.setIsHubPortDevice(true);
    
       redLED.setHubPort(1);
     
       redLED.setIsHubPortDevice(true);
     
       greenButton.setHubPort(5);
     
       greenButton.setIsHubPortDevice(true);
     
       greenLED.setHubPort(4);
      
       greenLED.setIsHubPortDevice(true);
       //open the devices.
       redButton.open(1000);
     
       redLED.open(1000);
     
       greenButton.open(1000);
     
       greenLED.open(1000);
       //counters for both players
       int redPressCount = 0;
     
       int greenPressCount = 0;
       //Turn both LEDs.
       redLED.setState(true);
    
       greenLED.setState(true);
       //continue until one player wins
       while (true) {
         
       	//if red button is pressed, increment the red player's count and flash the red LED.
           if (redButton.getState()) {
            
           	redPressCount++;
            
           	System.out.println("Red Presses: " + redPressCount);
              
               //Flash the red LED (turn off for 100ms then back on).
               redLED.setState(false);
              
               Thread.sleep(100);
             
               redLED.setState(true);
             
               Thread.sleep(100);
           }
           //if green button is pressed, increment the green player's count and flash the green LED.
           if (greenButton.getState()) {
              
           	greenPressCount++;
             
           	System.out.println("Green Presses: " + greenPressCount);
              
               //flash the green LED (turn off for 100ms then back on).
               greenLED.setState(false);
               Thread.sleep(100);
               greenLED.setState(true);
               Thread.sleep(100);
           }
           //check if either player has won (10 presses).
           if (redPressCount >= 10 || greenPressCount >= 10) {
               // Flash both LEDs once
               redLED.setState(true);
           
               greenLED.setState(true);
         
               //both LEDs on for 200ms..
               Thread.sleep(200); 
           
              
               redLED.setState(false);
            
               greenLED.setState(false);
          
               //both LEDs off for 200ms.
               Thread.sleep(200); 
               //flash the winner's LED 5 times.
               if (redPressCount >= 10) {
                 
               	for (int i = 0; i < 5; i++) {
                     
                   	redLED.setState(true);
                     
                       Thread.sleep(200);  //red LED on for 200ms.
                    
                      
                       redLED.setState(false);
                   
                       Thread.sleep(200);  //red LED off for 200ms.
                   }
                 
                   System.out.println("Red is the winner!");
             
               } else {
                 
               	for (int i = 0; i < 5; i++) {
                    
                   	greenLED.setState(true);
                     
                       Thread.sleep(200);  //green LED on for 200ms.
                     
                       greenLED.setState(false);
                      
                       Thread.sleep(200);  //green LED off for 200ms.
                   }
                   System.out.println("Green is the winner!");
               }
              
               //exit the game after displaying the winner.
               break;
           }
           //avoid over-counting.
           Thread.sleep(150);
       }
   }
}

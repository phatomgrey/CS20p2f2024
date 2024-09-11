package Skillbuilders;

import java.util.*;


public class rectangularperimeter {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		//Declaration and initialization
		System.out.print("Please enter a length: ");
		int lenght = userInput.nextInt();
		
		System.out.print("Please enter a Width: ");
        int width = userInput.nextInt();
	
	    int area = lenght * width;
	     
	    System.out.print("The area of the rectangle is: "+ area);
	
	
	
	}

}

package Mastery;
import java.util.Scanner;
@SuppressWarnings("unused")
public class piggybank {
	private int pen;
	private int nic;
	private int dime;
	private int quart;
	
	public piggybank() {
		pen = 0;
		nic = 0;
		dime = 0;
		quart= 0;
	}
	
	public void penny (int num) {
		pen += num;
	}
	
	public void nickel (int num) {
		nic += num;
	}
	
	public void dime (int num) {
		dime += num;
	}
	
	public void quarter (int num) {
		quart += num;
	}
	
	public double bankTotal () {
		return (pen * 0.01) + (nic * 0.05) + (dime * 0.1) + (quart * 0.25);
	}
	
	public void takeOut( ) {
		pen = 0;
		nic = 0;
		dime = 0;
		quart= 0;
	}
	
	public String toString() {
		String total =  ("Penny: " + pen + "Nickel: " + nic + "Dime:" + dime + "Quarters: " + quart);
		return total;
	}
}

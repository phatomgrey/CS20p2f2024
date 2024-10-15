package Mastery;


import java.text.DecimalFormat;
import java.util.Scanner;


public class Election {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat deca = new DecimalFormat("#.##");


        // Gather votes for each candidate from New York, New Jersey, and Connecticut
        System.out.println("Voting results from New York");
        System.out.print("Obama: ");
        int obamaNY = in.nextInt();
        System.out.print("Biden: ");
        int bidenNY = in.nextInt();


        System.out.println("Voting results from New Jersey");
        System.out.print("Obama: ");
        int obamaNJ = in.nextInt();
        System.out.print("Biden: ");
        int bidenNJ = in.nextInt();

        System.out.println("Voting results from Connecticut");
        System.out.print("Obama: ");
        int obamaCT = in.nextInt();
        System.out.print("Biden: ");
        int bidenCT = in.nextInt();


        // Calculate total votes
        int obamaTotal = obamaNY + obamaNJ + obamaCT;
        int bidenTotal = bidenNY + bidenNJ + bidenCT;
        int totalVotes = obamaTotal + bidenTotal;


        // Calculate vote percentages
        double percObama = (double) obamaTotal / totalVotes * 100;
        double percBiden = (double) bidenTotal / totalVotes * 100;


        // Output the results
        System.out.println("Candidate   Votes   Percentage");
        System.out.println("Obama       " + obamaTotal + "    " + deca.format(percObama) + "%");
        System.out.println("Biden       " + bidenTotal + "    " + deca.format(percBiden) + "%");
        System.out.println("TOTAL VOTES: " + totalVotes);


        // Close the scanner
        in.close();
    }
}

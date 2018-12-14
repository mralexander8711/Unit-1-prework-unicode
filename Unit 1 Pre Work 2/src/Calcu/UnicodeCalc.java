package Calcu;

import java.util.Scanner;


public class UnicodeCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Start 2 strings
		 * create user inputs initial conditions
		 * print 
		 */
		String usrInput1 = "";  // storing the value of userInput 1 
		String usrInput2 = "";  // storing the value of user input 2 
		int word1Length = 0; 
		int word2Length = 0; 
		int sumWord1 = 0;  // storing the value of word 1 
		int sumWord2 = 0; // storing the value of word 2 
		int Difference = 0; // storing the calculated person 
		System.out.print("string1:");  //ask user to type in the string for word1 
		usrInput1 = scan.next();
		System.out.print("string2:"); 
		usrInput2 = scan.next();
		word1Length = usrInput1.length(); //storing the length of the word 
		word2Length = usrInput2.length();  // storing the length of the word
		for(int i = 0; i <word1Length; i++)
		{
			char indexPos = usrInput1.charAt(i); // determine what letter we are looking at 
			int value = usrInput1.charAt(i); // getting the actual value of the letter
			sumWord1 = sumWord1 + value;  // storing the total sum of the word thus far 
			System.out.println(indexPos + ":" + value); // printing out the Char, and value 
		}
		// repeat for word 2 
		for(int i = 0; i <word2Length; i++)
		{
			char indexPos = usrInput2.charAt(i);
			int value = usrInput2.charAt(i);
			sumWord2 = sumWord2 + value; 
			System.out.println(indexPos + ":" + value);
		} 
		// calculate difference 
		
		Difference = Math.abs(sumWord1 - sumWord2); 
		System.out.println("Difference (as absolute value): " + Difference); //print out the difference 
			
	}
}
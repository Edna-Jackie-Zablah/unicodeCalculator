// Author: Edna Jaqueline Zablah
// date: 05/22/2019
//Java Deliverable 2 - Unicode Calculator


package lab1;
import java.util.Scanner;
import java.lang.*;
public class unicodeCalculator {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String string1;
		String string2;
		int total1 = 0;
		int total2 = 0;
		int difference;
		
				
		System.out.println("Please enter the first word: ");
		string1 = scnr.nextLine();
					
		 
				
		System.out.println("Please enter the second word: ");
		string2 = scnr.nextLine();

		for (int i = 0; i < string1.length(); i++) {
			int x = string1.charAt(i);
			total1+= x;
			System.out.println(string1.substring(i, i+1) + ": " + x);
			}
			
		for (int i = 0; i < string2.length(); i++) {
			int x = string2.charAt(i);
			total2+= x;
			System.out.println(string2.substring(i, i+1) + ": " + x);
			}
					
		difference = Math.abs(total1 - total2);
		System.out.println("The difference as an absolute value between word1 and word2 is: " + difference);
				
	}

}

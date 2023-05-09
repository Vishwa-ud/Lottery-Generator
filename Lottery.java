//IT21315282 Kuruppu K.A.V.U
package Ex2;

import java.util.Scanner;// Import the Scanner class
import java.util.Random;// Import the Random class to Generate Random numbers
import java.util.Arrays;// Import the Array class 

public class Lottery {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] userValues = new int[5];//declare an array of 5 integer elements get user values
		
		for (int i = 0; i < userValues.length; i++) {
			System.out.println("Enter the  number " + (i+1) + " (between 0 and 9): ");// Ask the user to input 5 numbers (0 - 9)
			userValues[i] = sc.nextInt(); // Read user inputs
			
		}
		
		compareLottery(userValues);// Compare user inputs with  lottery numbers
	}
	
	public static void compareLottery(int[] userValues) {
		Random randm = new Random(); // Create an object of class randm (To call the constructor)
		int[] lotteryValues = new int[5];//declare an array of 5 integer elements to get lottery values
		
		for (int i = 0; i < lotteryValues.length; i++) {
			lotteryValues[i] = randm.nextInt(10);//Read values 
		}
		// Compare the Randomly generated numbers with the user inputs
		int count = 0;//variable declaration
		for (int i =0; i < userValues.length; i++) { //user values
			for (int j = 0; j < lotteryValues.length; j++) { // randomly generated values
				if (userValues [i] == lotteryValues [j]) { //Compare user values and randomly generated values
					count++;//Count Matching entries
				}
			}
		}
		//Display Output
		System.out.println("Lottery Values are: " + Arrays.toString(lotteryValues));//used Arrays.toSrting method to returns a string of the contents of the given array enclosed in square brackets.  
		System.out.println("User Values are: " + Arrays.toString(userValues));//used Arrays.toSrting method to returns a string of the contents of the given array enclosed in square brackets.
		System.out.println("Numbers of matching entries are: " + count);//Display Matching Count
		
	}

}

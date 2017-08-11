/*
 * Practice 007.3.3_Class of string_3
 * Date 20170803
 */

import java.util.Scanner;

public class class_of_string_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input a string: ");
		String input = scanner.nextLine();
		
		char[] inputArray = input.toCharArray();
		char[] revise = new char [inputArray.length];
		for (int i = 0; i < inputArray.length; i++)
			revise[i] = inputArray[(inputArray.length - 1 - i)];
		
		String reviseString = new String(revise);
		boolean compare = input.equals(reviseString);
		if (compare == true)
			System.out.println("Yes");
		else
			System.out.print("No");


	}

}

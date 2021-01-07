/*Aytaç Aydemir
 *07.01.2020 
 * 
 * Java Code that displays
 * prime numbers between
 * minimum and maximum value
 * entered by user 
 * 
 */

package primenumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> prime_numbers = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in); // taking the input of minimum value from user
		System.out.println("Enter minimum value ");
		int min_value = sc.nextInt();

		System.out.println("Enter maximum value"); // taking the input of maximum value from user
		int max_value = sc.nextInt();

		sc.close();

		// finding the prime numbers between min value and max values
		// including themselves

		for (int i = min_value; i <= max_value; i++) {

			boolean num_is_prime = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					num_is_prime = false;
					break;
				}

			}

			if (num_is_prime) {

				prime_numbers.add(i);

			}

		}

		boolean cont = prime_numbers.contains(1); // boolean for arraylist includes 1 or not
		boolean cont_2 = prime_numbers.contains(0); // boolean for arraylist includes 0 or not

		if (cont) {

			prime_numbers.remove(1);
		} // Remove 1 and 0 from the arraylist if user
			// started this interval from 0 or 1
		if (cont_2) {
			prime_numbers.remove(0);
		}

		System.out.println("Prime Number Array is: = " + prime_numbers);

	}

}

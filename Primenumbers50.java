
public class Primenumbers50 {

	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers in five lines, each of which containing  10 numbers are :\n");
		printPrimeNumbers(50);
	}
	public static void printPrimeNumbers(int Primenumbers)  {
		//Here we have to display 10 numbers per line
		final int PRIME_NUMBER_PER_LINES = 10;
		
		// Now lets count the prime numbers
		int counter = 0;
		
		//lets declare a number that will be tested either it is a prime number or not
		int number = 2;
		
		// finding the prime number continuously
		while (counter < Primenumbers ) {
		// if the counter is smaller than the Primenumbers, then print the number and increase the counter
			if (isPrime(number))  {
				counter++;
		
			if (counter % PRIME_NUMBER_PER_LINES ==0) {
			// if the remainder is zero then print the number and move to the new line
				System.out.printf("%-5d\n", number);
			}
			else
				System.out.printf("%-5d", number);
			
			}
			//Check if the upcoming number is prime or not
			number++;
		
		 	}
		}
		//Check if the number is prime or not, so we are using boolean method
		public static boolean isPrime(int number) {
			for (int divisor = 2; divisor <= number /2 ; divisor++) {
				//if the result is 0 then the number is not a prime number
				if (number % divisor ==0) {
					return false;// it is not  a prime number
				}
			}
			return true;// it is a prime number 
				}	
	}



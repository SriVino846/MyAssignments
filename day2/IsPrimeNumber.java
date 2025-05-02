package week1.day2;

import org.apache.commons.math3.primes.Primes;

public class IsPrimeNumber {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 15;
		boolean isPrime = true;
		
		if(number<=1) {
			
			isPrime = false;
		}
		
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				isPrime = false;
				break;
			}
		}
		
	
	if(isPrime==true)
	{
		System.out.println(number + "is a prime");
	}
	else {
		System.out.println(number + "is not a prime");
	}

}
}

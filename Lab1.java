
public class Lab1 {
	public static void main (String[] args){
		int numberSupplied = 32, nextPrime = numberSupplied + 1, primenumber = 3, modulus;
		
		
		while (primenumber < nextPrime){
			modulus = nextPrime%primenumber;
			if (modulus == 0){
				nextPrime ++;
				primenumber = 3;
				}		
			
			primenumber = primenumber + 2;
		}
	System.out.printf("The first prime number greater than %d is %d\n", numberSupplied, nextPrime);	
	}

}
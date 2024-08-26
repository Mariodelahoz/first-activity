public class Main {
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}

	public int multiplyTwoNumbers(int a, int b) {
		return a*b;
	}

	public float divideTwoNumbers(int a, int b) {
		return a/b;
	}

	public int substractTwoNumbers(int a, int b) {
		return a-b;
	}

	public boolean isNumberEven(int a){
		boolean r=false;
		if (a%2==0){
			
			r=true;
		}
		return r;
	}

	public int calculateFirstRightDigit(int a){
		int j=a%10;
		if(a<0){
			return j*(-1);
		}
		return j;

	}

	public float celciusToFahrenheit(float a){
		return a* 9/5 + 32;
	}

	public float areaOfATriangle(float height, float base){
		return (base*height)/2;
	}

	public boolean isLeapYear(int year){
		boolean j=false;
		if(year%4==0 || year%400==0 && year%100!=0)
		
		{
		 j=true;
		}
		return j;
	}

    public boolean isPrime(int number) 
	
	{
		boolean j=false;
		int acum=0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				acum=acum+1;
				
			}

		}
		if(acum<=2){
			return j=true;
		}
		return j;
    }

    public int calculateFactorial(int number){
		int n = 1;
		for(int i=1; i<=number ; i++){
			
			
			n=n*i;
			
		}
		return n;
    }

    public int calculateLastNFibonnacci(int n){
		int a=0;
			int b=1;
			int c=0;
			
		 for(int i=1; i<=n ; i++){
			c=a+b;
			a=b;
			b=c;

		 }
		 return a;
    }

    public int getNumberOfDigits(int number){
    }

    public int rotateNumber(int number){
    }

    public int sumOffirstNNumbersMultiplesOfFiveOrThree(int N){
    }
}
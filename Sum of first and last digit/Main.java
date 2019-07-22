import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     
	      // Get the n value
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
        int last_digit=n%10;
        // Repeatedly remove last digit until it reaches the second digit
		while(n >= 10)
		{
		   n = n / 10;
		}
        // Extract last digit(i.e. second digit)
		int sum = n+last_digit;
		System.out.print(sum);
	}
}
	
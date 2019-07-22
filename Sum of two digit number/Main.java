import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int n1 = in.nextInt();
      int sum= (n1%10);
      int sum2= (n1/10);
      int out = sum+sum2;
      System.out.println(out);
                        
	}
}
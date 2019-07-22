import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int len =in.nextInt();
      int out= len%100;
      int result = out/10;
      System.out.println(result);
	}
}
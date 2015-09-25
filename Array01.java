import java.util.Scanner;
public class Array01 {
  public static void main (String args[]) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Insert Your Number : ");
	  int num =input.nextInt();
      int[] a = new int[num];
	  for (int s = 1 ; s <= a.length ; s++){
		  System.out.println("A = "+s);
	  }
  }
}
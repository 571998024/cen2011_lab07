import java.util.Scanner;
public class Array01 {
  public static void main (String args[]) {
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Insert Your Num : ");
	  int num =input.nextInt();
      int[] a = new int[num];
	  for (int i = 1 ; i <= a.length ; i++){
		  System.out.println("A = "+i);
	  }
      
  }
}
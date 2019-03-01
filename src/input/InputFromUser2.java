package input;

import java.util.Scanner;

public class InputFromUser2 {
		
  public static void main (String[] args) {
	  System.out.println(" Please enter few number: 2 ,4 ,6 ");
	  Scanner sc = new Scanner(System.in);
	  int input1 = sc.nextInt();
	  int input2 = sc.nextInt();
	  int input3 = sc.nextInt();	
	  sc.close();
	  int result = input1 + input2 + input3;
	  System.out.println("Total addition of three inputd:" + result);
	  
		}

}

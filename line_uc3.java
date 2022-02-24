import java.util.Scanner;

public class line_uc3 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter x1");
			int x1 = scanner.nextInt();
			
			System.out.println("enter y1");
			int y1 = scanner.nextInt();
			
			System.out.println("enter x2");
			int x2 = scanner.nextInt();
			
			System.out.println("enter y2");
			int y2 = scanner.nextInt();
					
			System.out.println("enter x3");
			int x3 = scanner.nextInt();
			
			System.out.println("enter y3");
			int y3 = scanner.nextInt();
			
			System.out.println("enter x4");
			int x4 = scanner.nextInt();
			
			System.out.println("enter y4");
			int y4 = scanner.nextInt();
			
			int val1=(int) Math.pow((x2-x1),2);
			int val2=(int) Math.pow((y2-y1),2);
			int number1=(int) Math.sqrt(val1+val2);
			int val3=(int) Math.pow((x4-x3),2);
			int val4=(int) Math.pow((y4-y3),2);
			int number2=(int) Math.sqrt(val3+val4);
			
			System.out.println("length of line 1:"+number1);
			System.out.println("length of line 2:"+number2);
		     if ( number1 == number2 )           
		            System.out.println("both lines are equal" );  
		        if ( number1 != number2 )          
		            System.out.println( "both lines are not equal" );  
		        if ( number1 < number2 )          
		            System.out.println( "line one is less than line2" );  
		        if ( number1 > number2 )          
		            System.out.println( "line one is greater than line2");  
		      
		    	
		        scanner.close();	    
	     }
		  
			
		}
	
	

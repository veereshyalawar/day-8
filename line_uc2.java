import java.util.Scanner;

public class line_uc2 {

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
			int result=(int) Math.sqrt(val1+val2);
			int val3=(int) Math.pow((x4-x3),2);
			int val4=(int) Math.pow((y4-y3),2);
			int Result=(int) Math.sqrt(val3+val4);
			
			System.out.println("length of line 1:"+result);
			System.out.println("length of line 2:"+Result);
			if(result == Result)
				System.out.println("both lines are equal");
			else
				System.out.println("both lines are not equal");
			scanner.close();
		}
	}
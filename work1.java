import java.util.Scanner;
public class work1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the width of the Triangle: ");
		double b = sc.nextDouble();
		
		
		System.out.println("Enter the height the Triangle: ");
		double h = sc.nextDouble();
		
		// Area = width*height)/2
		
		double area =(b*h)/2;
		System.out.println("Area of Triangle is: "+ area);
		
		
	}

}


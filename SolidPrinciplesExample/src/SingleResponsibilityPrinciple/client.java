package SingleResponsibilityPrinciple;

import java.util.Scanner;

public class client {
public static void main(String[] args) {
	double rad;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius  of circle to calculate area");
	rad=sc.nextDouble();
	circle c=new circle();
	System.out.print("Rad="+c.calcArea(rad));
	sc.close();
	
	
	
}
}

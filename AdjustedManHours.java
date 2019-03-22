package ass1;

import java.util.InputMismatchException;

import java.util.Scanner;

public class AdjustedManHours  {
	
	UCP ucp =new UCP();
	ECF ecf =new ECF();
	public double AdjustedManHours,p;
	
	public void run() {
		boolean done=false;
		do {
		try {
		System.out.print("\n\tPlease identify the assumptions and apply a coefficient as a percentage (%) : ");
		Scanner scan3=new Scanner(System.in);
		p=scan3.nextDouble();
		done=true;
		}catch(InputMismatchException e) {
			System.out.println("\n\t\t----------------------------");
			   System.out.println("\t\t   You must enter integer");
			   System.out.println("\t\t----------------------------"); 
		}
		}while(!done);
		AdjustedManHours=(1.0+ p/100 )*Main.totalMH;
		System.out.printf("\t\t\t = %.2f  (adjusted man-hours)",AdjustedManHours);
	}
	public double getAdjustedManHours() {
		return AdjustedManHours;
	}

}

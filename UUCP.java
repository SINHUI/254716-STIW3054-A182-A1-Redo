package ass1;

public class UUCP {
	
	private static final double T =0;
	static double total;
	double totalSum;
	
		UAW uaw=new UAW(T);
		UUCW uucw=new UUCW(T);
		
	public void run() {
		total=Main.totalA + Main.totalUC;

		System.out.printf("\t\t\tUUCP (Unadjusted Use Case Points) = %.2f\n",total);
	}
	
	
	
	
}


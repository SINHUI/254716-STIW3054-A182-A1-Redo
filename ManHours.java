package ass1;

public class ManHours extends MainFormula2 {
	public double ManHours;
	private static final double T = 0;
	
	
	public ManHours(double T) {
		super(T);
	}

	public void run() {
		if (Main.totalE<3) {
			System.out.println("\t\t\t(20 man-hours)");
		ManHours =Main.totalUCP*20;
		}
		else if (Main.totalE>3) {
			System.out.println("\t\t\t(28 man-hours)");
		ManHours =Main.totalUCP*28;	
		}
		System.out.printf("\t\t\t = %.2f  man-hours\n",ManHours);
	}

}

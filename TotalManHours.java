package ass1;

public class TotalManHours {
	
	private double TotalManHours;
	private static final double T =0;
	Report rp =new Report(T);
	AdjustedManHours ajmh = new AdjustedManHours();
	
	public void run() {
		TotalManHours =Main.totalAJMH+Main.totalRP; //Use Case Point
		System.out.printf("\t\t\t = %.2f  (total man-hours)",TotalManHours);
	}

}

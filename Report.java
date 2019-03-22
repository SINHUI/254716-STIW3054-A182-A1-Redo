package ass1;


public class Report extends MainFormula3 {//Weighting Reports For Complexity
	
	private static final double T = 0;
	
	UCP ucp =new UCP();
	
	public Report(double T) {
		super(T);
	}

		public void run() {
			System.out.println("\n\nStep 5: Please insert the quantity and average man-hours: ");
			super.textFormula("\tNo.\t","Report Type\t","Quantity\t"," Average Man-hours\t");
					String [] question= {"\tSimple\t  ","\tAverage\t  ","\tComplex\t  "};
			super.formula3("\tS",question,3,"Reporting man-hours");
	
		}
		
	}


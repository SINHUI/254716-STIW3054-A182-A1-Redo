package ass1;

public class TFactor extends MainFormula2 {//Weighting Technical Factors / Technical Complexity Factors (TCF)

	public TFactor(double T) {
		super(T);
	}
	public double step3TFactor() {
		return getTotal();
	}

	public void run()  {
			System.out.println("\n\nStep 3: Please insert number of assessment: ");
			super.textFormula("Factor","\t\t\tDescription\t\t\t","\t\tWeight\t\t","Project Rating\t");
		    String [] question= {"\t\tMust have a distributed solution\t\t\t ","\t\tMust respond to specific performance objectives\t\t ",
		    		             "\t\tMust meet end-user efficiency desires\t\t\t ","\t\tComplex internal processing\t\t\t\t ",
								 "\t\tCode must be reusable\t\t\t\t\t ","\t\tMust be easy to install\t\t\t\t\t ",
								 "\t\tMust be easy to use\t\t\t\t\t ","\t\tMust be portable\t\t\t\t\t ","\t\tMust be easy to change\t\t\t\t\t ",
								 "\t\tMust allow concurrent users\t\t\t\t ","\t\tIncludes special security features\t\t\t ",
								 "\t\tMust provide direct access for 3rd parties\t\t ","\t\tRequires special user training facilities\t\t "};
			double [] weight = {2,1,1,1,1,0.5,0.5,2,1,1,1,1,1};
			super.formula2(" T",question,weight,13,"Total TFACTOR");
			
		}
	
		}

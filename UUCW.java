package ass1;


public class UUCW extends Mainformula {//Weighting Use Case For Complexity/ Unadjusted Use Case Weight (UUCW)

	public UUCW(double T) {
		super(T);
	}

		public void run(){
			System.out.println("\n\nStep 2: Please insert number of use cases: ");
			textFormula("Actor Type","\tDescription\t\t","\tWeight\t"," Number of use cases\t");
			String [] question= {"Simple\t  ","Average\t  ","Complex\t  "};
			String[] description= {"\t3 or fewer transactions\t\t ","\t4 to 7 transactions\t\t ","\tGreater than 7 transaction\t "};
			double [] weight ={5,10,15};
			formula(question,description,weight,3,"Total Use Cases");
		}
	
		public double totalUucw(){
			
			return super.getTotal();
		}

	
		
}

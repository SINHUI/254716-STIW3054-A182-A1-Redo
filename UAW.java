package ass1;


public class UAW extends Mainformula {//Weighting Actors for complexity / Unadjusted Actor Weight (UAW)
	
	public UAW(double T) {
		super(T);
	}


		public void run(){
			System.out.println("\n\nStep 1: Please insert number of actors: ");
			textFormula("Use Case Type\t","\tDescription\t\t\t\t","Weight\t"," Number of Actors\t");
			
			String [] question= {"Simple\t   ","Average\t  ","Complex\t  "};
			String [] description= {"\t\tDefined API\t\t\t\t ","\t\tInteractive or Protocol driven interface ", "\t\tGraphical User Interface\t\t "};
			double [] weight =  {1,2,3};
			formula(question,description,weight,3,"Total Actor Points");


		}
		
public double totalUaw(){
			
			return super.getTotal();
		}
		
	
	
		
}

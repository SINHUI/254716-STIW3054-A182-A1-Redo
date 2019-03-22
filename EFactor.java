package ass1;

public class EFactor extends MainFormula2 {//Weighting Experience Factors / Environmental Complexity Factors (ECF)
	private double ECF;
	
	public EFactor(double T) {
		super(T);	
	}

 	public void run()  {
			System.out.println("\n\nStep 4: Please insert number of assessment: ");
			super.textFormula("Factor","\t\t\tDescription\t\t\t","Weight\t","\tProject Rating\t");
			String [] question= {"\t\tFamiliarity with FPT software process\t  ","\t\tApplication experience\t\t\t  ",
					             "\t\tParadigm experience (OO)\t\t  ","\t\tLead analyst capability\t\t\t  ",
								 "\t\tMotivation\t\t\t\t  ","\t\tStable requirements\t\t\t  ",
								 "\t\tPart-time workers\t\t\t ","\t\tDifficulty of programming language\t "};
			double [] weight = {1,0.5,1,0.5,0,2,-1,-1};
			super.formula2(" E",question,weight,8,"Total EFACTOR");
		
		}
 	
		}

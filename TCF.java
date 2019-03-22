package ass1;

public class TCF  {//Weighting Technical Factors / Technical Complexity Factors (TCF)
	private double TCF;
	public  double SzUC;
	private static final double T =0;
	
	UUCP uucp = new UUCP();
	TFactor tf = new TFactor(T);
	
	public void run() {
		
		TCF= 0.6+(0.01 *Main.totalTF ); //TCF= 0.6+(0.01 * TFACTOR)
		SzUC=Main.totalUUCP*TCF; //SzUC=size use case
			System.out.printf("\t\t\tTCF (Technical Complexity Factors) = %.2f\n",TCF);
			System.out.printf("\t\t\tSize of the software = %.2f\n",SzUC);
	}
	public double getSzUC() {
		return SzUC;
		
	}
	
		}




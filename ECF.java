package ass1;

public class ECF {
	public double ECF;

	private static final double T =0;

	EFactor ef = new EFactor(T);

	public void run() {
	
			ECF=1.4+(-0.03 * Main.totalEF); //ECF= 1.4+(-0.03 * EFACTOR)
			System.out.printf("\t\t\tECF (Environmental Complexity Factors)= %.2f\n",ECF);

			}
	public double getECF() {
		return ECF;
	
	}

	}
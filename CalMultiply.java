package ass1;

public class CalMultiply implements InCalculation  {
	int input;
	double weight;
	double totalActor=0;

	public double format(int input, double weight) {
		
		this.input = input;
		this.weight = weight;
		totalActor+=input*weight;
		return totalActor;
	}
	
	public double getTotal() {
		return totalActor;
	}
	
	
	

}

package ass1;

public class Main extends CalMultiply{
	private static final double T =0;
	static double totalA=0;
	static double totalUC=0;
	static double totalUUCP=0;
	static double totalTF=0;
	static double totalSZUC=0;
	static double totalEF=0;
	static double totalECF=0;
	static double totalUCP=0;
	static double totalMH=0;
	static double totalAJMH=0;
	static double totalRP=0;
	static int totalE=0;
	public static void main(String[] args) {
		
		
		UAW uaw =new UAW(T);
		uaw.run();
		totalA=uaw.total;
		
		UUCW uucw =new UUCW(T);
		uucw.run();
		totalUC=uucw.total;
		
		UUCP uucp =new UUCP();
		uucp.run();
		totalUUCP=UUCP.total;

		TFactor tf =new TFactor(T);
		tf.run();
		totalTF=tf.total2;
		
		TCF tcf =new TCF();
		tcf.run();
		totalSZUC=tcf.SzUC;
	
		EFactor ef = new EFactor(T);
		ef.run();
		totalEF=ef.total2;
		totalE=ef.totalE;
		
		ECF ecf = new ECF();
		ecf.run();
		totalECF=ecf.ECF;
		
		UCP ucp = new UCP();
		ucp.run();
		totalUCP=ucp.UCP;
		
		ManHours mh = new ManHours(T);
		mh.run();
		totalMH=mh.ManHours;
		
		AdjustedManHours ajmh =new AdjustedManHours();
		ajmh.run();
		totalAJMH=ajmh.AdjustedManHours;
		
		Report rp =new Report(T);
		rp.run();
		totalRP=rp.total3;
		
		TotalManHours tmh =new TotalManHours();
		tmh.run();
		
	
	}
	

}

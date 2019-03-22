package ass1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFormula2 extends CalMultiply {
	
	public double total2;
	public double totalB;
	public int totalE=0;
		
		void textFormula(String type,String description, String Weight, String num) {
			System.out.println("\n=============================================================================================================");
			System.out.println(type+" "+description+" "+Weight+" "+num+" ");
			System.out.println("\n=============================================================================================================");	
		}
		void formula2(String q,String[] question, double[] weight,int userInput, String ansName) { 
			CalMultiply cal=new CalMultiply();
		     
			int [] input = new int[userInput];
			int i;
			int E1_8=0;
			int x=2;
			boolean done = false;
			boolean haizz = false;
			double sum=0;
	
			
	 	for(i=0;i<userInput; i++) {
	 		Scanner scan = new Scanner(System.in);
	 		if(x==1) {
	 			i=0;
	 		System.out.print("\n"+q+(i+1)+""+question[i]+""+weight[i]+"\t\t");
	 		}
	 		else{System.out.print("\n"+q+(i+1)+""+question[i]+""+weight[i]+"\t\t");}
	 			try {
	 				input[i]=scan.nextInt();
	 				x=2;
	 					if(input[i]>=0 || input[i]<=5) {
	 						if(i>=0 && i<=5) {
	 							if(input[i]>=0 && input[i]<3) {
	 								E1_8++;
	 								}
	 							}	
	 							
	 							else if (i>5) {
	 								if (input[i]>3 && input[i]<=5) {
	 									E1_8++;
	 								}
	 							}
	 						}
	 					totalE=E1_8;
	 					haizz=true;
			   	
			   	  	if(input[i]<0 || input[i]>5) {
				   		do {
				   		try {
				   			if(i==0) {
				   				i=0;
				   				input[i]=0;
				   				   System.out.println("\n\t\t----------------------------");
								   System.out.println("\t\t Rate each factor from 0 to 5.");
								   System.out.println("\t\t----------------------------");
								   x=1;
								   haizz=true;  
				   			 }else {
				   				 i=i-1;
				   				 input[i]=0;
				   				 System.out.println("\n\t\t----------------------------");
				   				 System.out.println("\t\t  Rate each factor from 0 to 5.");
				   				 System.out.println("\t\t----------------------------");
				   				 haizz=true;
				   			     }  
				   		  }catch(Exception e) {	
				   		}
					   }while(!haizz);
				   		}
			   	 cal.format(input[i],weight[i]);
			   	sum=cal.getTotal();
				   }
	 			
		   catch (InputMismatchException e) { 
			   do {   
			   try {
				   Scanner scan2 = new Scanner(System.in); 
				   System.out.println("\n\t\t----------------------------");
				   System.out.println("\t\t   You must enter integer");
				   System.out.println("\t\t----------------------------"); 
				   if(x==1) {
					   i=0;
				   System.out.print("\n"+q+(i+1)+""+question[i]+""+weight[i]+"\t\t");
				   }
				   else {System.out.print("\n"+q+(i+1)+""+question[i]+""+weight[i]+"\t\t");}
				   input[i]=scan2.nextInt();
				   x=2;
				   if(input[i]<0 || input[i]>5) {
					   do {
					   		try {
					   			if(i==0) {
					   				i=0;
					   				input[i]=0;
					   				   System.out.println("\n\t\t----------------------------");
									   System.out.println("\t\t Rate each factor from 0 to 5.");
									   System.out.println("\t\t----------------------------");
									   x=1;
									   haizz=true;  
					   			 }else {
					   				 i=i-1;
					   				 input[i]=0;
					   				 System.out.println("\n\t\t----------------------------");
					   				 System.out.println("\t\t  Rate each factor from 0 to 5.");
					   				 System.out.println("\t\t----------------------------");
					   				 haizz=true;
					   			     }  
					   		  }catch(Exception e2) {	
					   		}
						   }while(!haizz);
				   		}
				   sum=sum+cal.format(input[i],weight[i]);
				   done=true;
				  
			   } catch (InputMismatchException e2) {
				
			   }
			   
			   }while(!done);
			   }
		   }
	 	totalB=cal.getTotal();
		total2 +=totalB;
		System.out.println("\n=============================================================================================================");
		System.out.println("\t\t\t"+ansName+" = "+ totalB);

		}
		public MainFormula2(double T) {
	 		total2 =T;
	 	}
	 	public double getTotal() {
	 		return total2;
	 	}
	 
}

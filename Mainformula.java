package ass1;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Mainformula extends CalMultiply{
	
	public double total;
	public double totalA;
		
		public void textFormula(String type,String description, String Weight, String num) {
			System.out.println("\n=============================================================================================================");
			System.out.println(type+" "+description+" "+Weight+" "+num+" ");
			System.out.println("\n=============================================================================================================");	
		}
		
	 	public void formula(String []question,String[] description, double[] weight,int userInput, String ansName) { 
	 		
	 	CalMultiply cal=new CalMultiply();
		int [] input = new int[userInput];
		int i;
		boolean done = false;
		boolean haizz = false;
		int x=2;
		double sum=0;
		double totalA;
		
		for(i=0;i<userInput; i++) {
			Scanner scan = new Scanner(System.in);
			
			if(x==1) {
				i=0;
						System.out.print("\n"+question[i]+description[i]+weight[i]+"\t\t");
							}
			else {
					System.out.print("\n"+question[i]+description[i]+weight[i]+"\t\t");
						}
		   try {
			   	input[i]=scan.nextInt();
			   	x=2;
			   	  	if(input[i]<0) {
				   		do {
				   		try {
				   			if(i==0) {
				   				input[i]=0;
				   				System.out.println("\n\t\t----------------------------");
								   System.out.println("\t\t   Only accept positive integer.");
								   System.out.println("\t\t----------------------------");
								   x=1;
								   haizz=true;
				   			}
				   			else {
				   			i=i-1;
				   			input[i]=0;
				   			
						   System.out.println("\n\t\t----------------------------");
						   System.out.println("\t\t   Only accept positive integer.");
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
					   System.out.print("\n"+question[i]+description[i]+weight[i]+"\t\t");
				   			}
				   else {System.out.print("\n"+question[i]+description[i]+weight[i]+"\t\t");}
				   input[i]=scan2.nextInt();
				   x=2;
				   if(input[i]<0) {
				   		do {
				   			try {
				   			if(i==0) {
				   				i=0;
				   				input[i]=0;
				   				System.out.println("\n\t\t----------------------------");
								   System.out.println("\t\t   Only accept positive integer.");
								   System.out.println("\t\t----------------------------");
								   x=1;
								   haizz=true;
				   			}
				   			else {
				   			i=i-1;
				   			input[i]=0;
						   System.out.println("\n\t\t----------------------------");
						   System.out.println("\t\t   Only accept positive integer.");
						   System.out.println("\t\t----------------------------");
						   haizz=true;
				   		}
				   			}catch(Exception e1) {
				   				
				   			}
						   
					   }while(!haizz);
				   		}
				   sum=sum+cal.format(input[i],weight[i]);
				   done=true;
			
				done=true;
				  
			   } catch (InputMismatchException e2) {
			
			   }
			   
			   }while(!done);
			   }
		   }	
		totalA=cal.getTotal();
		total +=totalA;
		System.out.println("\n=============================================================================================================");
		System.out.println("\t\t\t"+ansName+" = "+totalA);
		
		}
	 	
		public Mainformula(double T) {
	 		total=T;
	 	}
	 	public double getTotal() {
	 		return total;
	 	}
	 
}
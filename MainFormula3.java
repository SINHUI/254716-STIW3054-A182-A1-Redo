package ass1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFormula3 extends CalMultiply {
	public double total3;
	public double totalC;
	
	void textFormula(String type,String description, String Weight, String num) {
		System.out.println("\n=============================================================================================================");
		System.out.println(type+" "+description+" "+Weight+" "+num+" ");
		System.out.println("\n=============================================================================================================");	
	}
	
	public void formula3(String q,String[] question,int userInput, String ansName) { 
		CalMultiply cal=new CalMultiply();  
 		int [] qty = new int[userInput]; 
		int [] average = new int[userInput];
		int i;
		boolean done = false;
		boolean haizz = false;
		int x=2;
		double sum=0;

		for(i=0;i<userInput; i++) {
			Scanner scan = new Scanner(System.in);
			if(x==1) {
				i=0;
						System.out.print("\n"+q+(i+1)+""+question[i]+"\t\t");
							}
			else {
					System.out.print("\n"+q+(i+1)+""+question[i]+"\t\t");
						}
		   try {
			   	qty[i]=scan.nextInt();
			   	System.out.print("\t\t\t\t\t\t\t\t");
			   	average[i]=scan.nextInt();					   	
			   	x=2;
			   	  	if(qty[i]<0 || average[i]<0) {
				   		do {
				   		try {
				   			if(i==0) {
				   				//i=0;
				   				average[i]=0;
				   				qty[i]=0;
				   				System.out.println("\n\t\t----------------------------");
								   System.out.println("\t\t   Only accept positive integer.");
								   System.out.println("\t\t----------------------------");
								   x=1;
								   haizz=true;
				   			}
				   			else {
				   			i=i-1;
				   			average[i]=0;
				   			qty[i]=0;
				   			
						   System.out.println("\n\t\t----------------------------");
						   System.out.println("\t\t   Only accept positive integer.");
						   System.out.println("\t\t----------------------------");
						  
						   haizz=true;
				   		      }
						   
				   		}catch(Exception e) {
				   			
				   	    }
					   }while(!haizz);
				   		}
			   	 cal.format(average[i],qty[i]);
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
				   System.out.print("\n"+q+(i+1)+""+question[i]+"\t\t");
				   			}
				   else {System.out.print("\n"+q+(i+1)+""+question[i]+"\t\t");}
				   qty[i]=scan2.nextInt();
				   System.out.print("\t\t\t\t\t\t\t\t");
				   average[i]=scan2.nextInt();
				   x=2;
				   if(qty[i]<0 || average[i]<0) {
				   		do {
				   			try {
				   			if(i==0) {
				   				i=0;
				   				average[i]=0;
				   				qty[i]=0;
				   				System.out.println("\n\t\t----------------------------");
								   System.out.println("\t\t   Only accept positive integer.");
								   System.out.println("\t\t----------------------------");
								   x=1;
								   haizz=true;
				   			}
				   			else {
				   			i=i-1;
				   			average[i]=0;
				   			qty[i]=0;
						   System.out.println("\n\t\t----------------------------");
						   System.out.println("\t\t   Only accept positive integer.");
						   System.out.println("\t\t----------------------------");
						   haizz=true;
				   		}
				   			}catch(Exception e1) {
				   				
				   			}
						   
					   }while(!haizz);
				   		}
				   sum=sum+cal.format(average[i],qty[i]);
				done=true;
				  
			   } catch (InputMismatchException e2) {
				//done=false;
			   }
			   
			   }while(!done);
			   }
		   }		
		totalC=cal.getTotal();
		total3 +=totalC;
		System.out.println("\n=============================================================================================================");
		System.out.println("\t\t\t"+ansName+" = "+ sum);

		}
 	
	public MainFormula3(double T) {
 		total3 =T;
 	}
 	public double getTotal() {
 		return total3;
 	}
 

}

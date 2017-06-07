package pattern;



public class Xpattern {

	public static void main(String[]args) {
		//here we implement for loop which runs 5 times for row
		   for(int i=1;i<=5;i++){
			   //loop of five for column
			   for(int j=1;j<=5;j++){
				   //implementing the condition
				   if ((i==j)||(i+j==6)){
					   System.out.print("*");
				   }
				  /* else if
					   ((i+j)==6){
					   System.out.print("*");
				   }*/
				   else{
					   System.out.print(" ");
				   }
				   
				   }
			   //passing to the next line
			   System.out.println();
			   }
		   }
	
}


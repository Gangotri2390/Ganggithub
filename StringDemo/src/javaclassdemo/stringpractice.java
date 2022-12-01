package javaclassdemo;

public class stringpractice {

	  public static void main(String[] args) {
//		  System.out.println+{21+"welcom"+1+2);
		  System.out.println((1+2+3+ "Welcome" +5+6));
	  }


	
		{
	       int [][] matrix = {{4,5,2,6},{7,3,1,9},{4,9,2,5},{1,7,3,5}};
	       System.out.println("Original Matrix");
	       for(int i=0;i<matrix.length;i++)
	       {
		      for(int j=0;j<matrix[i].length;j++) 
		      {
			    System.out.print(matrix[i][j]+" ");
		      }
		     System.out.println();
	       }
	       System.out.println("Sum Of Columns");
	      for(int j=0;j<matrix.length;j++) 
	      {
		     int sum =0;
		      for(int i=0;i<matrix[j].length;i++)
	          {
			    sum = sum+matrix[i][j];
		     }
		   System.out.println("Sum of rows"+ (j+1)+ " is "+sum);
		  }
		
		}
	}
	



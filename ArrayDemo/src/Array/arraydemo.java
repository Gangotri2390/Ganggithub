package Array;

public class arraydemo {

	public static void main(String[] args) {
		
		        
		        // Step 1: create 2-dimensional array.
		        int[][] values = new int[4][4];
		        
		        // Step 2: assign three elements in it.
		        values[0][0] = 1;
		        values[1][1] = 2;
		        values[3][2] = 3;
		        
		        // Step 3: loop over top-level arrays.
		        for (int i = 0; i < values.length; i++) {
		            
		            // Step 4: loop and display sub-arrays.
		            int[] sub = values[i];
		            for (int x = 0; x < sub.length; x++) {
		                System.out.print(sub[x] + " ");
		            }
		            System.out.println();
		        }
		    }
		

	}



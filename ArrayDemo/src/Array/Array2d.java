package Array;

public class Array2d {

	public static void main(String[] args) {
		int arr[][] []= new int[3][2][3];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for(int k=0;k<arr[i][j].length;k++) {
				
				arr[i][j][k]= count;

				System.out.print(arr[i][j] [k]+ " ");

				count++;
			}
			System.out.println();
		}
	}
	}
}


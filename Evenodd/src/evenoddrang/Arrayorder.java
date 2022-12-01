package evenoddrang;

public class Arrayorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int original[]=new int[] {4,7,2,9,6};
int temp;
System.out.println("original numbers in array: ");
for (int i=0;i<original.length;i++) {
	System.out.println((original[i]));

}
for (int i=0;i<original.length;i++) {
	for (int j=i+1;j<original.length;j++) {
		if( original[i]>original[j]){
			temp=original[i];
			original[i]=original[j];
			original[j]=temp;
			
		}
		
	}
}
System.out.println("Numbers in Asending order:");
for (int i=0;i<original.length;i++) {
	System.out.println(original[i]);
}
for (int i=0;i<original.length;i++) {
	for (int j=i+1;j<original.length;j++) {
		if (original[i]<original[j]) {
			temp=original[i];
			original[i]=original[j];
			original[j]=temp;
		}
	}
}
	}

}

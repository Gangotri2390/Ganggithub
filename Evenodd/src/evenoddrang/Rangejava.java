package evenoddrang;
public class Rangejava{
	public static void main(String[] args) {
		char up=65;
		char up1=90;
		char lc=97;
		char lc1=122;
		{
			System.out.println("Print odd Upper Case:");
			while(up<=up1) 
			{
			
				if(up%2!=0)
					System.out.println(" "+up);
				up++;
			}
			System.out.println(" Print Even upper Case:");
			for(up=65;up<=up1; up++) {
				if(up%2==0)
					System.out.println("" +up);
				
			}
			System.out.println("Print odd lower Case");
			do {
			
				if(lc%2!=0)
					System.out.println(" " +lc);
				lc++;
			}while(lc<=lc1);
			System.out.println("Print even lower Case");
			for(lc=97;lc<=lc1;lc++) {
				if(lc%2==0)
					System.out.println(" "+lc);
		
			
			}
					
			}
		}
		
}
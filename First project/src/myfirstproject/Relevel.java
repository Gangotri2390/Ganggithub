package myfirstproject;

public class Relevel {

	public static void main(String[] args) {
		int m=12,n=4,res=0;
		if((m-n)<5)
			res=++m+n++;
		else
			res=--n+m+n++;
		System.out.println(res);
		}
		// TODO Auto-generated method stub

	}



package inheritance;

class  Classdemo extends Addition  {
	void display() {
		System.out.println("Iam sub Class");
	}
	


	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.display();
	}
//		// TODO Auto-generated method stub
//Addition obj=new Addition();
//obj.sum(10,12);
//obj.sum(16,19,20);
//	}

}

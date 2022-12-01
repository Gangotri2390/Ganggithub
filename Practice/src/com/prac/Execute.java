package com.prac;

public class Execute {
		private String Username;
		private String Passward;
		public void Set(String Username,String Passward) {
			this.Username=Username;
			this.Passward=Passward;
			
		}
		public String[]get(){
			String str[]= {Username,Passward};
			return str;
			
		}
}


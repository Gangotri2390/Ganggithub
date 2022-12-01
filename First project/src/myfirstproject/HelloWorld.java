package myfirstproject;





public class HelloWorld {
	

		public static void main(String[] args) {

			String str = "JobbersCafe@ 230132022";

			String numString = "";

			for (int i = 0; i < str.length(); i++) {
				int ascii = str.charAt(i);
				char ab=(char)ascii;

				// ascii value of 0 is 48 and of 9 is 57
				if (ab >= 48 && ab <= (57)) {
					numString +=  ab;
				}
			}
			// Convert number in string form to
			//an integer value
			int numbers = Integer.parseInt(numString);

			System.out.println(numbers);
		}
	}

	


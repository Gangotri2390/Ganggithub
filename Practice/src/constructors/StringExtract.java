package constructors;

public class StringExtract {

	static String extractInt(String str) {

		str = str.replaceAll("[^0-9]", " ");

		str = str.replaceAll(" +", " ");

		if (str.equals("")) 
			return "-1";

		return str;

		}
	

	public static void main(String[] args) {
		String str = "JobbersCafe@20132022";
		System.out.println(str);

		String s = "20132022";
		int num = Integer.parseInt(s);
		int sum = 0;
		System.out.println(num);
		while (num >0) {
			sum = sum + num % 10;
			num = num / 10;

		}

	
		System.out.println(sum);

	}

}

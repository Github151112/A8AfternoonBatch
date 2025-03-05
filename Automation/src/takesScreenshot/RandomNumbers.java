package takesScreenshot;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random r = new Random();
		int no = r.nextInt(100000);
		System.out.println(no);
		String name = "Aman" + no;
		System.out.println(name);
	}

}

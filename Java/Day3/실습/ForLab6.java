package day3;

public class ForLab6 {

	public static void main(String[] args) {
		final char C = '&';
		int num = (int)(Math.random()*6)+5;

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(C);
			}
			System.out.println();
		}

	}

}

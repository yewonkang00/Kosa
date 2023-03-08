package day2;

public class SwitchLab2 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*5)+1;
		int ans;
		
		switch(num) {
			case 1 : ans = 300 + 50;
						break;
			case 2 : ans = 300 - 50;
						break;
			case 3 : ans = 300 * 50;
						break;
			case 4 : ans = 300 / 50;
						break;
			default : ans = 300 % 50;
		}
		System.out.println("결과값 : " + ans);
	}

}

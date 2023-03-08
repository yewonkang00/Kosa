package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		int num = (int)(Math.random()*5)+1;
		int ans;
		
		if(num == 1) ans = 300 + 50;
		else if(num == 2) ans = 300 - 50;
		else if(num == 3) ans = 300 * 50;
		else if(num == 4) ans = 300 / 50;
		else ans = 300 % 50;
		
		System.out.println("결과값 : " + ans);
	}

}

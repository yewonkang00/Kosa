package day2;

public class ForLab3 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10) +1;
		int num2 = (int)(Math.random()*11) +30;
		
		int sum = 0;
		for(int i = num; i <= num2; i++) {
			if(i % 2 == 0) sum += i;
		}
		
		System.out.println(num + " 부터 " + num2 + " 까지의 짝수의 합 : " + sum);
	}
}

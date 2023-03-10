package day2;
/*
1. 1부터 10사이의 난수를 하나 추출한다.
2. 30부터 40사이의 난수를 하나 추출한다.
3. 첫번째 난수부터 두번째 난수 까지의 숫자들 중에서 짝수의 합을 구해 다음 형식으로 출력한다.
    X 부터 Y 까지의 짝수의 합 : XX
 */
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

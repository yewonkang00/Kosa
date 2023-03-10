package day3;
/*
1. 1 ~ 2 사이의 난수를 추출한다.
2. 추출한 난수가 1이면 홀수단의 구구단을, 추출한 난수가 2이면 짝수단을 출력한다.
*/
public class ForLab9 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 2) +1;
		
		for(int i = num; i <= 9; i+=2) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i+"x"+j+"="+i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}

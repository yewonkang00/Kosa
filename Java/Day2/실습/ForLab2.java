package day2;
/*
다음과 같은 결과가 출력되도록 구현한다.
    9 : 홀수
    8 : 짝수
    7 : 홀수
    6 : 짝수
    5 : 홀수
    4 : 짝수
 */
public class ForLab2 {

	public static void main(String[] args) {
		for(int i = 9; i >= 4; i--) {
			if(i % 2 == 0) 
				System.out.println(i + ": 짝수" );
			else 
				System.out.println(i + ": 홀수" );
		}
	}

}

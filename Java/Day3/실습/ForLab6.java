package day3;
/*
1. char 타입으로 상수를 하나 만들어 '&'로 초기화 한다.
    (상수를 만드는 방법은 변수 선어시 앞에 final 을 붙인다.)
2. 5부터 10사이의 난수를 하나 추출한다.
3. 추출된 숫자가 5라면 반복문을 사용하여 다음과 같이 출력한다.

	&
	&&
	&&&
	&&&&
	&&&&&
    
     추출된 숫자가 7이라면 반복문을 사용하여 다음과 같이 출력한다.

	&
	&&
	&&&
	&&&&
	&&&&&
	&&&&&&
	&&&&&&&
 */
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

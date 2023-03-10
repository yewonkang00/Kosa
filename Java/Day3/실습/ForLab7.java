package day3;
/*
1. STAR 라는 상수를 만든고 '*'으로 초기화 한다.
2. 다음과 같은 결과가 되도록 구현한다.

    *******
    ******
    *****
    ****
    ***
    **
    *
 */
public class ForLab7 {

	public static void main(String[] args) {
		final char STAR = '*';
		
		for(int i = 7; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(STAR);
			}
			System.out.println();
		}
	}

}

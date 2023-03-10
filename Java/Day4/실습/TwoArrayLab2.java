package day4;
/*
1. 다음의 내용대로 char 타입의 2차원 배열을 생성한다.
 
         'B', 'C', 'A', 'A'
         'C', 'C', 'B', 'B'
         'D', 'A', 'A', 'D'

2. 4개의 원소를 갖는 int 타입의 배열을 생성한다.
    첫번째 원소에는 'A' 문자의 개수    
    두번째 원소에는 'B' 문자의 개수    
    세번째 원소에는 'C' 문자의 개수    
    네번째 원소에는 'D' 문자의 개수    
    를 저장한다.

3. 출력형식
    A 는 x개 입니다.
    B 는 x개 입니다.
    C 는 x개 입니다.
    D 는 x개 입니다.
 */
public class TwoArrayLab2 {

	public static void main(String[] args) {
		char[][] alpha = { 
								{'B', 'C', 'A', 'A'},
								{'C', 'C', 'B', 'B'},
								{'D', 'A', 'A', 'D'}
							};
		
		int[] cnt = {0, 0, 0, 0};
		for(int i = 0; i < alpha.length; i++) {
			for(int j = 0; j < alpha[0].length; j++) {
				cnt[alpha[i][j]-'A']++;
			}
		}
		
		for(int i = 0; i < cnt.length; i++) {
			System.out.println((char)('A'+i) + " 는 " + cnt[i] + "개 입니다.");
		}

	}

}

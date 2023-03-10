package day2;
/*
1. 1부터 5사이의 랜덤값을 추출한다.
2. 추출된 값이 1이면 300 과 50 의 덧셈 연산을 처리한다.
    추출된 값이 2이면 300 과 50 의 뺄셈 연산을 처리한다.
    추출된 값이 3이면 300 과 50 의 곱센 연산을 처리한다.
    추출된 값이 4이면 300 과 50 의 나눗셈 연산을 처리한다.
    추출된 값이 5이면 300 과 50 의 나머지 연산을 처리한다.
3. 출력 형식(단, 결과를 출력하는 수행문장은 제일 아래에 한 번만 구현한다.)
    "결과값 : XX"
 */
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

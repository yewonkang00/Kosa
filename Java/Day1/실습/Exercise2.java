package day1;
/*
 * (1) int 타입의 변수 2개를 선언하고 각각 35, 10 으로 초기화 한다. 
 * (2) 나눈 몫과 나머지를 구하여 제시된 출력 형식과 같이 출력하는 프로그램을 작성하시오. 
 */
public class Exercise2 {

	public static void main(String[] args) {
		int a = 35;
		int b = 10;

		System.out.println(a + " 를 " + b + " 으로 나눈 결과 몫은 " + a/b + " 이고 나머지는 " + a%b + " 입니다.");
		System.out.printf("%d 를 %d 으로 나눈 결과 몫은 %d 이고 나머지는 %d 입니다.", a, b, a/b, a%b);
	}
}

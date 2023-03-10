package day2;
/*
1. num 이라는 변수를 int 타입으로 선언하여 1~26 사이의 난수값을 추출하여 저장한다.   
2. num이 1이면 'A' 문자, 2면 'B' 문자 .... 26이면 'Z' 문자를 다음 형식으로 출력한다.

    1이 추출된 경우라면  		
	추출된 숫자 : 1
	A
    3이 추출된 경우라면  		
	추출된 숫자 : 3
	C
    26이 추출된 경우라면  		
	추출된 숫자 : 26
	Z
 */
public class AlphaTest {

	public static void main(String[] args) {
		int num = (int)(Math.random()*26) +1;
		char ans;
		
		ans = (char)('A'+num-1);
		
		System.out.println("추출된 숫자 : " + num);
		System.out.println(ans);

	}

}

package day4;
/*
1. 'J', 'a', 'v', 'a' 라는 element 로 구성되는 char 타입의 배열을 만든다.
2. 각 원소들의 값에서 대문자는 소문자로 소문자는 대문자로 변환하여 저장한다.
3. 배열의 element 들을 다음과 같이 출력한다.
     j
    A
    V
    A
 */
public class ArrayLab3 {

	public static void main(String[] args) {
		char[] word = {'J', 'a', 'v', 'a'};
		
		for(int i = 0; i < word.length; i++) {
			if(word[i] >= 'a') {
				word[i] -= 32;
			}
			else {
				word[i] += 32;
			}
			System.out.println(word[i]);
		}

	}

}

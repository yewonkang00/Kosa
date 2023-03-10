package day1;
/*
 * (1) char 타입의 변수 name1, name2, name3 를 선언하고 본인 이름의 각 문자들을 문자 리터럴로 만들어 각각 저장한다.
 * (2) 이름을 하나의 행에 출력한다.  
 */
public class Exercise3 {

	public static void main(String[] args) {
		char name1 = '강';
		char name2 = '예';
		char name3 = '원';
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
		System.out.println("" + name1+name2+name3);
		System.out.printf("%c%c%c\n", name1, name2, name3);
	}
}

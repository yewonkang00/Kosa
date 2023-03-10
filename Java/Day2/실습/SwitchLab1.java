package day2;
/*
1. 다음 기능을 if 문이 아닌 switch 문으로 변경하여 구현한다.
2. grade 의 값이 1 또는 2 또는 3이면 다음 결과를 출력한다.
   "x 학년은 저학년입니다."
3. grade 의 값이 4 또는 5 또는 6이면 다음 결과를 출력한다.
   "x 학년은 고학년입니다."
 */
public class SwitchLab1 {

	public static void main(String[] args) {
		int grade = (int)(Math.random()*6)+1;
		
		switch(grade) {
			case 1 :
			case 2 :
			case 3 : 
					System.out.println(grade+" 학년은 저학년입니다.");
					break;
			case 4 :
			case 5 :
			case 6 :
					System.out.println(grade+" 학년은 고학년입니다.");
					break;
		}
	}

}

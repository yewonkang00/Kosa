package day3;
/*
다음 기능을 반복하여 처리하는 자바 프로그램을 구현하는데 제어문 선택은 임의로 한다.
   (1) 10부터 20사이의 난수를 하나 추출한다.
   (2) 추출된 숫자가 3의 배수이거나 5의 배수이면 
  	 1부터 이 숫자까지의 합을 출력하고 다시 난수 추출부터 수행을 시작한다.
   (3) 추출된 숫자가 11 이거나 17이거나 19이면 반복문을 종료한 후에
	 "x회 반복함" 를 출력하고 종료한다.(여기에서 반복횟수의 기준은 (2)번의 합을 출력한 횟수임)
   (4) 위에서 제시한 조건 외의 값이 추출되면 
     "재수행" 이라는 메시지를 출력하고 다시 난수 추출부터 수행을 시작한다.
 */
public class ControlLab1 {

	public static void main(String[] args) {
		int num;
		int sum;
		int cnt = 0;
		
		while(true) {
			num = (int)(Math.random()*11)+10;

			if(num % 3 == 0 || num % 5 == 0) {
				sum = 0;
				for(int i = 1; i <= num; i++) {
					sum += i;
				}
				cnt++;
				System.out.println(sum);
			}
			
			else if(num == 11 || num == 17 || num == 19) {
				break;
			}
		
			else {
				System.out.println("재수행");
			}
		}
		System.out.println(cnt + "회 반복함");

	}

}

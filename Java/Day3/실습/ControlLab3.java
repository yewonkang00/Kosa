package day3;
/*
  다음 기능을 반복하여 처리하는 자바 프로그램을 구현한다.

   1부터 120까지의 값을 추출하여 
   추출된 숫자가 50 미만이면 "X : 50 미만"을 출력하고
	  3, 13, 23, 33, 43 인 경우에만 "X : *듀크팀*" 을 출력한다.
   추출된 숫자가 50 이상이고 80이하면 "X : 50 이상 80 이하"를 출력하고
	  70~79 인 경우에만 "X : *턱시팀*" 을 출력한다.
   추출된 숫자가 81 이상이고 100이하면  
      아무것도 출력하지 않고 다시 난수 추출부터 진행한다.
   101~120 이면
      아무것도 출력하지 않고 수행을 종료한다.

   단!! 메시지 출력은 System.out.printf() 로 하며 이 API 를 한번만 호출하여 해결해 본다.
 */
public class ControlLab3 {

	public static void main(String[] args) {
		int num;
		String ans;
		
		while(true) {
			num = (int)(Math.random()*120)+1;
			ans = "";
			
			if(num >= 101) 
				break;
			
			else if(num >= 81) 
				continue;
			
			else if(num >= 50) {
				ans += num + " : 50 이상 80 이하\n";
						
				if(num >= 70 && num <= 79) {
					ans += "   " + num + " : *턱시팀*\n";
				}
			}
			
			else {
				ans += num + " : 50 미만\n";
				
				if(num % 10 == 3) {
					ans += "   " + num + " : *듀크팀*\n";
				}
			}
			
			System.out.printf("%s", ans);
		}

	}

}

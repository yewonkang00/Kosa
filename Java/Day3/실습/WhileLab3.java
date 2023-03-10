package day3;
/*
   0부터 30사이의 난수를 추출한다.
    추출된 숫자가 1이면 'A', 2 이면 'B', ... 26이면 'Z' 를 출력하는데
    계속 난수 추출과 출력을 반복하다가  0이 추출되거나  27~30이 추출되면 반복을 끝낸다.

    반복하는 동안 출력형식 :  	1-A, 65, 0x41
			5-E, 69, 0x45
			   :
    마지막에는 "출력횟수는 x 번입니다"를 출력하고 종료한다.
 */
public class WhileLab3 {

	public static void main(String[] args) {
		int num;
		int cnt = 0;
		
		while(true) {
			num = (int)(Math.random()*31);
			if(num >= 27 || num == 0) 
				break;
			System.out.printf("%d-%c, %2$d, 0x%2$X\n", num, num+64);
			cnt++;		
		}
		System.out.println("출력횟수는 " + cnt + " 번입니다");
		

	}

}

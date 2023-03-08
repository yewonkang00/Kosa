package day3;

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

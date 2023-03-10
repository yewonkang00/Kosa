package day3;
/*
1. 3부터 10사이의 난수를 추출한다.(첫 번째 난수)
2. 1부터 3사이의 난수를 추출한다.(두 번째 난수)
3. 두 번째 난수값이 1이면 "*"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
   	두 번째 난수값이 2이면 "$"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
    두 번째 난수값이 3이면 "#"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
 */
public class ForLab5 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*8)+3;
		int num2 = (int)(Math.random()*3)+1;

		char c;
		if (num2 == 1) c = '*';
		else if(num2 == 2) c = '$';
		else c = '#';
		
		for(int i = 0; i < num1; i++) {
			System.out.print(c);
		}
	}

}

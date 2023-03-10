package day4;
/*
1부터 45 사이의 난수 6개를 추출하여 다음 형식으로 출력한다.
    단, 6개 숫자는 중복을 허용하지 않는다.

    [ 출력형식 ]

    오늘의 로또 번호 - x, x, x, x, x, x
 */
public class LottoMachine1 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		
		System.out.print("오늘의 로또 번호 - ");
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random()*45) + 1;

			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i < 5) System.out.print(arr[i]+", ");
			else System.out.println(arr[i]);
		}
	}
}

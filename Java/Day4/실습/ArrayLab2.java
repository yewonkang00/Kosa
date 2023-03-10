package day4;
/*
1. 10개의 숫자(정수)를 저장할 수 있는 배열을 하나 만든다.
2. 각각의 element로  4부터 20사이의 난수를 추출하여 저장한다.
3. 모든 원소의 합을 구한다.
4. 다음과 같은 형식으로 출력한다.

    모든 원소의 값 : x,x,x,x,x,x,x,x,x,x
    모든 원소의 합 : xxx
 */
public class ArrayLab2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		int sum = 0;
		System.out.print("모든 원소의 값 : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*17) + 4;
			sum += arr[i];
			
			if(i < arr.length-1) System.out.print(arr[i] + ",");
			else System.out.println(arr[i]);
		}
		
		System.out.print("모든 원소의 합 : " + sum);
	
	}

}

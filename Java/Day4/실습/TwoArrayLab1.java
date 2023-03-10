package day4;
/*
1. 4개의 행과 4개의 열을 갖는 int 타입의 2차원 배열을 생성한다.
2. 다음과 같은 구성이 되도록 생성된 2차원 배열에 데이터를 대입한다.
    10, 12, 14, 16
    18, 20, 22, 24
    26, 28, 30, 32
    34, 36, 38, 40
    
3. 출력형식
    1행 1열의 데이터 : 10
   	3행 4열의 데이터 : 32
	행의 갯수 : 4
	열의 갯수 : 4
	3행의 데이터들 : 26 28 30 32
	2열의 데이터들 : 12 20 28 36
             왼쪽 대각선 데이터들 : 10 20 30 40
             오른쪽 대각선 데이터들 : 16 22 28 34
(*) 이 실습 문제를 해결할 때 제시된 배열은 4행 4열이지만 3행 3열 또는 5행 5열 등
       사이즈가 다른 정방행열인 경우에도 요구사항이 처리될 수 있게 구현한다.    
 */
public class TwoArrayLab1 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int row = arr.length;
		int col = arr[0].length;
		
		int num = 10;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = num;
				num += 2;
			}
		}
		
		System.out.println("1행 1열의 데이터 : " + arr[0][0]);
		System.out.println("3행 4열의 데이터 : " + arr[2][3]);
		System.out.println("행의 갯수 : " + arr.length );
		System.out.println("열의 갯수 : " + arr[0].length );
		
		System.out.print("3행의 데이터들 : ");
		for(int i = 0; i < col; i++) {
			if(i == col-1)
				System.out.println(arr[2][i]);
			else
				System.out.print(arr[2][i] + " ");
		}
		
		System.out.print("2열의 데이터들 : ");
		for(int i = 0; i < col; i++) {
			if(i == col-1)
				System.out.println(arr[i][1]);
			else
				System.out.print(arr[i][1] + " ");
		}
		
		System.out.print("    왼쪽 대각선 데이터들 : ");
		for(int i = 0; i < col; i++) {
			if(i == col-1)
				System.out.println(arr[i][i]);
			else
				System.out.print(arr[i][i] + " ");
		}
		
		System.out.print("    오른쪽 대각선 데이터들 : ");
		for(int i = 0; i < col; i++) {
			if(i == col-1)
				System.out.println(arr[i][col-1-i]);
			else
				System.out.print(arr[i][col-1-i] + " ");
		}
		
	}

}

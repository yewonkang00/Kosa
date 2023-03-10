package day4;
/*
1. 5개의 행과 3개의 열을 갖는 int 타입의 2차원 배열을 생성하여 다음과 같이 출력한다.

	0	0	0	
	0	0	0	
	0	0	0	
	0	0	0	
	0	0	0	
 
2. 2번에서 만든 2차원 배열에 다음과 같이 구성되도록 데이터를 대입한다.
	
	1	0	0		
	2	6	0		
	3	7	9		
	4	8	0		
	5	0	0	
 */
public class TwoArrayLab5 {

	public static void main(String[] args) {
		int[][] arr = new int[5][3];
		int row = arr.length;
		int col = arr[0].length;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = 0;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(j == 0) {
					arr[i][j] = i+1;
				}
				else if(i > 0 && i < 4 && j == 1) {
					arr[i][j] = arr[i][j-1] + 4;
				}
				else if(i == 2 && j == 2) {
					arr[i][j] = arr[i][j-1] + 2;
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

package day4;
/*
1. 다음 사양의 int 타입 2차원 배열을 생성한다.

    1행   10, 20, 30, 40, 50
    2행   5, 10, 15
    3행  11, 22, 33, 44
    4행  9, 8, 7, 6, 5, 4, 3, 2, 1

2. 행단위 합을 구하여 다음과 같이 출력한다.

    1행의 합은 x 입니다.
    2행의 합은 x 입니다.
    3행의 합은 x 입니다.
    4행의 합은 x 입니다.
 */
public class TwoArrayLab4 {

	public static void main(String[] args) {
		int[][] arr = {
								{10, 20, 30, 40, 50},
								{5, 10, 15},
								{11, 22, 33, 44},
								{9, 8, 7, 6, 5, 4, 3, 2, 1}
						};
		
		int[] sum = {0, 0, 0, 0};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "행의 합은 " + sum[i] + " 입니다.");
		}

	}

}

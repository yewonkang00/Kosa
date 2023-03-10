package day4;
/*
   다음의 내용대로 int 타입의 2차원 배열을 생성한다.
   데이터는 4주간의 요일별 게임 시간이다.

            일 월  화  수 목 금  토  
   1주 	5,  2,  1,  0,  2,  3,  6
   2주	4,  3,  2,  1,  1,  0,  5
   3주	3,  1,  2,  1,  3,  1,  3
   4주	4,  3,  1,  0,  4   2,  7
   
   월별 게임시간의 합을 구하고 7개의 방을 갖는 int 타입의 배열을 생성해서 저장하고 출력한다. 이 때 저장 순서는 일~ 토 순이다.

	일요일 : 16시간
	월요일 : 9시간
	화요일 : 6시간
	수요일 : 2시간
	목요일 : 10시간
	금요일 : 6시간
	토요일 : 21시간

   주별 게임 시간의 합을 구하고 7개의 방을 갖는 int 타입의 배열을 생성해서 저장하고 출력한다.

	1주차 : 19시간
	2주차 : 16시간
	3주차 : 14시간
	4주차 : 21시간
 */
public class TwoArrayLab3 {

	public static void main(String[] args) {
		int[][] arr = {
							{5, 2, 1, 0, 2, 3, 6},
							{4, 3, 2, 1, 1, 0, 5},
							{3, 1, 2, 1, 3, 1, 3},
							{4, 3, 1, 0, 4, 2, 7}
						};
		
		int[] day = {0, 0, 0, 0, 0, 0, 0};
		int[] week = {0, 0, 0, 0};
		char[] days = {'일', '월', '화', '수', '목', '금', '토'};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				week[i] += arr[i][j];
				day[j] += arr[i][j];
			}
		}
		
		for(int i = 0; i < days.length; i++) {
			System.out.println(days[i] + "요일 : " + day[i] + "시간");
		}
		
		System.out.println();
		
		for(int i = 0; i < week.length; i++) {
			System.out.println(i+1 + "주차 : " + week[i] + "시간");
		}

	}

}

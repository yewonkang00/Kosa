package day3;
/*
다음과 같은 결과가 되도록 구현한다.

   	********** 
	 ********** 
  	  ********** 
 	   ********** 
	    **********
 */
public class ForLab8 {

	public static void main(String[] args) {
		final String STAR = "**********";
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(STAR);
		}
	}
}

package day3;

public class ControlLab3 {

	public static void main(String[] args) {
		int num;
		String ans;
		
		while(true) {
			num = (int)(Math.random()*120)+1;
			ans = "";
			
			if(num >= 101) 
				break;
			
			else if(num >= 81) 
				continue;
			
			else if(num >= 50) {
				ans += num + " : 50 이상 80 이하\n";
						
				if(num >= 70 && num <= 79) {
					ans += "   " + num + " : *턱시팀*\n";
				}
			}
			
			else {
				ans += num + " : 50 미만\n";
				
				if(num % 10 == 3) {
					ans += "   " + num + " : *듀크팀*\n";
				}
			}
			
			System.out.printf("%s", ans);
		}

	}

}

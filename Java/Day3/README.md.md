  
- 상수 : 한번 값이 들어가면 바꾸지 못함. 관례적으로 대문자로 씀
    
-   Java 5
    
    for(변수선언 : 배열 또는 컬렉션 객체)
    
    배열이나 컬렉션 객체가 가지고 있는 데이터 값들에 대한 반복 수행 문장
    
<br/>

#### [While 문]

	   while(조건식)
		   반복수행문장
    
-   조건식이 처음부터 거짓이면 반복문이 수행되지 않음
    
-   조건식에 true를 넣으면 무한루프
    
		while(true) {
			if(조건식)
			break;
			
			반복수행문장
		}
		
		수행문장
    
<br/>

#### [Break]

-   반복문을 빠져나가는 코드
    
-   break는 중첩된 반복문에서 쓰였을 때 가장 가까운 반복문만 빠져나감
    
-   밖의 for문에 이름(라벨)을 지정하여 break 할 때 입력하면 모든 for문을 빠져나갈 수 있음
    
    ```sql
    unico: for(int dan = 1; dan <= 9; dan++) {
    			for(int num=1; num <= 9; num++) {
    				result = dan*num;
    				if (result >= 30)
    					break unico;
    				System.out.print(dan + "x" + num + "=" + result + "\\t");
    			}
    			System.out.println();
    }
    ```
    
    break 2; 이런 식으로 숫자를 지정하면 한번에 2개 for문을 빠져나감
    
<br/>

#### [Continue]

-   continue를 만나면 블록 내의 남아있는 코드를 수행하지 않고 계속해서 다음 반복으로 넘어간다.

<br/>

#### [Printf]

-   int exprSum(int… p) → int…은 argument 개수 제한 없다. 가변 argument
    
    or int exprSum(int[] p) 로도 가능
    
-   printf(”%d”, 100) → %d는 포맷 문자
    
    -   %d : 10진수
        
        %,d : 천 단위마다 콤마 나타내줌 (1,000,000원)
        
    -   %x : 16진수, %X : 알파벳 문자가 대문자로
        
        문자형은 %x에 매핑이 안되므로 int로 캐스팅해야함
        
        ex) System.out.printf("0x%X", (int)'A’);
        
    -   %o : 8진수
        
    -   %c : 하나의 문자
        
    -   %b : boolean
        
    -   %f : 소수점을 가지고 있는 수 형태 (소수점 6자리까지, 7자리에서 반올림)
        
        %.2f : 소수점 둘째 자리까지 반올림
        
    -   %e : 지수형태
        
    -   %s : 문자열
        
        %10s : 왼쪽으로 추가 여백이 생김
        
        %-10s : 오른쪽으로 추가 여백이 생김
        
-   포맷문자가 둘 이상인데, argument는 하나일 때 포맷문자 앞에 %1$ 가 있으면 오류가 안나고 첫번째 argument로 매핑됨
    
    ex) System.out.printf("%d %1$x %1$o %1$c\n", 100);
    
<br/>

자바가 이미 정해둔 api

- System.out : 표준 출력 장치 (화면)
- System.in : 표준 입력 장치 (키보드)
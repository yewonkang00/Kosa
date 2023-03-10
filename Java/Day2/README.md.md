-   Math.random() 함수 : 0.0이상 1.0 미만의 수 중 랜덤으로 추출
    <br/>
-   자바의 산술 이항 연산
    
    1.  int 타입보다 작은 타입(char, short, byte)은 int 타입으로 변환되어 연산 수행
        
    2.  두 항의 타입이 다를 때는 값이 손실되지 않는 범위 내에서 하나의 타입으로 일치시켜 연산 수행
        
    
    char + char → int
    
    short + short → int
    
    byte + byte → int
    
    char + long → long
    
    int + long → long
    
    long + float → float
    
    double + float → double
    
    <br/>
    <br/>
    
-   **대입연산**
    
    l-value = r-value
    
    l-value > r-value 일 때 : 자동 형 변환
    
    l-value < r-value 일 때 : 강제 형 변환(연산자 이용) l-value=(l-value의 타입)r-value
    
    (예외 : boolean)
    
    <br/>
    <br/>
    
-   **증감 연산자**
    
    ++, - - : 단항 연산자(전위형, 후위형)
    
    주어진 항의 값을 1 증가 또는 감소
    
    리터럴은 항으로 사용 불가
    
    ++num, num++,--su, su--
    
    int result = ++num; // 먼저 1 증가
    
    int result = num++; // 나중에 1 증가
    
    <br/>
    <br/>
    
-   **조건 연산자 (3항 연산자)**
    
    조건식(연산 결과가 boolean 타입인 식) ? 참일 때 수행할 식 : 거짓일 때 수행할 식
    
    <br/>
    <br/>
    
-   메소드 이름은 동사, 변수 이름은 명사로 주로 함 
    (둘다 소문자로 쓰는 것이 일반적)
    
-   클래스 명은 대문자로 시작
    
    <br/>
    <br/>
    
-   **Switch 문**
    
    식 : int(byte, short, char), String, enum
    
    switch (식) {
    
    case 비교값1 : 수행문장1;
    
    case 비교값2 : 수행문장2; 수행문장3;
    
    case 비교값3 : 수행문장4;
    
    default : 수행문장5;
    
    }
    
    -default는 생략 가능, 모든 case에 해당하지 않는 다면 default 수행
    
    -case문에 break를 넣지 않으면 조건에 해당 여부와 무관하게 남은 case문이 다 실행 된다.
    
    -switch 문으로 작성한 코드는 if문으로도 구현 가능
    
    <br/>
    <br/>
    
-   **자바의 제어문**
    
    -   조건제어문 (선택제어문) : if, switch
    -   반복제어문 : for, while, do~while
    -   분기제어문 : break, continue
    
    for : 반복 횟수를 이미 알고 있을 때, 배열이나 컬렉션과 같은 데이터들의 묶음으로 반복
    
    while : 어떠한 조건이 만족되는 동안 반복
    
    <br/>
    <br/>
    
-   자바의 for 문 : 2가지
    
    for(초기식; 조건식; 증감식)
    
    반복 수행 문장
    
    for(int su = 1; su ≤ 10; su++)
    
    result = result + su;
    
    for(;;) → 무한루프 → while(true)
        
    <br/>
    <br/>
    
-   논리연산자 : &&, || → 이항연산자로서 피연산자가 boolean 타입이어야 함
    
    <br/>
    
-   비트연산자 : &, | → 이항연산자로서 피연산자가 정수형, 논리형도 가능
    
    ex) 8 & 7 → 00001000 & 00000111 → 00000000
    
    2진수로 바꾸어 같은 자리끼리 계산, &는 값이 서로 다를 경우 0, 같을 경우 1
    
    8 | 7 → 00001000 | 00000111 → 00001111
    
    |는 1이 하나라도 있을 경우 1, 아닐 경우 0
public class hello
{	
	public static void main(String[] args)
	{
	// 주석은 실행에 영향을 안미친다.
	System.out.println("안녕하세요"); //테스트
	
	/*
	//System.out.println("출력이 되나요..");
	*/
	System.out.print(7);
	System.out.println(3);
	System.out.println(3.14);
	System.out.println("자바~~~");
	System.out.println("문자열끼리" + "연결도 가능합니다");
	System.out.println("숫자" + 3 + 7 + "과 문자열의 연결도 가능합니다"); // (자동형변환) 문자 + 숫자 문자로 시작하면 뒤에도 자동으로 문자로 인식함
	System.out.println(3 + 7 + "이번결과는.."); // (자동형변환) 숫자 + 숫자 + 문자로 시작하면 더하기연산
	
	// printf 는 기본적으로 서식문자 갖고있다. (%d, %f, %c, %s)
	// %d 정수 %f 실수 %c 문자 %s 문자열
	System.out.printf("정수 %d 입니다. \n", 123);
	System.out.printf("실수 %f 입니다. \n", 123123.125531);
	System.out.printf("실수 %.2f 입니다. \n", 26.1256); // 자동으로 반올림됨
	System.out.printf("문자 %c 입니다. \n", '가');
	System.out.printf("문자 %c 입니다. \n", 'A');
	System.out.printf("문자열 %s 입니다. \n", "테스트");
	System.out.printf("문자열 %s 입니다. \n", "12313");
	
	/*출력예 ) 수식을 출력하면 계산 결과가 출력됩니다.
	  10 + 5 = 15
	  내 생일은 2005년 5월 8일 입니다.
	  단) printf 메서드 사용
	  2번째 라인은 10, 5, 10+5 
	  3번째 라인은 2016-11, 5, 8 */
		
		System.out.printf("%s \n","수식을 출력하면 계산 결과가 출력됩니다.");
		System.out.printf("계산결과는 %d + %d = %d 입니다. \n", 10, 5, 10+5);
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다. \n", 2016-11, 5, 8);
		
		
		//왼쪽과 오른쪽 정렬
		System.out.printf("숫자가 %8d입니다. \n", 123);  // 오른쪽부터
		System.out.printf("숫자가 %-8d입니다. \n", 123); // 왼쪽부터
		System.out.printf("알파벳 %10s입니다. \n", "abc"); 
		System.out.printf("알파벳 %-10s입니다. \n", "abc"); 
		
		/*
		 출력예 ) subject score
		 		==============
		 		 korea오   90 왼
		  		english   100
		  		computer  80
		  		
		  	단) printf 메서드를 이용하여 ""에는 서식 문자와 줄바꿈만 존재
		  		subject와 score사이에 공백5개포함
		  		subject는 문자 8자리 (%8s), score 숫자6자리(%6d)로 고정
		  		System.out.printf("%s \n", "======");
		  	
		  */
		
		System.out.printf("%8s", "subject" );
		System.out.printf("%10s \n", "score");
		System.out.printf("%s \n","===================");
		System.out.printf("%8s", "korea");
		System.out.printf("%6d \n", 90);
		System.out.printf("%8s", "english");
		System.out.printf("%6d \n", 100);
		System.out.printf("%8s", "computer");
		System.out.printf("%6d \n", 80);
		
		System.out.printf("%8s     %6s \n", "subject", "score");
		System.out.printf("%s\n","======================");
		System.out.printf("%8s    %6d\n", "korea" , 90);
		System.out.printf("%8s    %6d\n", "english" , 100);
		System.out.printf("%8s    %6d\n", "computer" , 80);

	}	
}

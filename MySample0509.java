import java.util.*;
public class MySample0509 {

	public static void main(String[] args) {
	
		
		int a = 5;
		int b = a+2;
		/*
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		Scanner scn = new Scanner(System.in);
		// 클래스 변수명 = 생성자
		System.out.print("나이를 입력하세요.>");
		int age = scn.nextInt(); //  정수로 입력 //입력대기
		
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		
		*/
		
		// 산술연산자
		
		//a = 7;
		//b = 5;
		
		// 연산한 식을 계속 사용(2번이상) 할 것이라면 변수선언하는게 맞음
		/*
		int plus = a + b;
		int minus = a - b;
		int multi = a * b;
		int div = a / b;
		int rest = a % b;
		
		System.out.printf("%d + %d = %d \n", a, b, plus);
		System.out.printf("%d - %d = %d \n", a, b, minus);
		System.out.printf("%d * %d = %d \n", a, b, multi);
		System.out.printf("%d / %d = %d \n", a, b, div); // 몫
		System.out.printf("%d %% %d = %d \n", a, b, rest); // 나머지
		*/
		
		
		// 증감 연산자 ( ++, --)
		/*
		a = 5;
		System.out.println("a = " + a); // 5
		a++;  //후치 증가 연산자
		System.out.println("a1 = " + a); // 6
		++a; // 전치 증가 연산자
		System.out.println("a2 = " + a); // 7
		
		a = 5;
		System.out.println("a = " + a);  // 5
		System.out.println("a++ = " + a++); // 5
		System.out.println("++a = " + ++a); // 7
		
		// 감소연산자
		a = 5;
		System.out.println("a = " + a); // 5
		a--;  //후치 감소 연산자
		System.out.println("a1 = " + a); // 4
		--a; // 전치 감소 연산자
		System.out.println("a2 = " + a); // 3
		
		a = 5;
		System.out.println("a = " + a);  // 5
		System.out.println("a-- = " + a--); // 5 
		System.out.println("--a = " + --a); // 3
		*/
	
		// 출력예 
		//최초값을 a = 10, b = 10
		// a++ = 10, ++b = 11 출력
		// 실행 후 a = 11, b = 11
		// a-- = 11, --b = 10
		//실행 후 a = 10, b=10
		
//		a = 10;
//		b = 10;
		
		//System.out.println("a++ = " + a++ + ",  ++b = " + ++b );
		//System.out.println("실행 후 a = " + a + ", b = " + b);
		//System.out.println("a-- = " + a-- + ",  --b = " + --b );
		//System.out.println("실행 후 a = " + a + ", b = " + b);
		
//		System.out.printf("a++ = %d, ++b = %d \n", a++, ++b);
//		System.out.print("a++ = " + a++ + ", ++b = " + ++b + "\n");
//		System.out.printf("실행후 a = %d, b= %d \n", a, b);
//		System.out.printf("a-- = %d, --b = %d \n", a--,--b);
//		System.out.printf("실행후 a = %d, b= %d \n", a, b);
//	
		 
		// 문제) 정수 변수 a와 b를 입력받아서 a는 전치증가연산자를 사용하고  
		//b는 후치감소연산자를 사용하여 두수의 합을 
		//c에 저장한 후 각각 출력하는 프로그램을 작성
		// c = ++a + b--;
		
		//입력 예 ) 첫번째 정수 > 5
		//입력 예 ) 두번째 정수 > 6
		//출력 예) a = 6, b = 5, c = 12
		/*
		int c;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("첫번째 정수>");
		a = scn.nextInt();
		System.out.print("두번째 정수>");
		b = scn.nextInt();
		c = ++a + b--; // 6 + 6 = 12 c = 12   -> a = 6 / b = 5 / c = 12
		System.out.printf("a= %d, b = %d, c = %d \n", a,b,c);
		
		
		  비교 연산자
		  a = 10;
		  b = 20;
        //  int c = 20;
		  System.out.println("a == b : "+ ( a== b)); //false
		  System.out.println("b == c : " + ( b == c)); // true
		  System.out.println("a! = b : " + (a != b)); //true
		  System.out.println("b !=c :" +(b != c)); //false
		  System.out.println("a > b : "+ (a > b)); // false
		  System.out.println("b >= c : "+ (b >= c)); //true
		  System.out.println("a <= c: " + (a <= c)); // true
		  System.out.println("b < c : " + (b < c)); // false
		  */
		/*
		문제)  
		  * 3개의 정수 a,b,c를 입력받아서
		  * a와 b
		  * b와 c를 각각 비교해서 같으면 true 같지않으면  false
		  * 입력예 ) a값을 입력하세요.> 10
		  			b값을 입력하세요.> 20
		  			c값을 입력하세요.> 20
		  * 출력예 ) a == b : false
		  * 		b == c : true
		  * 		a != b :true
		  * 		b != c :false
		  
		  */
		 
		  
		/*
			Scanner scn = new Scanner(System.in);
			int c;
			System.out.print("a 값을 입력하세요.>");
			a = scn.nextInt();
			System.out.print("b 값을 입력하세요.>");
			b = scn.nextInt();
			System.out.print("c 값을 입력하세요.>");
			c = scn.nextInt();
	
			System.out.println("a == b : "+ ( a == b )); 
			System.out.println("b == c : "+ ( b == c )); 
			System.out.println("a != b : "+ (a != b)); 
			System.out.println("b != c : " + (b != c)); 
			*/
			 //논리연산자 (&&, ||)
			
		
			
			/*
			a = 1;
			b = 2;
			int c =3;
			System.out.println("( a > b && b < c) : " + (a > b && b < c)); // 둘중 하나만 틀려도 false
			System.out.println("( a > b || b < c) : " + (a > b || b < c)); //  앞은 true 확률 높다
			*/
		
			//문제) 3개의 정수 a,b,c를 선언하고 각각 10,20,30으로 초기화 한후 참이면 true, 거짓이면 false를 출력.
			// 출력예) a > b && a <= b : false
			//		  a > b || a <=b : true
			//		  b < c && a < c : true
			//		  !(a > b && a <= b) : true
				
			/*
			a = 10;
			b = 20;
			int c = 30;
			System.out.println("( a > b && a <=b ) : " + (a > b && a <= b));
			System.out.println("( a > b || a <= b) : " + (a > b || a <= b));
			System.out.println("( b > c && a < c) : " + (b > c || a < c));
			System.out.println("!( a > b && a <= b) : " + !(a > b && a <= b));
			*/
		
			// 삼항연산자
			/*
			int x = 10;
			int y = 5;
			int result = (x >= y)? x : y; // 항이 3개 (조건)? 참 : 거짓;
			
			System.out.println("x와 y값중 큰 값은  " + result + "입니다.");
			*/
		
			//문제 정수변수 a에 나이를 입력을 받아 19보다 큰값을 입력 받았으면 '성인입니다'로 출력하고
			// 19보다 작으면 '청소년입니다'
		
			//입력예) 나이를 입력하세요.>15
			//출력예) 청소년입니다.
			// 단 삼항연산자를 이용하여 출력에 사용할 변수는 String memo 로 사용함.
		
			
//			Scanner scn = new Scanner(System.in);
//			System.out.print("나이를 입력하세요.>");
//			int age = scn.nextInt(); //  정수로 입력 //입력대기
//			if (age > 19) {
//				System.out.print("성인입니다");
//			}
//			else{
//				System.out.print("청소년입니다");
//			}
			
			
//			Scanner scn = new Scanner(System.in);
//			System.out.print("나이를 입력하세요.>");
//			int age = scn.nextInt(); //  정수로 입력 //입력대기
//			String memo = "청소년입니다.";
//			String meme = "성인입니다.";
//			System.out.print(age>19? meme:memo);
//			
//			Scanner scn = new Scanner(System.in);
//				
//			System.out.print("나이를 입력하세요.>");
//			a = scn.nextInt();
//			String memo = (a > 19)? "성인입니다.":"청소년입니다.";
//			System.out.println(memo);
//			
		
			//문제) 시험점수 3과목을 입력받아 평균과 통과유뮤를 출력하는 프로그램 작성, 
			//평균점수가 70점 이상이면 통과, 미만이면 미통과로 처리하는 프로그램
			//입력예
			//국어 점수를 입력하세요.>80
			//영어 점수를 입력하세요.>70
			//수학 점수를 입력하세요.>90
			//출력예
			//70점이상인 경우 
			// 당신의 평균은 80점이고 통과하셨습니다.
			//70점미만인 경우
			// 당신의 평균은 65점이고 미통과하셨습니다.
			// 국어 kor 영어 eng 수학 math 평균 avg 통과여부 memo
			// 평균 (국어+영어+수학)/3
		
		/*Scanner scn = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		int avg;
		System.out.print("국어점수를 입력하세요.>");
		kor = scn.nextInt();
		System.out.print("영어점수를 입력하세요.>");
		eng = scn.nextInt();
		System.out.print("수학점수를 입력하세요.>");
		math = scn.nextInt();
		avg = (kor+eng+math)/3;
		String memo = (avg>=70)? "통과" : "미통과";
		System.out.print("당신의 평균은 "+ avg +"점이고 " + memo + "하셨습니다.");
			*/
		/*
		int kor, eng, math, avg;
		String memo = "";
		
		Scanner scn = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요.>");
		kor = scn.nextInt();	
		System.out.print("영어 점수를 입력하세요.>");
		eng = scn.nextInt();	
		System.out.print("수학 점수를 입력하세요.>");
		math = scn.nextInt();
		
		avg = (kor+eng+math) / 3;
		memo = (avg >= 70)? "통과" : "미통과";
		
		System.out.printf("당신의 평균은 %d점이고 %s 하셨습니다", avg, memo);
		*/
		
		// nextLine()을 이용하여 문자열을 입력받은 수 정수로 변환
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력>");
		String input = scn.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("num : " + num);
		*/
		
	}	

}

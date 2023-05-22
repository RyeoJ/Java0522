import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 출력예 
				//최초값을 a = 10, b = 10
				// a++ = 10, ++b = 11 출력
				// 실행 후 a = 11, b = 11
				// a-- = 11, --b = 10
				//실행 후 a = 10, b=10
				
			
		
		
		
		// 문제) 정수 변수 a와 b를 입력받아서 a는 전치증가연산자를 사용하고  
				//b는 후치감소연산자를 사용하여 두수의 합을 
				//c에 저장한 후 각각 출력하는 프로그램을 작성
				// c = ++a + b--;
				
				//입력 예 ) 첫번째 정수 > 5
				//입력 예 ) 두번째 정수 > 6
				//출력 예) a = 6, b = 5, c = 12
		
		
//		문제)  
//	  * 3개의 정수 a,b,c를 입력받아서
//	  * a와 b
//	  * b와 c를 각각 비교해서 같으면 true 같지않으면  false
//	  * 입력예 ) a값을 입력하세요.> 10
//	  			b값을 입력하세요.> 20
//	  			c값을 입력하세요.> 20
//	  * 출력예 ) a == b : false
//	  * 		b == c : true
//	  * 		a != b :true
//	  * 		b != c :false
		
		
		//문제) 3개의 정수 a,b,c를 선언하고 각각 10,20,30으로 초기화 한후 참이면 true, 거짓이면 false를 출력.
		// 출력예) a > b && a <= b : false
		//		  a > b || a <=b : true
		//		  b < c && a < c : true
		//		  !(a > b && a <= b) : true
			
		
		//문제 정수변수 a에 나이를 입력을 받아 19보다 큰값을 입력 받았으면 '성인입니다'로 출력하고
		// 19보다 작으면 '청소년입니다'
	
		//입력예) 나이를 입력하세요.>15
		//출력예) 청소년입니다.
		// 단 삼항연산자를 이용하여 출력에 사용할 변수는 String memo 로 사용함.
	
		
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
	  
		
		/* 문제) 정수 2개를 입력 받아서 큰수와 작은수를 차례로 출력하는 프로그램
		 * 입력예) 2 9
		 * 출력예) 입력받은 수중 큰수는 9이고 작은수는 2입니다.
		 * 단, 큰수는 항상 a변수, 작은수는 항상 b변수에 사용 
		 * */
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int tmp;
		if( a < b) {
			tmp = a;
			a = b;
			b = tmp;
			
		}
		System.out.print("입력 받은 수 중 큰 수는 " + a + "작은 수는 " + b + "입니다.");
	
		
		Scanner scn = new Scanner(System.in);
		int a;
		System.out.print("숫자를 입력하세요");
		a = scn.nextInt();
		
		if(a > 0)  {
			System.out.println("입력하신 값은 " + a + "이며 0보다 큽니다.");
		}
		else if (a<0) {
			System.out.println("입력하신 값은 " + a + "이며 음수입니다");
		}
		
		else if(a==0) {
			System.out.println("입력하신 값은 " + a + "이며  0입니다");
		}
		else {
			System.out.print("숫자를 입력하세요");
			a = scn.nextInt();
		}
		*/
	}
	

}

import java.util.*;
public class MySample0510 {

	public static void main(String[] args) {
	 /*  
	  제어문(조건문-if)
	  문제) 정수를 입력받아 그 수가 10보다 큰 경우 체크하는 프로그램
	  입력예) 정수 입력> 15
	  출력예) 15
	  		10보다 큰 수를 입력하셨습니다.
	  		if끝.
	  		단, 10보다 작은 수인 경우는 출력을 if 끝. 만 출력함
	  */
		/*
	  Scanner scn = new Scanner(System.in);
	  int a;
	  System.out.print("정수를 입력하세요.>");
	  a = scn.nextInt();
	  if(a > 10) {
		  
		  System.out.print("10보다 큰 수를 입력하셨습니다.");
		  
	  }
	  System.out.println("if끝.");
	  */
	  /* 문제)if문 2개로 구현
	   * 입력예) 숫자를 입력하세요.> 3
	   * 출력예) 입력하신 숫자는 0이 아닙니다.
	   * 입력하신 숫자는 3입니다.
	   * 
	   * 입력예)숫자를 입력하세요.>0
	   * 출력예)입력하신 숫자는 0입니다.
	   */
		
	/*
		Scanner scn = new Scanner(System.in);
		int a;
		System.out.print("숫자를 입력하세요");
		a = scn.nextInt();
		if( a == 0 ) {
			System.out.println("입력하신 숫자는 0입니다");
		
		}
		if( a != 0 ) {
			System.out.println("입력하신 숫자는 0이 아닙니다");
			System.out.print("입력하신 숫자는 " + a + "입니다");
		}
	*/
		
		/* 문제) 정수를 입력받아 입력받은 숫자를 출력하고 음수이면 'minus'라고 출력하는 프로그램
		 * 입력예1) -5
		 * 출력예1) -5
		 * 		 minus
		 * 
		 * 입력예2)7
		 * 출력예2)7
		 * 		 plus
		 */
	/*
		Scanner scn = new Scanner(System.in);
		int a;
		int b;
		System.out.print("숫자를 입력하세요");
		a = scn.nextInt();
		if(a<0) {
			System.out.println(a);
			System.out.println("minus");
			System.out.print("숫자를 입력하세요");
		}
		else{
				System.out.print(a);
		}
		
		
		b = scn.nextInt();
		if(b>0) {
			System.out.println(b);
		}
		
	*/
		
	/*
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		System.out.println(a);
		
		if(a < 0)
		{
			System.out.println("minus");
		}
	*/
		
		/*
		 문제) 정수를 하나 입력받아서 0보다 큰 경우, 0인경우, 음수인 경우를 체크하여 출력하는 프로그램.(단, if문 3번사용)
		 
		 입력예1) 숫자를 입력하세요.>5
		 출력예1) 입력하신 값은 5이며, 0보다 큽니다
		 
		 입력예2) 숫자를 입력하세요.>0
		 출력예2) 입력하신 값은 0이며, 0과 같습니다.
		 
		 입력예3) 숫자를 입력하세요.>-1
		 출력예3) 입력하신 값은 -1이며, 음수 입니다.
		 
		
		 */
	
		/*
		Scanner scn = new Scanner(System.in);
		int a;
		System.out.print("숫자를 입력하세요");
		a = scn.nextInt();
		if(a > 0)  {
			System.out.println("입력하신 값은 " + a + "이며 0보다 큽니다.");
		}
		
		System.out.print("숫자를 입력하세요");
		a = scn.nextInt();
		
		if (a < 0) {
			System.out.println("입력하신 값은 " + a + "이며 음수입니다.");
		}
		
		System.out.print("숫자를 입력하세요");
		a = scn.nextInt();
		
		if (a == 0) {
			System.out.println("입력하신 값은 " + a + "이며 0입니다.");
		}	*/
		
		
		/*
		 * 
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int a = scn.nextInt();
		int b = 10;
		System.out.printf("입력하신 값은 %d 이며",  a);
	
		
//		if ( a > 0 ) {
//			System.out.println("0보다 큽니다.");
//			}
//      위에와 동일한 것으로 &&, || 테스트용
		
		System.out.println("b before: " + b);
		
		//if ( a > 0 && ++b > a) 
		if ( a > 0 || ++b > a)   //1을 기입하면 이미 a>0 앞부분을 만족하기때문에 뒷부분은 안함
		{
			System.out.println("0보다 큽니다.");
		}
		
			System.out.println("b after : " + b);
			
		if ( a == 0 )
		{
			System.out.println("0과 같습니다");
		}
		if ( a < 0 )
		{
			System.out.println("음수 입니다");
		}
		*/
		
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
		if (a < b )   // 삼각형  a와 b의 위치를 바꿔라 tmp 임시변수
		{
			tmp = a;  //순서 맞춰야함
			a = b;
			b = tmp;
		}
		System.out.println("입력 받은 수 중 큰 수는 " + a + "작은 수는" + b + "입니다");
		*/
		
		
		//if~else 문
		//정수를 입력받아 10보다 큰수를 입력받은 경우와 10보다 작은 값을 입력받은 경우를 구분하기위한 프로그램
		//입력예)15
		//출력예)10보다 큰수를 입력하셨습니다.
		
		//입력예)9
		//출력예)10보다 작은 값을 입력하셨습니다.
		
		/*
		 
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int a = scn.nextInt();
		
		if(a > 10)
		{
		System.out.print("10보다 큰수를 입력하셨습니다.");
		}
		else 
		{
			System.out.print("10보다 작은 값을 입력하셨습니다.");	
		}
		
		
		*/
		
		
		
		/*문제) 점수를 입력받아 80점 이상이면 합격 아니면 불합격을 출력.
		 * 입력예) 점수를 입력하세요.>89
		 * 출력예) 축하합니다. 합격입니다.
		 * 
		 * 입력예) 점수를 입력하세요.76
		 * 출력예) 죄송합니다. 불합격입니다.
		 * 
		 * */
		
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scn.nextInt();
		if (score >= 80) {
			System.out.print("축하합니다. 합격입니다.");
		}
		else {
			System.out.print("죄송합니다. 불합격입니다.");
		}
		*/
		
		
		 /* 문제)if문 2개로 구현
		   * 입력예) 숫자를 입력하세요.> 3
		   * 출력예) 입력하신 숫자는 0이 아닙니다.
		   * 입력하신 숫자는 3입니다.
		   * 
		   * 입력예)숫자를 입력하세요.>0
		   * 출력예)입력하신 숫자는 0입니다.
		   */
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int a = scn.nextInt();
		if(a == 0) {
			//System.out.println("입력하신 숫자는 0입니다.");
			System.out.println("입력하신 숫자는" + a + "입니다");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는" + a + "입니다");
		}
		
		//System.out.println("입력하신 숫자는" + a + "입니다");
		
	*/
		/* 문제) if~else if~else문
		 * 정수를 입력받아 값이 10보다 큰 경우와 0인경우 음수인 경우를 체크하는 프로그램
		 * 입력예1)정수를 입력하세요>11
		 * 출력예1)10보다 큰 수를 입력하셨습니다.
		 * 
		 * 입력예2)정수를 입력하세요>0
		 * 출력예2)0을입력하셨습니다.
		 * 
		 * 입력예3)정수를 입력하세요>-1
		 * 출력예3)음수를 입력하셨습니다.
		 * 
		 * 입력예4)정수를 입력하세요>9
		 * 출력예4)1에서 9사이 정수를 입력하셨습니다.
		 * */
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int a = scn.nextInt();
		if( a >= 1 && a <= 10){
			System.out.print("1에서 10사이 정수를 입력하셨습니다.");
		}
		else if(a > 10){
			System.out.print("10보다 큰 수를 입력하셨습니다.");
		}
		else if(a < 0){
			System.out.print("음수를 입력하셨습니다.");
		}
		else if(a == 0){
			System.out.print("0을 입력하셨습니다.");
		}
		
		
		
		================================================
			if(a > 10){
			System.out.print("10보다 큰 수를 입력하셨습니다.");
		}
		else if(a > 0){
			System.out.print("1에서 10사이 정수를 입력하셨습니다.");
		}
		
		else if(a == 0){
		 System.out.print("0을 입력하셨습니다.")
		 }
		else if(a < 0){
			System.out.
			print("음수를 입력하셨습니다.");
		}
		
		
		
		
		
		
		*/
		
	//  else {
	//	System.out.print("10보다 큰 수를 입력하셨습니다.");
    //	}
	
	 /*
	  * 문제 점수를 입력받아 "수우미양가"를 출력하는 프로그램
	  * 입력예) 점수를 입력하세요.>89
	  * 출력예) 우
	  * 단, 90~100 : 수, 80~89 : 우, 70~79 : 미, 60~69 양, 60미만 : 가 
	  **/
		
//		
//		Scanner scn = new Scanner(System.in);
//		System.out.print("점수를 입력하세요");
//		int score = scn.nextInt();
//		
//		if(score < 60) {
//			System.out.print("가");
//		}
//		else if(score >= 60 && score <= 69) {
//			System.out.print("양");
//		}
//		else if(score >= 70 && score <= 79) {
//			System.out.print("미");
//		}
//		else if(score >= 80 && score <= 89) {
//			System.out.print("우");
//		}
//		else if(score >= 90 && score <= 100) {
//			System.out.print("수");
//		}
		
		/*  if(score >= 90 && score <= 100) {
			System.out.print("수");
			}
			else if(score >= 80 && score <= 89) {
			System.out.print("우");
			}
			else if(score >= 70 && score <= 79) {
			System.out.print("미");
			}
			else if(score >= 60 && score <= 69) {
			System.out.print("양");
			}
			else {
			System.out.print("가");
			}
		 * 
		 * 
		 * if(score>=0 && score <=100)
		 *  { }
		 *  else 점수가 0~100사이여야합니다.
		 * 	
		 * 	 if (score >= 90)
		 *	    걸러진다
		 *	    else if ( score >= 80){
		 *    걸러짐
		 *    }
		 *    else if ( score >= 70){
		 *    **			 
		 *    *    }
		 *    else if ( score >= 60){
		 *    **
		 *    }			 
		 *    *    else{
		 *    	 
		 *    }
		 * 			 * */
		
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int score = scn.nextInt();
		
		if(score >=0 && score < 60) {
			System.out.print("가");
		}
		else if(score >= 60 && score <= 69) {
			System.out.print("양");
		}
		else if(score >= 70 && score <= 79) {
			System.out.print("미");
		}
		else if(score >= 80 && score <= 89) {
			System.out.print("우");
		}
		else if(score >= 90 && score <= 100) {
			System.out.print("수");
		}
		else {
			System.out.print("점수는 0~100사이여야합니다");
		}
			*/
		
		
		
		/* 문제 주사위를 두번 던져서 나온 수를 입력받아 두수가 모두 4이상이면 "이겼습니다."
		 * 한개만 4이상이면 "비겼습니다" 모두 4미만이면 "졌습니다." 라고 출력하는 프로그램
		 * 입력예) 주사위 던진결과를 입력하세요> 3 4
		 * 출력예) 비겼습니다.
		 * 단, 주사위 입력값은 1~6 사이 값이어야 함 if 로 체크 .
		 *
		 * 
		 * 
		 * */
		 
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("주사위 던진 결과를 입력하세요");
		int a = scn.nextInt();
		int b = scn.nextInt();
		if(( a < 1 || a > 6 ) || ( b < 1 || b > 6 )) // a가 1보다 작고 6보다 크면 1~6이라고 말함 
		{
			System.out.print("입력값은 1~6사이입니다");
		}
		else if ( a >= 4 && b >= 4)// 두수가 모두 4이상
		{
			System.out.print("이겼습니다.");
		} 
		else if ( a >= 4 || b >= 4 )// 한개만 4이상이면
		{
			System.out.print("비겼습니다.");
		} 
		else if (  a < 4 || b < 4) // 모두 4미만이면
		{
			System.out.print("졌습니다.");
		} 
		*/
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("주사위 던진 결과를 입력하세요");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		if(a >= 4 && b >=4)
		{ 
			System.out.print("이겼습니다");
		}
		else if(a >= 4 || b >= 4)
		{
			System.out.println("비겼습니다");
		}
		else //(a >=4 && b >=4) 
		{
			System.out.println("졌습니다");
		}
		
		*/
		
		
		/*	if((a<1 || a>6)||(b<1|| b>6))  왜 먼저하는지? 
		 * {
		 * System.out.print("입력은 1~6사이 값으로 합니다.");
		 * }
		 * else if(a>=4 && b>=4)
		 * {
		 * System.out.print("이겼습니다")
		 * }
		 * else if(a >=4 || b>=4)
		 * {
		 * System.out.print("비겼습니다")
		 * }
		 * else
		 * {
		 * System.out.print("졌습니다")
		 * }
		 * */

	    /* 문제 주사위를 두번 던져서 나온 수를 입력받아 두수가 모두 4이상이면 "이겼습니다."
		 * 한개만 4이상이면 "비겼습니다" 모두 4미만이면 "졌습니다." 라고 출력하는 프로그램
		 * 입력예) 주사위 던진결과를 입력하세요> 3 4
		 * 출력예) 비겼습니다.
		 * 단, 주사위 입력값은 1~6 사이 값이어야 함 if 로 체크 .
		 *문제)중첩if (위와 동일한 문제로 처리) //다중 if문
		 * 단, if / if~else if~else, else
		 * if(정상적일때){
		 * 이겼냐 비겼냐 졌냐
		 * }
		 * else
		 * {
		 *  입력값 오류시
		 *  두값이 모두 오류인, 첫번째 입력값이 오류,
		 *  두번째 입력값이 오류인지 체크
		 *  }
		 */
		Scanner scn = new Scanner(System.in);
		System.out.print("주사위 던진 결과를 입력하세요");
		int a = scn.nextInt();
		int b = scn.nextInt();
		if ((a >= 1 && a <= 6 )&& ( b >= 1 && b <= 6))//  범위가 모여있을때는 &&조건 // 흩어져있을땐 ||연산
{
			
		 if ( a >= 4 && b >= 4 )
		 {
			System.out.print("이겼습니다.겼습니다.");
		 } 
		 else if ( a >= 4 || b >= 4 ) 
		 {
			 System.out.print("비겼습니다");
		 }
		else  
		 {
			System.out.print("졌습니다.");
		 } 
} 
		else {
				 if((a < 1 || a > 6) && (b < 1 || b > 6))
				 {
					 System.out.println("입력된 두 값 오류");
			     }
				 else if(a < 1 || a > 6){
					 System.out.println("첫번째 입력된 두 값 오류");
				 }
				 else if(b < 1 || b > 6){
					 System.out.println("두번째 입력된 두 값 오류");
				 }
		      }	
													 //입력값 오류시
			 										 //두값이 모두 오류인, 첫번째 값이 오류
			 									     // 두번째 입력값이 오류인지 체크 
		
		
	
}
}
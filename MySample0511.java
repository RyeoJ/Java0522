import java.util.*;
public class MySample0511 {

	public static void main(String[] args) {
		/*
		 * 중첩 if
		 * 문제) 정수 3개를 입력받아 그중 가장 큰수를 출력하는 프로그램
		 * 입력예) 세개의 정수를 입력하세요.>1 5 4
		 * 출력예) 입력받은 수중 가장 큰 수는 5입니다.
	     * 단, 출력은 max변수를 사용
		 * */
		// AB랑 비교 A가 크면 B는 비교할 필요없음
		// A는 C랑만 비교함 
		// A랑B비교햇더니 B가크면 C랑만비교
		
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("세개의 정수를 입력하세요.");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int max;
		if( a> b ) 
{
			if(a>c) {
				max = a;
		}
			else {
				max = c;
		}
}
		else {
			if(b>c) {
				max =b;
			}
			else {
				max =c;
			}
			

			}
	 
	System.out.printf("입력받은 수중 가장 큰수는 %d입니다",max);
	
	*/
	
	
	/* 문제) 점수를 입력받아 90~100사이는 'A' 이면서 98~100점은 'A+'로 나타내고 90~93점은 'A-'로 나타내고 94~97점은 'A'로 나타내는 프로그램
	 * 단, 80~83점은 'B-', 84~87점은 'B', 88~89점은 'B+'로 표시하고 A,B를 제외한 나머지 학점은 'C'학점으로 표시함
	 * 입력예) 점수를 입력하세요.>100
	 * 출력예) 당신의 점수는 100점입니다.
	 * 		  당신의 학점은 A+입니다.
	 * 
	 * 입력예2) 점수를 입력하세요.>81
	 * 출력예2) 당신의 점수는 81점입니다.
	 * 			당신의 학점은 B-입니다.
	 * 
	 * 입력예3) 점수를 입력하세요.>85
	 * 출력예3) 당신의 점수는 85점입니다.
	 * 			당신의 학점은 B입니다.
	 *  0점부터 100점사이
	 *  
	 *  if(score>=0 && score <=100)
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
	 * */
		
		/*
		
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int score = scn.nextInt();
		char grade;
		char opt;
		
		if( score >= 0 && score < 80 ) {
			grade = 'C';
			opt = ' ';
			
		}
		
		else if(score >=80 && score <= 83 ) {
			
			grade = 'B';
			opt = '-';
			
			
		}
		else if(score >=84 && score <= 87 ) {
			
			grade = 'B';
			opt = ' ';
			
			
		}
		else if(score >=88 && score <= 89 ) {
			
			grade = 'B';
			opt = '+';
			
			
		}
		
			
		
		else if(score >=90 && score <= 93 ) {
			
			grade = 'A';
			opt = '-';
		
			
		}
		else if(score >=98 && score <= 100){
			grade = 'A';
			opt = '+';
			
		}
      else if(score > 90 && score <= 100 ) {
			
			grade = 'A';
			opt = ' ';
}
		else {
			grade = ' ';
			opt = ' ';
				System.out.print("0~100사이점수만 입력가능합니다.");
		}
		
		System.out.println("당신의 점수는 "+ score + "입니다.");
		System.out.print("당신의 학점은 "+ grade +  opt +" 입니다.");
	
		*/
		
		//=====================================답
		/*
		 * 
		int score;
		char grade =' ';
		char opt = ' ' ;
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		score = scn.nextInt();
		if(score >=90)
		{
			grade = 'A';
			
			if(score >= 98)
			{
				opt= '+';
			}
			else if(score <=93)
			{
				opt = '-';
			}
		
			else  // 한번 실행할때는 필요없지만 반복을 할때는 반드시 필요한 문장 
			{ 
				opt = ' ';
			}
		}
		else if(score >= 80) // 위 if문을 수행해서 89점밑인 수임   최소값만 지정하면됨 
		{
		{
			grade = 'B';
		}
		if(score >= 88)
		{
			opt = '+';
		}
		else if(score <=83)
		{
			opt = '-';
		}
			else {
				
				opt = ' ';
				
			}
		}
		else {
			grade = 'C';
			opt = ' ';
			
		}
		
		
		System.out.printf("당신의 점수는 %d 점입니다.\n",score);
		if(opt == ' ')
		{
			System.out.printf("당신의 학점은 %c입니다.\n",grade);
		}
		else {
		System.out.printf("당신의 학점은 %c%c입니다.\n",grade,opt);
		}
		*/
		
		
		/* switch~case문
		 * 
		 * */
		/*
		int a = 5;
		
		switch(a)  // 조건식 = 값
		{
		case 3:
			System.out.println("3월");
			//break;
		default:
			System.out.println("default");
		}		
		*/
		
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("현재월을 입력하세요");
		int month = scn.nextInt();
		switch(month)
		{
		case 3:
			System.out.print("현재 계절은 봄입니다.");
			break;
		case 4:
			System.out.print("현재 계절은 봄입니다.");
			break;
		case 5:
			System.out.print("현재 계절은 봄입니다.");
			break;
		case 6:
			System.out.print("현재 계절은 여름입니다.");
			break;
		case 7:
			System.out.print("현재 계절은 여름입니다.");
			break;
		case 8:
			System.out.print("현재 계절은 여름입니다.");
			break;
		case 9:
			System.out.print("현재 계절은 가을입니다.");
			break;
		case 10:
			System.out.print("현재 계절은 가을입니다.");
			break;
		case 11:
			System.out.print("현재 계절은 가을입니다.");
			break;
		case 12:
			System.out.print("현재 계절은 겨울입니다.");
			break;
		case 1:
			System.out.print("현재 계절은 겨울입니다.");
			break;
		case 2:
			System.out.print("현재 계절은 겨울입니다.");
			break;
		*/
		
		/* 위의  문제를 줄여 작성
		 *
		 * */
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("현재월을 입력하세요");
		int month = scn.nextInt();
		switch(month)
		{
		case 3:
		case 4:
		case 5:
			System.out.print("현재 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("현재 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("현재 계절은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.print("현재 계절은 겨울입니다.");
			break;
		default:
			System.out.print("월을 잘못 입력하셨습니다.");
		}
		*/
		/*
		 * if문으로 바꾸기 
		 */
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("현재월을 입력하세요");
		int month = scn.nextInt();
		if(month >= 3 && month <= 5 )
		{
			System.out.print("현재 계절은 봄입니다");
		}
		else if (month >= 6 && month <= 8 )
		{
			System.out.print("현재 계절은 여름입니다");
		}
		else if (month >= 9 && month <= 11 )
		{
			System.out.print("현재 계절은 가을입니다");
		}
		else if(month >= 1 && month <13 && month > 0 &&  month <= 12)
		{
			System.out.print("현재 계절은 겨울입니다");
		}
		else
		{
			System.out.print("월을 잘못입력하셨습니다.");
		}
		*/
		
		
		//=====================================================답
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("현재월을 입력하세요");
		int month = scn.nextInt();
		if(month == 3 || month == 4 || month == 5) {
			System.out.print("현재 계절은 봄입니다");
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.print("현재 계절은 여름입니다");
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.print("현재 계절은 가을입니다");
		}
		else if(month == 12 || month == 1 || month == 2) {
			System.out.print("현재 계절은 겨울입니다");
		}
		else {
			System.out.print("월을 잘못입력하셨습니다.");
		}
		*/
		
		
		/* switch~case문
		 * 문제)아래의 메뉴에서 선택한 메뉴를 알려주는 프로그램
		 * 단, 해당 숫자 이외에 값을 입력 받을 경우 " 잘못 입력하셨습니다"
		 * 라는 메세지 출력
		 * 입력예)1. 추가
		 * 		2. 수정
		 * 		3. 삭제
		 * 		메뉴 번호를 선택하세요
		 * 출력예) 수정을 선택하셨습니다.
		 * 		
		 * 
		 * */
		
		/*
		Scanner scn = new Scanner(System.in);
		String w = "추가";
		String s = "수정";
		String d = "삭제";
		System.out.printf("1.%s \n",w);
		System.out.printf("2.%s \n",s);
		System.out.printf("3.%s \n",d);
		System.out.print("메뉴 번호를 선택하세요");
		int a = scn.nextInt();
		switch(a) {
			case 1:
				System.out.print(w + "를");
			break;
			case 2:
				System.out.print(s + "을");
			break;
			case 3:
				System.out.print(d + "를");
			break;
			default:
				System.out.print("잘못");
		}
	
		System.out.println("선택하셨습니다.");
		*/
		
		
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.println("1.추가");
		System.out.println("2.수정");
		System.out.println("3.삭제");
		System.out.print("메뉴 번호를 선택하세요");
		int a = scn.nextInt();
		
		switch(a) {
			case 1:
				System.out.print("추가를");
			break;
			case 2:
				System.out.print("수정을");
			break;
			case 3:
				System.out.print("삭제를");
			break;
			default:
				System.out.print("잘못");
		}
	
		System.out.println("선택하셨습니다.");
		*/
		
		/* 문제) 점수를 입력받아 학점을 출력하는 프로그램
		 * 점수가 90~100 :'A'
		 * 		 80~89 :'B'
		 * 		 70~79 :'C'
		 * 		나머지는 F로 정의 (Char 변수memo사용)
		 * 입력예) 당신의 점수는 입력하세요 (1~100)>82
		 * 출력예) 당신의 학점은 B입니다.
		 * 
		 * 
		 * */
		
		/* 
		Scanner scn = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요");
		int score = scn.nextInt();
		
		char memo = ' ';
		
		switch (score / 10) {
			
			case 9:
				memo = 'A';
				break;
			case 8:
				memo = 'B';
				break;
			case 7:
				memo = 'C';
				break;
			case 10:
				memo ='A';
				break;
				
			default:
				System.out.print("1~100사이값을 입력하세요");
				break;
		}
		
		
		System.out.print("당신의 학점은"+ memo + "입니다.");
		*/
		
	// =================================================답
		
		
		/*
		Scanner scn = new Scanner(System.in);
		char memo = ' ';
		System.out.print("당신의 점수를 입력하세요(1~100)>");
		int score = scn.nextInt();
	
	//	System.out.print(score/10);
		if (score <0 || score > 100 )
		{
			System.out.print("0점~100점 사이를 입력하세요");
		}
		else
		{
		switch(score/10) {
		case 10:
		case 9:
			memo = 'A';
			break;
		case 8:
			memo = 'B';
			break;
		case 7: 
			memo = 'C';
			break;
		default: // default는 아무데나 와도 되지만 통상적으로 맨 마지막에 사용됨
			memo = 'F';	// 항상 break  마지막일때
			break;
		}
		
		System.out.print("당신의 학점은"+ memo + "입니다.");
		
	}

	*/

		/* 반복제어문 for
		 * 
		 */
		
		
		/*
		int i, sum = 0;
		
		for(i = 1; i <= 5; i++ )
		{
			sum += i;
			System.out.printf("i=%d, sum = %d \n", i,sum);
		}
		System.out.printf("sum : %d \n",sum);
		System.out.printf("i = %d \n", i);
		
		*/
		/* 문제)1부터 10까지 합을 출력하는 프로그램
		 * 
		 * */
		
		/*
		int i, sum = 0;
		
		for(i = 1; i <= 10; i++) 
		{
			sum += i;
			
		}
		System.out.println(sum);
		System.out.print(i);
		*/
		
		
		/*
		 * 문제)1이상 10이하의 정수를 입력받아 입력받은 정수 만큼 반복하면서 // 입력a번 = b번 반복
		 * 1부터 시작해야할 변수하나랑, 입력변수
		 * 'JAVA프로그래밍'이라고 출력하는 프로그램
		 * 입력예)3
		 * 출력예)'JAVA프로그래밍'
		 		'JAVA프로그래밍'
		 		'JAVA프로그래밍'
		 */
		/*
		 
		Scanner scn	= new Scanner(System.in);
		int a = scn.nextInt();
		int b ;
		for(b=1; b <= a; b++) { // a입력 값 만큼 조건식을 반복하니까 b<=a; ex)입력a=3 을 입력하면 3번 반복함 
			System.out.println("JAVA프로그래밍");
			
		}
		*/
		
		//=================================================답
		/*
		Scanner scn	= new Scanner(System.in);
		int num = scn.nextInt();
		int i; //시작할값
		
		for(i = 1; i<=num; i++)
		{
			System.out.println("java프로그래밍");
		}
	*/
		/*문제) 문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램
		 * 단, 입력을 받을때 char a = scn.next.line().charAt(0);
		 * 입력예)A
		 * 출력예)AAAAAAAAAAAAAAAAAAAAAA
		 * */
		
		 /*
		Scanner scn = new Scanner(System.in);
		System.out.print("문자를 입력하시오>");
		char a = scn.nextLine().charAt(1); // char a를 입력하면 읽음 0번째 라인 읽음charAT()안에는 몇번째 글자를 읽을지 선택하는거 
		// charAt안쓰려면 char 지우고 String
		int i;
		
		for(i = 0; i<20; i++) //== (i =1; i<=20; i++)
		{ //1 부터 20까지 반복함 a를
			System.out.print(a);
		}
		
		*/
		
		 /* 문제 )for를 2번 사용하여 1부터 5까지 변수 i를 출력하는 프로그램 작성
		  * 단 , 출력 할때도 변수 i사용 
		  * 출력예 )1 
		  *       2
		  *       3
		  *       4
		  *       5
		  *       12345 
		  * 
		  */
	/*
		int i; 
	
		for(i = 1; i <=5; i++)
		{
			System.out.println(i);
		}
			for(i = 1; i <=5; i++)
		{
				System.out.print(i);
		}
	
		*/
		
		/* 변수 i,j를 이용하여 출력하는 프로그램
		 * 단, 중간에 공백은 탭 '\t'을 사용하여 "%d \t %d \n",i,j
		 * 출력예) 1 10
		 * 		 2  9
		 * 		 3  8
		 * 		 4  7
		 * 		 5  6
		 *       6  5
		 *       7  4
		 *       8  3
		 *       9  2
		 *       10 1
		 * */
		 
		// ==================================답
		/*
		int  i;
		int  j = 0;
		for(i = 1, j = 10; i <=10; i++, j-- ) // 변수 두개를 같이 쓸 수 있음 i 10번까지 반복하고 i,j를 계산함
			
			
		{
			
			System.out.printf("%d \t %d \n", i,j);
			
		}
	*/
		
		/*문제) 대문자를 'A'부터 'Z'까지 차례로 출력하는 프로그램
		 * 단, char i 만 사용
		 * 출력예)ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 * 		 * */
		/*
		char i;
		
		for(i = 'A'; i<='Z'; i++) {
			System.out.printf("%c",i);
		}
		*/
		
		// =========================== 답
		/*
		char i;
		int num;
		
		for(i = 'A'; i <='Z'; i++) { // 아스키코드 A= 60으로 자동으로 인식함
			num = i;
			System.out.printf("%c \t %d \n", i, num);
		}
		*/
		
		/*문제) 1부터 20까지의 홀수를 차례대로 출력하는 프로그램
		 * 출력예) 1 3 5 7 9 11 13 15 17 19
		 * 단,변수는 i만사용
		 * 
		 * */
		/*
		 
		int i;
		
		for(i=1; i<=20; i++) {
			if(i%2==1)
			{
				System.out.printf("%d",i);
			}
		
		}
		*/
		/*
		 * 증감식으로 1 3 5 7 9 11 13 15 17 19
		 * */
		/*
		int i;
		
		for(i=0; i<20; i++) {
			i = i+1;
			System.out.printf("%d", i);
		}
		*/
		/*
		int i;
		for(i=1; i <=20; i+=2) {
			System.out.printf("%d",i);
		}*/
		
		/*문제) 정수를 입력받아 1부터 입력 받은 수 까지의 합을 출력하는 프로그램
		 * 입력예)10
		 * 출력예)55
		 * 
		 */
		Scanner scn = new Scanner(System.in);
		
		int i;
		int j = scn.nextInt();
		int sum = 0;
		for(i=1; i<=j; i++)
			{
			sum += i;
				
			}
	
		System.out.print(sum);


	}
}

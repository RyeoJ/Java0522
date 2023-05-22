import java.util.*;
public class MySample0512 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		/*반복제어문(for문)
		 * 
		 * 문제) 10개의 정수를 입력받아  //반복을 10번하는것 for문을 10번돌려야함
		 * 그 수들 중 짝수의 갯수가 몇개인지 출력하는 프로그램
		 * 변수 두개 입력받는 변수 // 스캐너 변수
		 * 
		 * 입력예) 15 22 3 129 66 81 35 1 46 888
		 * 출력예) 입력받은 짝수는 4개입니다. // 변수하나
		 * 변수 총 3개
		 
		 * */
		
		//============
		/*
		 
		int i; // 10개의정수를 입력 개수 정수를 입력해야하는 값 
		int j; // 스캐너를 받을 변수 
		int count = 0; //입주청소해놔야함 
		for(i=1; i<=10; i++) //10개 까지만 입력받을때까지 반복하려고. 
		{   
			 j = scn.nextInt(); // 10번을 돌려야되기 때문에
			 					//이미 선언한 변수 값만 바꿔주면됨
			 					// 10개 사용하면 사라질것임
			 					// 값을 입력하려 사용하는 코드
			 System.out.println("짝수 체크전..: " + j);
			if(j % 2 == 0) // 만약 입력한 값이 나머지가 0이면 짝수면 아래 count를 실행
			{
				count +=1; // 만약 j스캐너에 입력한 숫자가 짝수이면 count +1씩 증가 
						   // 짝수의 개수를 파악하는데 쓰이는 값 
						   // cnt++; // cnt = cnt + 1; // cnt += 1; 
			}
			 System.out.println("짝수 체크후..: " + j);	
		}
		System.out.printf("입력받은 짝수는 %d개 입니다.",count);// for 문 if문 반복되는동안 증가한 count값
		 */
		
		/* 문제) 10개의 정수를 입력받아 3의 배수와 5의 배수의 개수를 각각 출력하는 프로그램
		 * 입력예) 10 15 36 9 100 19 46 88 87 13
		 * 출력예)3의 배수 :4
		 * 		5의 배수 : 2
		 * 단, 3의 배수이면서 5의 배수인 경우는 3의 배수에만 포함
		 * 
		 */
		
		/*
		int i; // 10개의정수를 입력 개수 정수를 입력해야하는 값 
		int j; 
		int cnt1 = 0;
		int cnt2 = 0;
		for(i=1; i<=10; i++)  
		{
			j = scn.nextInt();
			
		
		if(j % 3 == 0 ) // 
		{
			cnt1 +=1;  
					   
					 
		}
		
		if (j % 5 == 0 ) {
			cnt2 += 1;
			
			
		}
		

	}
		
		System.out.printf("3의 배수 : %d \n",cnt1);
		System.out.printf("5의 배수 : %d \n",cnt2);	
		*/
		//=======================================답
		/*
		int i;
		int num;
		int cnt1 = 0;
		int cnt2 = 0;
		for(i = 1; i<=10; i++)
		{
			num = scn.nextInt();
			
			if(num % 3 == 0) {
				cnt1 += 1; // cnt1++; cnt1 = cnt1 + 1; //맨위에 초기값 넣어줘야함
			}
			else if(num % 5 == 0 )  // if를 또쓰면 값이 중복됨 else if를 써야 3의배수를 위에서 전부 
									// 계산하고 나머지 값으로  5의배수를 계산 할 수 있음  3의배수 와 5의배수 
				 					
			{
				cnt2 += 1; // cnt2++; // cnt2 = cnt2 + 1; //맨위에 초기값 넣어줘야함
			}
		}
		System.out.printf("3의 배수 : %d \n",cnt1);
		System.out.printf("5의 배수 : %d \n",cnt2);
		
		*/
		/* 문제) 5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램 // 5번을 반복하라
		 * 입력예) 90 85 100 66 88
		 * 출력예) 총점 : 429  // 누적 변수는 초기화 sum = 0;
		 * 		  평균 : 85.8 -> %.1f
		 * 단 총점은 sum(int), 평균 avg(double)
		 * 평균은 계산식총점 / 5.0
		 * 
		 * 
		 * 
		 * */
		
		/*
		int i;
		int score;
		int sum = 0;
		double avg = 0;
		for(i = 1; i <= 5; i++)   // 5번까지 입력의 값을 받는다
		{
			score = scn.nextInt(); // 입력하는것은 score의 값이다
			sum += score;   // sum = sum + score  sum =0부터 시작 5번반복
							// sum1 = 0 + 90 = 90
							// sum2 = 90 + 85 = 175
							// sum3 = 175 + 100 = 275
							// sum4 = 275 + 66 = 341
							// sum5 = 341 + 88 = 429
							// 5번 반복하면 완료 sum =429 로 다음 줄으로 탈줄
			
		}
		    avg = sum/5.0;   // avg = sum / 5.0
		    				 // avg = 429 / 5.0 = 85.8
		
		
		System.out.printf("%d \n",sum);
		System.out.printf("%.1f", avg);
		*/
		/*
		int i, score; // = 0을 안하는 이유 누적이 되지 않아서
		int sum = 0;
		double avg;
		for(i = 1; i <= 5; i++)
		{
			score = scn.nextInt();
			sum += score; //sum = sum + score;
		}
		// 평균은 for문 바깥에서 사용해야함
		avg = sum / 5.0; // avg = (double)sum / 5; 강제형변환
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균  %.1f \n", avg);
		*/
		
		
		/*
		int i;
		int j;
		for(i = 1; i<=5; i++) //가로
		{
		     for(j = 1; j<10; j++)
		{
		     System.out.print("*");
		}
		    System.out.println();
		}
		*/
		/* 다중 for문
		 * 출력예)*****
		 * 	     *****
		 * 		 *****
		 *       *****
		 *       *****
		 * */
		
		int i;
		int j;
		for(i = 1; i<=5; i++) //행 행 / 열 
		{
		     for(j = 1; j<=5; j++) //열
		{
		     System.out.print("*");
		}
		   
		    System.out.println();
		}
		
		
		/* 문제 변수 i,j를 이용하여 아래와 같이 출력하는 프로그램
		 * 출력예)11111
		 *		22222 
		 *		33333
		 *		44444
		 *		55555
		 *
		 * 		12345
		 *		12345
		 *		12345
		 *		12345
		 *      12345
		 *	
		 *	
		 *
		 *
		 */
		/* 풀이안된것
		int i;
		int j;
		for(i = 1; i<=5; i++) //행
	{ 
			for(j=1; j<=5; j++) 
		{
			System.out.print(i);
			System.out.print("");
		}
		if(j==i)
		{
			System.out.print(i);
		}
	}*/
		//================================답
		
		/*
		int i;
		int j;
		
		for(i = 1; i<=5; i++) //행번호입력
		{
			for(j=1; j<=5; j++) //열 
			{
				System.out.print(i);
				
			}
			System.out.println();
			
		}
		System.out.println();
		
		for(i=1; i<=5; i++) //행 
		{
			for(j=1; j<=5; j++) // 열번호입력
			{
				System.out.print(j);
			}
			System.out.println();
		}
	*/	
		
		
		/* 다중 for별찍기
		 * 문제) 정수를 입력받아서 n줄 만큼 다음과 같이 출력하는 프로그램
		 * 입력예)5  // 행이 5개
		 * 출력예)*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 
		 * 
		 * */

//			
//		}
		/*
		// ex5
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		/*
		System.out.print("");
		int i;   // 행 
		int j;   // 열  
		int k = scn.nextInt();
		
		for(i = 1; i<=k; i++) //행번호입력 i=k 입력값 만큼 행이 나와야하니까 i<=k; 
		{
			for(j=1; j<=i; j++) //열 위에 조건을 만족하고 *이 열마다 행의 숫자만큼 열 *이 나와야함
								// ex 2
								// 1행 *
								// 2행 **
			{
				
				System.out.print("*"); //위 조건을 만족하면 *을 입력함
				
	
			}
		    System.out.println();
		}
		*/
		//============================답
		/*
		int i, j, n;
		n = scn.nextInt();
		
		for(i = 1; i<= n; i++) 
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*구구단
		 * 문제)구구단에서 2단부터 4단까지의 구구단 출력 프로그램
		 * 단 결과는 2자리로 %2d로 단과 단사이는 \t
		 * dan * i 
		 * i +=1
		 * 출력예) 2 * 1 = 2 \t 3 * 1 = 3 4*1 =4
		 * 	     ...
		 * 		 2 * 9 =18
		 */
		
		/*
		int i;  // 단 
		int j;  // 배수 
		
		for(j = 1; j<=9; j++)  // 몇을 곱할지 
		{
			for(i = 2; i <=4 ; i++)  //2단부터 4단
			{
				
				i *= 1; // i= i * 1 
						// i = i*1 2*1
						// i1 = 단부터 3*1
						// i2 = 4*1
						// 나와서 아래 f문 수행
						
						
				System.out.printf("%d  * %d = %2d \t", i,j,i*j);
			}
			
			System.out.println();
		}
		
		*/
		 
		//=================================답
	/*
		int i;
		int j;
		for (i = 1; i <=9; i++) 
		{
			for(j = 2; j<=4; j++) 
			{
				System.out.printf("%d * %d = %2d \t", j,i,j*i);
			}
			System.out.println();
		}
	  */
	/* 문제)2부터 9까지의 정수를  a,b로 입력받아 a단부터 b단까지의 구구단을 차례로 출력하는 프로그램 작성
	 * 단, 단과 단사이는 탭(\t)으로 적용, 출력은 큰단에서 작은단으로 출력하되 변수는 a,b로 사용함
	 * (a가 큰단, b가 작은단)
	 * 입력예) 3 5
	 * 출력예) 5 * 1 = 5  4 * 1 = 4  3 * 1 = 3 
	 * 		 5 * 2 = 10  4 * 2 = 8  3 * 2 = 6
	 * 		...
	 *  	 5 * 9 = 45  4 * 9 = 36  3 * 9 = 27
	 *  
	 * 
	 */
		
		/*
		int a = scn.nextInt();
		int b = scn.nextInt();
		int i;  // 단 
		int j;  // 배수 
		int tmp;
		if(a < b) {  // 3 5   tmp =3
							 
			tmp = a; // 삼각형
			a = b;
			b = tmp;
		
		}
		System.out.println("입력 받은 수 중 큰 수는 " + a + "작은 수는" + b + "입니다");
		for(i = 1; i <=9; i++)  //곱할 수 9까지 곱 
		{
			for(j = a; j >= b ; j-- )  //  단ㅅ ㅜ
			{
			 			
				System.out.printf("%d  * %d = %2d \t", j, i , j*i);
			
			}
			
			
			
			System.out.println();
		}
		
		// 구구단을 할때 맨 위에값과 맨아래값을 비교해 바뀌지않는 값이 i값 ex ) 9 * 1  > 뒤에열이안바뀜 
		
		* j가 단
		* 
		*/
		
		
		/*
		int i,j;
		int a, b, tmp;// 교환해줄때 tmp 임시변수 (삼각형)
		a = scn.nextInt();
		b = scn.nextInt();
		
		if ( a < b) 
		{
			tmp = a; 
			a = b;
			b = tmp;
		}
		for(i=1; i <=9; i++) // 단수를 돌려도 안바뀌는값  ? * ? = ?  *뒷단이 안바뀜
		{
			for(j = a; j >= b; j--) // 큰값에서 작은값으로 내려가니까 
			{
				System.out.printf("%d * %d = %2d \t", j,i,j*i);
			}
			System.out.println();
		}
			
*/
		/*
		 * 문제) 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램
		 * 입력예) 4
		 * 출력예)[1,1][1,2][1,3][1,4]  //앞값이 i임
		 * 		 [2,1][2,2][2,3][2,4] /
		 * 		 [3,1][3,2][3,3][3,4]
		 * 		 [4,1][4,2][4,3][4,4]			
		 * 변수3
		 * 가로세로 ij
		 * */
		
		/*
		 
		int c = scn.nextInt();
		int i,j;
		for(i=1; i <=c; i++) 
		{
			for(j = 1; j <=c; j++) 
			{
				System.out.printf("[%d ,%d] \t", i,j);
			}
			System.out.println();
	}*/
		
		// ===========================답
		/*
		int num, i,j;
		num = scn.nextInt();
		
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= num; j++) {
				System.out.printf("[%d,%d]", i,j);
			}
			System.out.println();
		}
		*/
		
		/*
		 * 위 문제를 참고하여 작성하고 아래 출력예와 같이 출력하도록 적용
		 * 입력예)4
		 * 출력예)[1,1]  //앞값이 i임
		 * 		     [2,2]
		 * 		 		  [3,3]
		 * 		 			   [4,4]	
		 * 단, 공백은 printf("%5c", ' ');
		 * 
		 * */
		
		/*
		int num, i,j;
		num = scn.nextInt();
		
		for(i = 1; i <= num; i++)
		{ 
			for(j = 1; j <= num; j++) 
			{
				
				
				if(i==j) // 만약 [ i , j ]가 같은 값일때  출력하고
				{
					System.out.printf("[%d,%d]", i,j);
				}
				else //나머지 아닐때는 공백
				{
					System.out.printf("%5c",' '); // %c는 한글자 %5c는 5글자
				}
			}
			System.out.println();
			
		}
	*/
		//==================================답
		/*
		int num, i, j;
		num = scn.nextInt();
		for(i=1; i <= num; i++)
		{
			for(j=1; j <= num;j++ )
			{
				if(i==j)
				{
				System.out.printf("[%d,%d]", i,j);
				}
			else
			{
			System.out.printf("%5c",' '); 
			}
			}
			System.out.println();
		}
		*/
		
		/* 구구단을 입력 받아 해당 단 일부를 출력하는 프로그램 
		 * 
		 * 단,입력변수는 a,b를 사용하고 a는 작은 단, b는 큰단
		 * a부터 b까지 작은단에서 큰단으로 출력
		 * 공간은 공백 3개로 출력 ("%d * %d6 = %2d   ")
		 * 입력예) 2 5
		 * 출력예 2 * 1 = 2 2 * 2 = 4 2 * 3 = 6   2*4 =8 2*5 = 10
		 * 		3 * 1 = 3 3 * 2 = 6 3 * 3 = 9   3*4 = 12 3*5 =15
		 * 		4 * 1 = 4 4 * 2 = 8 4 * 3 = 12   4*4 =16 4*5 =20
		 * 		5 * 1 = 5 5 * 2 = 10 5 * 3 = 15   5*4 =20 5*5 25
 		 *  
		 *  */
		/*
		 
		 
		 //실패작
		int i,j;
		int a, b;
		a = scn.nextInt();
		b = scn.nextInt();
		for(j = 1; j<=5; j++)  // 몇을 곱할지 
		{
			for(i = a; i <=b; i++)  //a단부터 b단			
			{
				
				
				i *= 1; // i= i * 1 
						// i = i*1 2*1
						// i1 = 단부터 3*1
						// i2 = 4*1
						// 나와서 아래 f문 수행
						
						
				System.out.printf("%d  * %d = %2d   \n", i,j,i*j);
				
			}
	
			
			
		}
			
		System.out.println();
		*/
		
		//=============답
		// i는 단
		/*
		int i, j, a, b, tmp;
		a = scn.nextInt(); // a 가 클수도 있고 b가 클수도있어서 tmp변수 삼각형 그리기
		b = scn.nextInt();
		if(a>b) 
		{
			tmp = a;
			a = b;
			b = tmp;
		}			
		for(i = a; i <= b; i++)  // a가 작을때 돌아감
		{
			for(j=1; j<=5; j++) // 하드코딩 
			{
				System.out.printf("%d * %d = %2d   ", i,j,i*j);
			}
			System.out.println();
		}
		*/
		}
	}

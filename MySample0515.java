import java.util.*;
public class MySample0515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		/*
		int a = 1;
		while(a <=10) {
			System.out.println(a);
			a++;
		}*?
		int */
		/* for문으로 교체
		int a;
		for(a=1; a<=10;a++)
		{
			System.out.println(a);
		}
		*/
		
		/* 문제) 알파벳 'A'부터 'Z'까지 출력하는 프로그램
		 * 출력예) ABCDFGHIJKLMNOPQRSTUVWXYZ
		 	단 변수는 alpha = 'A'초기 대입 후 사용
		 *
		 */
		
		/* ================================답
		 char alpha = 'A';
		 
		 while(alpha <= 'Z') 
		 {
			 
			 System.out.printf("%c",alpha);
			 alpha++;
			 
		 }
			*/
		
		/*
		 * 문제) 1이상 100이하의 정수를 입력받아 while 문을 이용하여
		 * 1부터 입력받은 정수까지의 합을 구하는 프로그램 작성 //누적//입력받을정수 
		 * 입력예)10
		 * 출력예)55
		 *
		 *
		 */
		/*
		int i = scn.nextInt();
		int j = 1;
		int sum = 0;
		while(j <= i)  //5  //j는 1부터 5까지 반복
			
		{
			
			sum += j; //합계는 sum = sum+j j는5까지 sum = sum + 1 // 2 //3 //4 //5 
			j++;
			
		}
		
		System.out.printf("%d",sum);
	*/
		
		//=======답
		/*
		int num, sum = 0;
		int i = 1 ;
		num = scn.nextInt();
		
		
		while(i <= num)  //for(i = 1; i<=num; i++)
		{
			
			sum += i;
			i++;
		}
		System.out.println(sum);	
		*/
		
		
		/*
		 * 문제) 점수를 입력받아 80점 이상이면 합격메세지를 그렇지 않으면
		 * 불합격 메세지를 출력하는 작업을 반복하다가 0~100이외의 점수가 입력되면 종료하는 프로그램
		 * while조건식에 비교와 논리연산자 사용
		 * 입.출력예) 점수를 입력하세요.>50
		 * 			죄송합니다. 불합격입니다.
		 * 			점수를 입력하세요.>95
		 *			축하합니다. 합격입니다.
		 *			점수를입력하세요>101.
		 *			
		 */
		/*
		System.out.print("점수를 입력하세요");
		int score = scn.nextInt();
				
		while(score >=0 && score <=100) // 0부터100의 값을 입력해야 아래 반복문이 실행됨
		{
			if(score >= 80)  // 만약 score가 81을 입력했을때  아래 print문 출력후 if문 빠져나옴
				
			{
				System.out.println("합격입니다");
			}
			else if( score < 80)
			{
				System.out.println("불합격입니다");
			}
			System.out.print("점수를 입력하세요"); //if문을 빠져나와 또다시 점수를 입력함
			score = scn.nextInt();	//score 점수를 입력하면 위 while문 부터 반복
		
			//만약 0~100사이의 값이 아닌 값을 입력하면 while문을 빠져나와 종료되게됨
			
		}
			System.out.println("종료");
	*/
		
		/*
		
		System.out.print("점수를입력하세요");
		int score = scn.nextInt();
		
		while(score >=0 && score <= 100)
		{
			if(score>=80)
			{
				System.out.println("합격입니다");
			}
			else 
			{
				System.out.println("불합격입니다.");
			}
			System.out.print("점수를입력하세요");
			score = scn.nextInt();
		}
		System.out.print("종료");
		*/
		
		//===================답
		/*
		 *  int score;
		 *  System.out.print("점수를 입력하세요.>"
		 *  score = scn.nextInt();
		 *  
		 *  while(score >= 0 && score <= 100) // 범위가 묶여져있어 and
		 *  {
		 *  	if(score >= 80)
		 *  	{
		 *  		System.out.println("축하합니다 합격입니다.");
		 *  	}
		 *  	else
		 *  	{
		 *  		System.out.println("죄송합니다 불합격입니다.");
		 *  	}
		 *  	System.out.print("점수를입력하세요");
				score = scn.nextInt();
		 * 	}
		 * 
		 */
		
		/*위 의 문제를 while무한루프를 이용하여 작성
		 * 	단, while*(tru) //for(;;)
		 * (break, continue) 
		 * */
		//=====답
		/*
		int score;
		while(true)
		{
			System.out.print("점수를 입력하세요,>");
			score = scn.nextInt();
			if(score <0 || score > 100)
			{
				System.out.print("끝");
				break;//끝 무한루프 나를 감싸고있는 반복문을 빠져나감
			}
			if (score >=80) 
			{ 
				System.out.println("축하합니다 합격입니다");
			}
			else 
			{
				System.out.println("죄송합니다. 불합격입니다");
			}
		}
		*/
		 
		
		
		/* continue문
		 * 1부터 10까지 반복하면서 홀수만 출력하는 프로그램 작성
		 * 단, continue문 사용
		 * */
		/*
		int num = 0;
		while (num < 10)
		{
			num++;  // 1
			
			if(num % 2==0)
			{
				continue; // 밑에있는 프로그램이 상관이없이 while문에 흐름은 끝 while 조건식으로 다시감 -> while(num < 10)
			}
			System.out.println(num); //홀수 일때만 출력
		}
		
		*/
		//위와 동일한 방법으로 for문사용
		/*
		int i;
		
		
		for(i=1; i<=10; i++) 
		{
			if(i%2==1)
			{
				System.out.printf("%d",i);
			}
		
		}
		*/
		//====답
		/*
		int num;
		
		for(num = 1; num<=10; num++)
		{
			if(num%2 ==0)
				continue;
			
			System.out.println(num);
		}
		*/
		
		/* 문제) 정수를 계속 입력 받다가 0 이 입력되면 0을 제외하고 이전에 입력된 자료의 수와 합계, 평균을 출력하는 프로그램 // 무한루프
		 * (평균은 소수 둘째자리 출력)
		 * 단,while무한루프사용
		 * 입력예)15 88 97 0
		 * 출력예) 입력된 자료의 개수는 = 3
		 * 		  입력된 자료의 합계 = 200
		 * 		  입력된 자료의 평균 = 66.67
		 *
		 */
		
		/*
		
		int i;
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		while(true)
		{
				 i = scn.nextInt();
				 if ( i == 0 ) 
				 {	 
					 break;
				 }
				 	else   
				 	{ 		
				   		sum += i; //15 88 97 0 // sum = 0 + 15  -> sum = 15+ 88 -> sum = 103 + 97 = 200  
				   		cnt++; 		//cnt++ 15 88 97 0// 15 -> cnt 1 88 -> cnt 2 97 cnt 3 0 -> break; cnt =3개
				 	}
				 
		}
		 avg = (double) sum / cnt; // 평균 200 / 3  -> 66.67 
   		System.out.printf("입력된자료의 개수: %d개 \n",cnt);
   		System.out.printf("입력된자료의 합계: %d \n",sum);
   		System.out.printf("입력된자료의 평균: %.2f \n",avg);
   		
   		*/
		
		
		//답===============
		/*
		int score;
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		while(true)
		{
				score = scn.nextInt();
				
				if(score == 0) 
				{
					break; //반복문을 빠져나가야되므로 
					
							// continue; 가 작성되면 다시
				}
				
				cnt++;
				sum+= score;
				
		}
		avg = (double)sum / cnt;      //sum /5.0
		
		System.out.printf("입력된자료의 개수: %d개 \n",cnt);
   		System.out.printf("입력된자료의 합계: %d \n",sum);
   		System.out.printf("입력된자료의 평균: %.2f \n",avg);
   		*/
		
		/* 정수를 계속 입력 받다가 0이 입력되면 입력된 수 중 홀수의 합과 평균을 출력하는 프로그램 작성 // 무한루프
		 * continue , break문사용
		 * 입력예)5 8 17 6 31 0
		 * 출력예)훌수의 합 : 53
		 * 		홀수의 평균 : 17
		 * 
		 */
		
		/*
		int a;
		int cnt = 0;
		int sum = 0;
		int avg = 0;
		while(true)
		{
				a = scn.nextInt();
				
				if(a == 0) 
					{
						break; //반복문을 빠져나가야되므로 
						
								// continue; 가 작성되면 다시
					}
				else if( a % 2 == 1 ) // 홀수이면 
					{
						sum += a;	 //sum합계구하기 5 8 17 6 31 0  sum 1 = sum + 5 = 5 // sum2 = 5 + 17 = 22 // sum3 = 22+31 = 53 
						cnt++;		//갯수 avg에 활용하기위해 5 17 31 3개
						
					}
				else
					{
						continue;
					}
				
		}
		avg = sum / cnt;      //sum /5.0
		
		
   		System.out.printf("홀수의 합: %d \n",sum);
   		System.out.printf("홀수의 평균: %d",avg);
   		
   		
   		 */
		
		/*
		int sum = 0;
				int count = 0;
				int num = 0;
				int avg = 0;
				while (true) 
				{
				    num = scn.nextInt();
				    
				    if (num == 0)
				    {
				        break;
				    }
				        else if (num % 2 != 0)
				        {
				        sum += num;
				        count += 1;
				        }
				    else 
				    {
				    	
				        continue;
				    }

				if(count > 0) 
				{
					avg = sum / count;
				}
				   
				else
				{
					 avg = 0;
				}
				    
				}
				System.out.printf("홀수의 합 %d \n",sum);
				System.out.printf("홀수의 평균 : %d",avg);
				*/
		
			//답===================================
		/*
		int su, sum = 0;
		int avg, cnt = 0;
		while(true)
		{
			su = scn.nextInt();
			if(su == 0 ) break;
			if(su % 2 == 0 )continue;
			
				
				sum +=su;
				cnt++;
		}
		avg = sum/cnt;
		
		System.out.printf("홀수의 합 %d \n",sum);
		System.out.printf("홀수의 평균 : %d",avg);
		*/
		
		/* do~while문
		 * 
		 * 
		 */
		
		
		
		
		/*
		 * 
		int a = 1;
		do
		{
			System.out.println(a+ "번째 출력");
			a++;
		}while( a <= 10);
	*/
	
		/*문제) 위 문제를 while 무한루프를 사용하여 프로그램
		 * 
		 * 
		 */
	
		//답===============
		/*
		int a = 1;
	
		
		while(true)
		{
			System.out.println(a);
			a++;
			if( a > 10 )break;
		}
	*/
		
		
		/*
		 * 문제)정수를 계속 입력 받다가 0이 입력되면 수 중 홀수의 합과 
		 * 		평균을 출력하는 프로그램.
		 * 		do~while문을 사용 break,continue 사용안함
		 * 입력예) 5 8 17 6 31 0
		 * 출력예) 홀수의 합 : 53
		 * 	     홀수의 평균 :17
		 * 
		 */
		/*
		int i;
		int cnt = 0, sum = 0, avg = 0;
		
		do
		{
			i = scn.nextInt(); // 입력 do반복문 안ㅇ ㅔ넣기
			if( i %2 ==1 )
			{
				sum += i; 
				cnt++;
				
			}
		}while( i != 0); // 0이랑 같지 않을때 실행
		avg = sum / cnt;
		System.out.printf("홀수의 합 %d \n",sum);
		System.out.printf("홀수의 평균 : %d",avg);
		
		*/
		/*
		int i;
		int cnt = 0, sum = 0, avg = 0;
		do
		{
				i=scn.nextInt();
				if(i%2 == 1)
				{
					sum += i;
					cnt++;
				}
		}while(i!=0);  // while이 0이 아닌경우(false인경우) do while문 탈출  // 조건식이 true일경우 위의 실행문 반복
		avg = sum / cnt;
		System.out.printf("홀수의 합 %d",sum);
		System.out.printf("홀수의 평균 : %d",avg);
		*/
		// 답=============
		/*
		int su, sum=0, cnt = 0;
		int avg;
		
		do
		{
	
			su = scn.nextInt();
			if(su % 2 != 0)
			{
				sum += su;
				cnt++;
			}
		}while(su != 0);
		
		avg = sum / cnt;
		System.out.printf("홀수의 합 %d \n",sum);
		System.out.printf("홀수의 평균 : %d",avg);
		
		
		/*
		 * 문제) 아래오 같이 메세지를 출력하고 숫자를 입력 받아 선택한 번호에 해당하는 메세지를 출력하는 작업을 반복하다가
		 * 		4가 입력이되면 메세지 출력 후 종료하는 프로그램
		 *단, do~while문을 사용하고 , 1~4번 이외의 수가 입력되면 "잘못입력하셨습니다" 라고 출력
		 *입, 출력예)1. 입력하기
		 *		   2. 출력하기
		 *		   3. 삭제하기
		 *		   4. 끝내기
		 *			작업할 번호를 선택하세요 > 2 (4)
		 *
		 *			출력하기를 선택하셨습니다. (끝내기를 선택하셨습니다.
		 *
		 *		   1. 입력하기
		 *		   2. 출력하기
		 *		   3. 삭제하기
		 *		   4. 끝내기
		 *			작업할 번호를 선택하세요 > 6
		 *			잘못 입력하셨씁니다.
		 * 
		 * 
		 */
		
		/*
		int i;
		
		do
		{
			System.out.println("1.입력하기");
			System.out.println("2.출력하기");
			System.out.println("3.삭제하기");
			System.out.println("4.끝내기");
			System.out.print("작업할 번호를 선택하세요>");
				i=scn.nextInt();
				if(i==1)
			{
				System.out.println("입력하기를 선택하셨습니다.");
			}
			else if(i==2)
			{
				System.out.println("출력하기를 선택하셨습니다.");
			}
			else if(i==3)
			{
				System.out.println("삭제하기를 선택하셨습니다.");
			}
			else if(i==4)
			{
				System.out.println("끝내기를 선택하셨습니다.");
				
			}
			else
			{
				System.out.println("잘못입력하셨습니다.");
			}
				
		}while(i>0 &&i<4);  // while이 0이 아닌경우(false인경우) do while문 탈출  // 조건식이 true일경우 위의 실행문 반복
	
		*/
		
		//답========
		/*
		int num;
		do
		{
			System.out.println("1.입력하기");
			System.out.println("2.출력하기");
			System.out.println("3.삭제하기");
			System.out.println("4.끝내기");
			System.out.print("작업할 번호를 선택하세요>");
			num = scn.nextInt();
			
			if( num == 1 )
				System.out.println("\n입력하기를 선택하셨습니다.\n");
			else if( num ==2 )
				System.out.println("\n출력하기를 선택하셨습니다.\n");
			else if( num == 3)
				System.out.println("\n삭제하기를 선택하셨습니다.\n");
			else if( num == 4)
				System.out.println("\n끝내기를 선택하셨습니다.\n");
			else 
				System.out.println("\n잘못 선택하셨습니다.\n");
			
			/*
			//반복문에서는 switch헷갈림
			switch(num)
			{
			case 1:
				System.out.println("\n입력하기를 선택하셨습니다.\n");
				break;
			case 2: 
				System.out.println("\n출력하기를 선택하셨습니다.\n");
				break;
			case 3: 
				System.out.println("\n삭제하기를 선택하셨습니다.\n");
				break;
			case 4: 
				System.out.println("\n끝내기를 선택하셨습니다.\n");
				break;
			default:
				System.out.println("\n 잘못 선택하셨습니다.\n");
			}*/
		
		//}while(num != 4); // num이 4와 같지 않을때 까지 반복
		
	
	}
	
}



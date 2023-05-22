import java.util.*;
public class MySample0517 {

	public static void main(String[] args) {
		// 배열
		Scanner scn = new Scanner(System.in);
		
		
		
		/* 문제)100개의 정수를 저장할 수 있는배열을 선언하고 차례대로 입력받다가
		 * 0이입력되면 0을 제외하고 그때까지 입력된 정수를 가장 나중에 입력된
		 * 정수부터 차례대로 출력하는 프로그램
		 * 입력예)3 5 10 55 0
		 * 출력예)55 10 5 3
		 */
		/*
		int i, cnt =0;
		int []a = new int[100];
		
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
			if(a[i] == 0)
			{
				break;
			}
			cnt++;  // 0 1 2 3 0 cnt= 1 , 2 ,3 ,4 
		}
		for(i=cnt-1; i >= 0; i--)   // a[3] a[2] a[1] a[0] 이출력 거꾸로 출력
		{
			System.out.printf("%d ",a[i]); 
		}
		*/
		/*
		 *  int i, cnt = 0;
		 *  int []a = new int[100];
		 *  for(i=0; i<a.length; i++)
		 *  {
		 *  
		 *  	a[i] = scn.nextInt();
		 *  if(a[i]==0)
		 *  {
		 *  break;
		 *  }
		 *  cnt++;
		 *  for(i=cnt-1; i>=0; i--)
		 *  {
		 *  	System.out.printf("%d ",a[j]);
		 *  }
		 *  
		 */
		//답=========
		// i = 0
		//cnt = 0
		/*
		int[] a = new int[100];
		int i, cnt = 0;
		
		for(i = 0; i < a.length; i++)//배열의  i는 0부터 많음
		{
			a[i] = scn.nextInt(); //a = scn.nextInt한다면 오류남 시작주소임
			if(a[i]==0)break;
			cnt++;
		}
		*/
		/*
		for(i=cnt-1; i>=0; i--)
		{
			System.out.printf("%d ",a[i]);
		}*/
		//cnt 대신 j,i변수 이용하여 반복
		
		/*
		int j;
		for(j = i-1; j>=0; j--)
		{
			System.out.printf("%d " , a[j]);
		}*/
		
		/* 3 31 2 28
		 * 문제)연도와 월을 입력받아 //해당 월의 날수를 출력하다가 월이 0이면 종료하는 프로그램//
		 * 단, 윤년은 400년에 한번씩, 4년에 한면이면서 100년은 제외;
		 * 	%400 ==0  
		 * year%400 ==0 ||(year %4 == 0 && year % 100 != 0)
		 * 윤년인 경우 2월은 날수가 29일
		days[입력받은 월]
		입.출력예) 년 = 2000
				 월 = 2
				 입력하신 달의 수는 29일입니다. //day[month]
				 
				 년 = 2022
				 월 = 13
				 잘못 입력하셨습니다.
				 
				 년 = 2023
				 월 = 0 
			
		 */
		/*
		int month;
		int year;
		int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
		for(; ;)
		{
			 
			System.out.print("년 =");
			year = scn.nextInt();
			System.out.print("월 =");
			month = scn.nextInt();
			
			if(month==0)break; // 월이 0일때 끝내기
			
			if(month>12 || month < 0) // month는 1월 에서 12월사이가 아닐땐 
			{
				System.out.print(" 잘못 입력하셨습니다."); 
			}	
			else // month 1월에서 12월 사이일떄
			{
				
			
				if(year%400 ==0 ||(year %4 == 0 && year % 100 != 0)) //윤년의 경우 2월에는 29일
				{
					days[2] = 29; //2월이 29일
					
				}
				else days[2] = 28; // 윤년이 아닐떄는 2월이 28일
	
				System.out.printf("입력하신 달의 수는 %d일입니다 \n",days[month]);


			}
		}
		*/
		//잘라서 하기
		/*
		int month;
		int year;
		int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		while(true)
		{
			System.out.print("년 =");
			year = scn.nextInt();
			System.out.print("월 =");
			month = scn.nextInt();
			
			if(month==0)break; // 월이 0일때 끝내기
			
			if(month>12 || month < 0) // month는 1월 에서 12월사이가 아닐땐 
			{
				System.out.print(" 잘못 입력하셨습니다."); 
			}	
			else // month 1월에서 12월 사이일떄
			{
				
			
				if(year%400 ==0 ||(year %4 == 0 && year % 100 != 0)) //윤년의 경우 2월에는 29일
				{
					days[2] = 29; //2월이 29일
					
				}
				else days[2] = 28; // 윤년이 아닐떄는 2월이 28일
	
				System.out.printf("입력하신 달의 수는 %d일입니다 \n",days[month]);

		}
	
	}
	*/
		//답===========
		/*
		int month, year;
		int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31}; // 인덱스는 0부터 시작하기때문에 앞에 0
		while(true) // for(;;)
		{
			System.out.print("년=");
			year = scn.nextInt();
			System.out.print("월=");
			month = scn.nextInt();
			
			if(month == 0)break; //0도아니고 1월~12사이가 아닐때
			
			if(month < 1 || month>12)// 1보다 작거나 12보다 커야해서 범위에 포함하지않으니까 ||  //if(!(month >=1 && month<=12)
			{
				System.out.println("잘못 입력하셨습니다.");
				continue; // 만나면 while문 다시 시작하기 때문에
						// continue를 안쓰면 else를 추가
			}
			
			if(year%400 ==0 ||(year %4 == 0 && year % 100 != 0))//400의배수 or 4년에 한번 and 100년에 한번 제외
			{
				days[2] = 29;
			}
			else
			{
				days[2] = 28;
			}
			
		
			System.out.printf("입력하신 달의 날수는 %d일입니다 \n",days[month]);
	}
		*/
		
		/*
		 * 문제)10개의 정수를 입력받아// 그 중 가장 큰 수를 출력하는 프로그램 a[0] a[1] a[2] a[3]
		 * 입력예) 5 10 8 55 6 31 12 24 61 2
		 * 출력예) 61 
		 * 단 출력은max변수 사용 //무한 루프 아님	 
		 */
		/*
		int i;
		int a[] = new int[10];
		int max = a[0];
		for(i = 0; i < a.length; i++ ) 
		{
			a[i] = scn.nextInt();
		}
		for(i=0; i<10; i++) //a[0] = 5 a[1] = 10 a[2] = 8 a[3] = 55 a[4] =6  max5 <  
		{
			if( max < a[i]) // 5 10 8 55 6 31 12 24 61 2 // a[0]5 < a[i] 5 // a[1] <
			{
				max = a[i];
			}
		}
	
		System.out.printf("%d ",max);
		
		*/
		//답==================
		// 5 10 8 55 6 31 12 24 61 2
		/*
		int[] a = new int [10];
		int max = 0, i;
		
		for(i = 0; i<a.length; i++)
		
		{
			a[i] = scn.nextInt();
		}
		max = a[0]; // 5 10 8 55 6 31 12 24 61 2
		for(i=1; i<a.length; i++)//배열의 0은 담았기때문에 i =1부터
		{
			if(max < a[i]) 
			{
				max = a[i];  
			}
		}
		System.out.printf("%d ",max);
		*/
		
		
		/*문제) 10개의 수를 입력받아 그중 가장 작은 수를 출력하는 프로그램
		 * 입력예) 5 -10 8 55 -6 31 12 24 61 -2
		 * 출력예) -10
		 * 단, 가장작은수 출력시 min변수를 사용하며, 선언시 초기값 설정하지 않음.
		 * 
		 */
		/*
		int i;
		int min;
		
		int[] a = new int[10];
		for(i=0; i<a.length; i++)
		{
			
			a[i] = scn.nextInt();
			
		}
		min = a[0];
		for(i=1; i<a.length; i++) //5 -10 8 55 -6 31 12 24 61 -2
			
			if(min > a[i]) 
			{
				
				min = a[i];
			}
	
		System.out.printf("%d",min);
		*/
		/*
		int[] a = new int[10];
		int i,min;
		for(i = 0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
		}
		min = a[0]; //min = 0;
		
		for( i = 1; i<a.length; i++)
		{
			if(min > a[i])
			{
				min = a[i];
			}
		}
		System.out.println(min);
		*/
		/*
		 * 문제) 4자리 이하의 10개의 정수를 입력받아 // 4자리 이하는 int타입과 상관없음 min , max변수에 초기값세팅
		 max = 9999 min -9999
		 * 짝수중 가장 큰값과 홀수중 가장 작은 값을 출력하는 프로그램. /
		 * max변수에는 짝수인지체크하고 그중에서 가장 큰값 출력 ///가장작은수에서 +1 = -10000
		 * min변수에는 입력받은 값중에서 값이 홀수면 가장 작은값 출력 // 가장 큰수에서 +1 =10000
		 * 
		 * 단, min max변수 초기값 설정 후 진행함.
		 * 입력예)-5 10 -8 55 6 -31 12 -24 61 2
		 * 출력예)홀수 중 가장 작은 값 : -31 (min) 
		 * 		짝수 중 가장 큰 값 : 12 (max)
		 * int[] n = new int[10];
		int i, max = -10000, min = 10000;

		 * 
		 */
		/*
		int[] a = new int[10];
		int i;
		int min = 10000;
		int max = -10000;
		for(i = 0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
		}
		min = a[i];
		max = a[i];
		for( i = 1; i<a.length; i++)
		{
			if(a[i]%2 == 1 )
			{

				if(min > a[i]) //10000 > -5
				{
					min = a[i];
				}
			}
			else
			{
				if(max < a[i])
				{
					max = a[i];
				}
				
			}
		}
		System.out.printf("홀수중 가장 작은 값은 %d \n",min);
		System.out.printf("짝수중 가장 큰 값은 %d",max);
		*/
		/*
		 * 
		int i;
		int max = -10000;
		int min = 10000;
		int[] a = new int[10]; //선언과 동시에 사이즈가 정해진다.
		for( i=0; i<10; i++)
		{
			a[i] = scn.nextInt();

			if(a[i]%2!=0)  //만약 홀수이면 
			{
				if(a[i]<min) // a[i]가 10000보다 작아야함 // 입력한 -5 10 -8 55 6 -31 12 -24 61 2 에서 min 1 = -5 
				{			// min2 = 55<-5 = X =-5 // min3 = -31  < -5 = -31 O // min4 =  < -31   min = -31
					min = a[i];
				}
			}
			else
			{
				if(a[i]>max) // a[i]%2 == 0 짝수이면 계산됨 10 -8 6 12 -24 // 
							// a[i]가 -10000보다커야함-5 10 -8 55 6 -31 12 -24 61 2 // max  = -10000 max 1 = 10 >-10000 = 10 
				{			//  i/2 ==0 인것  짝수인것만 계산 max2  = -8 >10 X -> max3 = 12 > 10 = 12 max 4 =  > 12 max > 12 > -24 x = 12 
					max = a[i];
				}
			}
		}
		System.out.printf("홀수 중 가장 작은 값 :%d\n",min);
			System.out.printf("짝수중 가장 큰 값 %d", max);
			*/
		//답========
		//-5 10 -8 55 6 -31 12 -24 61 2
		/*
		int[]a = new int[10];
		int i;
		int max = -10000; // 가장 작은값
		int min = 10000; // 가장 큰값 
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
		}
		for(i=0; i<a.length; i++)
		{
			if(a[i] %2 ==0)// 짝수일때 max값
			{
				if(max < a[i])
				{
					max = a[i];
				}
			}
			else
			{
				if(min > a[i])
				{
					min = a[i];
				}
			}
		}
		System.out.printf("홀수 중 가장 작은 값 :%d\n",min);
		System.out.printf("짝수중 가장 큰 값 %d", max);
		*/
		
		/* 문제 ) 10명의 컴퓨터 점수를 입력받아 배열에 저장하고 총점과 평균을 구하는 프로그램 작성
		 *	입력예) 95 100 88 65 76 89 58 93 77 99
		 *	출력예) 총점 =840
		 *		   평균 =84.0
		 */
		/*
		int i;
		int[] score = new int[10];
		int cnt=0,sum=0;
		double avg=0;
		for(i=0; i<score.length; i++)
		{
			score[i] = scn.nextInt();
			sum += score[i]; // sum = sum+score[i] 
			cnt++;
		}
		
		avg = (double)sum / cnt; // 소수점 아래자리 나오려면 형변환 해야함
		System.out.printf("총점 = %d\n", sum);
		System.out.printf("평균 = %.1f",avg);
		*/
		//답=================
		/*
		int[] score = new int[10];
		int i,sum = 0;
		double avg;
		
		for(i=0; i<score.length; i++)
		{
			score[i] = scn.nextInt();
			sum += score[i];
		}
		avg = (double)sum / score.length;
		
		System.out.printf("총점 = %d \n",sum);
		System.out.printf("평균 = %.1f \n",avg);
		*/
		
		
		
		//선택정렬
		/* 문제)
		 * 5개의 정수를 {95,75,85,100,50}로 초기화하고 오름차순으로
		 * 정렬하여 출력하는 프로그램
		 * 출력예)50 75 85 95 100
		 * if(a < b) {  // 3 5   tmp =3
							 
			tmp = a; // 삼각형
			a = b;
			b = tmp;
		 */
		/*
		int tmp;
		int i,j=0; 
		int a[] = {95,75,85,100,50};
		
		for(i=0; i<a.length-1; i++) //선택정렬  0부터 4 0 1 2 3 4 i++
		{
			for(j= i+1; j<a.length; j++) 	// j1= 0+1 j<5 j++
			{
								
				if(a[i]>a[j]) // 교환		// 95 75 85 100 50 
				{
				
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
				
			}
			
		}
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d ",a[i]);
		}
		*/
		
		//답=========
		/*
		int[] a = {95,75,85,100,50}; // int[] a = new int[5];
		int i,j, tmp;
		
		for(i=0; i < a.length-1; i++) // 
		{
			for(j=i+1; j < a.length; j++) //기준값 다음값부터 읽어야함
			{
				if(a[i] > a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}	
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d ",a[i]);
		}
		*/
		
		/*문제)10개의 정수를 입력받아 배열에 저장한 후
		 * 내림차순으로 정렬하는 프로그램
		 * 입력예) 95 100 88 65 76 89 58 93 77 99
		 * 출력예)100 99 95 93 8 88 77 76 65 58 
		 */
		/*
		int[] a = new int[10]; 
		int i,j, tmp;
		
		for(i=0; i<a.length; i++) //입력값 반복 10까지 
		{
			a[i] = scn.nextInt(); 
		}
		for(i=0; i<a.length-1; i++) // i=0 i<9까지반복 i++
		{
			for(j= i+1; j<a.length; j++) //i=0 -> j=1; j<10 j++;
			{				
				if(a[i]<a[j])  
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}	
			}
		}
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d ",a[i]);
		}*/
		//답=======
		/*
		int[] a = new int[10];
		int i, j, tmp;
		
		for(i=0;i<a.length;i++);
		{
			a[i] = scn.nextInt();
		}
		
		for(i=0; i<a.length-1; i++)
		{
			for(j= i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			//여기서 교환이 일어나야함
		}
		for(i = 0; i<a.length; i++)
		{
			System.out.printf("%d",a[i]);
		}*/
		
		 int[] a = new int[10];
		  int i, j, tmp, val, idx = 0;
		  
		  for(i = 0; i < a.length; i++)
		  {
		     a[i] = scn.nextInt();
		  }
		  
		  for(i = 0; i < a.length-1; i++)
		  {
		     val = a[i];
		     for(j = i+1; j < a.length; j++)
		     {
		        if(val < a[j])      //if(a[i] < a[j])
		        {
		// tmp = a[i];
		// a[i] = a[j];
		// a[j] = tmp;
		val = a[j];
		idx = j;
		}
		}
		//최종 교환 시작
		if(idx > i)
		{
		tmp = a[i];
		a[i] = a[idx];
		a[idx] =tmp;
		}

		     idx = 0;
		     //최종 교환 끝
		  }
		  
		  for(i = 0; i < a.length; i++)
		  {
		     
		     System.out.print(a[i] + " ");

		  }
		
		
	}
}

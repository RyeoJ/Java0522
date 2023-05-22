import java.util.*;
public class MySample0516 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		/* 반복문
		 * 문제) 정수 n을 입력받아 n줄만큼 다음과 같이 출력하는 프로그램
		 * for문 사용
		 * printf("%2d ", 변수)
		 * 입력예) 5
		 * 출력예)  1
		 * 		  2  3
		 *        4  5  6
		 *        7  8  9  10
		 *       11 12 13 14 15
 		 */
		/*
		int i,j, n, k=1;
		n = scn.nextInt();
		for(i = 1; i<=n; i++) 
		{
			
			for(j=1; j<=i; j++) 
								
			{
					
					System.out.printf("%2d \t",k++); 
					
			}
			
		    System.out.println();
		}
		*/
		/*
		 
		int i,j,n,k=0;
		n = scn.nextInt();
		for(i = 1; i<=n; i++)
		{
			for(j=1; j<=i; j++)
			{
				k++;
				System.out.printf("%2d \t", k);
			}
			System.out.println();
		}
	*/
		
		// 답===============
		/*
		int i,j,n,cnt = 0;
		
		n = scn.nextInt();
		
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=i; j++) 
			{	
				System.out.printf("%2d ", ++cnt);
			}
			System.out.println();
		}
		*/
		
		
		/*	 문제) 정수 n을 입력받아 다음과 같이 영문자를 출력하는 프로그램.
		 * 	입력예) 3
		 * 출력예)A B C
		 * 		 D E
		 * 	     F
		 * for(i = 'A'; i<='Z'; i++)
		 */
		/*
		int i,j,n;
		char k = 'A';
		n = scn.nextInt();
		
		for(i=n; i>=1; i--) //열 
		{
			for(j=1; j<=i; j++) //행 6 
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}*/
		//답============
		/*
		int n, i, j;
		char a = 'A';
		n = scn.nextInt();
		
		for(i = n; i>=1; i--)
		{
			for(j = 1; j<=i; j++)  // i가5면 5번돔
			{
				System.out.printf("%c \t",a++);
			}
				System.out.println();
		}
	*/
		/*
		 * 문제)for문을 이용하여 다음과같이 출력하는 프로그램 작성
		 * 출력예) a 1 2 3 4
		 * 		 b c 5 6 7
		 * 		 d e f 8 9
		 * 		 g h i j 10
		 */
		
		/*
		int i, j, num=1;
		char alpha = 'a';
		
	for(i = 1; i<=4; i++) 
	{
		for(j = 1; j<=i; j++)
		{
			System.out.printf("%c ", alpha);
			alpha++;
		}
		
		for(j=4; j>=i; --j)
		{
			System.out.printf("%d ", num);
			num++;
		}
		System.out.println();
	}
	*/
		
		//답==========
		/*
		int i, j, num=1;
		char alpha = 'a';
		
		for(i = 1; i<=4; i++) 
		{
				for(j = 1; j<=i; j++) // 1->2->3->-4
				{
					System.out.printf("%c ", alpha);
					alpha++;
				}
				
				for(j=1; j<=5-i; j++) // 4->3 ->2->1
				{
					System.out.printf("%d ", num);
		-			num++;
				}
				System.out.println();
		}
		*/
		
		
		
		/*
		 * 
		 * 
		 * while문의 무한루프를 이용하여 아래와 같이 실행되는 프로그램을 작성.
		 * 입출력예) 현재가진 돈은 10000원입니다. 
		 * 		   얼마를 사용하시겠습니까?>1000원
		 * 		   이제 9000원 남았습니다.
		 * 
		 * 			얼마를 사용하시겠습니까?5000
		 * 			이제 4000원 남았습니다.
		 * 			
		 * 			얼마를 사용하시겠습니까? 5000
		 * 			다시 입력하세요.(사용범위 오류)
		 * 
		 * 			얼마를 사용하시겠습니까? 4000
		 * 			이제 0 원 남았습니다.
		 * 			모든 돈을 사용했습니다. 끝
		
		
		
		
			
		 */		  
		/*
		int money = 10000, n;
		System.out.printf("현재가진 돈은 %d입니다 \n", money);
		System.out.println("얼마를 사용하시겠습니까?");
		n = scn.nextInt();
		
		while ( money - n != 0 && n > 0)
		{
			
			if( money == 0 )
				{
					System.out.printf("이제 %d원남았습니다",money);
					break;
				}
			else if( money -n > 0 )
				{
					money -= n;
					System.out.printf("이제 %d원 남았습니다\n",money);
					System.out.println("얼마를 사용하시겠습니까?");
					n = scn.nextInt();
					
				}
			else
				{
					System.out.println("다시 입력하세요(사용범위 오류)");
					n = scn.nextInt();
					continue;
				}
		}
		
		System.out.println("모든 돈을 사용했습니다.끝");
		
		*/
		
		//답=========
		/*
		int money = 10000, n;	
		System.out.printf("현재가진 돈은 %d입니다 \n", money);
		while(true)
		{
			System.out.print("얼마를 사용하시겠습니까?");
			n = scn.nextInt();
			
			if(!(n >= 0 && n <=money)) // !(false) == true//if(n <0 || n >money)
			{
				System.out.println("다시 입력하세요(사용범위 오류)");
				continue;
			}
			money -= n;
			System.out.printf("이제 %d원 남았습니다 \n",money);
			
			if(money == 0) break;
			
		}
		*/
		
		/*배열
		 * 5개의 정수를 입력 받은 후 차례대로 출력하는 프로그램
		 */
		//기존방법
		/*
		int a, b, c, d, e;
		
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		d = scn.nextInt();
		e = scn.nextInt();
		
		System.out.printf("%d %d %d %d %d \n", a,b,c,d,e);
		
		*/
		 //위 문제와 같은것으로 배열을 사용하되 반복문은 사용하지않음.
		/*
		int a[] = new int[5];
		// int[] a;
		// a= new int[5];
		a[0] = scn.nextInt();
		a[1] = scn.nextInt();
		a[2] = scn.nextInt();
		a[3] = scn.nextInt();
		a[4] = scn.nextInt();
		 
		System.out.printf("%d %d %d %d %d \n", a[0], a[1], a[2], a[3], a[4]);*/
		
		
		/* 위 문제와 같은 것으로 배열을 반복문에 적용
		 * 
		 * 
		 */
		/*
		int i;
		int a[] = new int[5];
		for(i = 0; i < a.length; i++ ) // i < a.length i < 5
		{
			a[i] = scn.nextInt();
		}
		for(i = 0; i< a.length; i++)
		{
			System.out.printf("%d ",a[i]);
		}
		*/
		/*
		 * 문제 ) 정수 5개를 입력 받은 후 합계를 출력하는 프로그램
		 * 입력예) 10 20 30 40 50
		 * 출력예) 150
		 * 
		 * 
		 */
		/*
		int i; 
		int sum = 0;
		int a[] = new int[5]; // [0],[1],[2],[3],[4]  =5개 
		for(i = 0; i<a.length; i++) // i가 a.length = [5] = [0],[1],[2],[3],[4] 까지 반복 
		{
			a[i] = scn.nextInt();
			sum += a[i];
		}
		System.out.printf("%d ",sum);;
		
		 */
		//답==========
		/*
		int[] a = new int[5];
		int i, sum = 0;
		System.out.println("a.length: " + a.length);
		
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
			sum += a[i];
		}
		System.out.printf("%d\n", sum);
		*/
		
		
		/* 문제) 문자 10개를 저장할수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를
		 * 이어서 출력하는 프로그램
		 * scn.next().charAt(0);
		 * 입력예) A B C D E F G H I
		 * 출력예)ABCDEFGHIJ
		 * 
		 */
		/*
		char i;
		char[] a = new char[10];
		
		
		for(i = 0; i<a.length; i++)
		{
			a[i] = scn.next().charAt(0);
			
		}
		for(i = 0; i< a.length; i++)
		{
			
			System.out.printf("%c",a[i]);
		}
		*/
		//답========================
		/*
		char[] a = new char[10];
		int i;
		
		for(i = 0; i< a.length; i++)// 하드코딩하지않고 a.length가 바뀔수있음
		{
			a[i] = scn.next().charAt(0);
			System.out.printf("%c",a[i]);
		}
	*/
		/*
		char[] a = new char[10];
		int i;
		
		for(i = 0; i< a.length; i++)// 하드코딩하지않고 a.length가 바뀔수있음
		{
			a[i] = scn.next().charAt(0);
			System.out.printf("%c",a[i]);
		}
		*/
		
		/* 문제) 정수 10개를 입력 받은 후 세번째, 다섯번째, 마지막으로 입력 받은 정수를
		 * 차례로 출력하는 프로그램
		 * 입력예) 5 3 9 6 8 4 2 8 10 1
		 * 출력예) 9 8 1
		 * for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
			sum += a[i];
		}
		System.out.printf("%d\n", sum);
		 */
		/*
		int i;
		int a[] = new int[10];  // a[0]~a[9]
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
		}
		System.out.printf("%d %d %d",a[2],a[4],a[a.length-1]); // a[]안에는 산술식이 들어와도됨
	*/
		//답============
		/*
		int [] a = new int[5];
		int i;
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
		}
		System.out.printf("%d %d %d \n",a[2],a[4],a[a.length-1]);
		
		*/
		
		
		/*문제 ) 최대 100개까지의 정수를 차례로 입력 받다가 숫자 0이 입력되면 /입력중단
		 * 입력을 중단하고 짝수번째에 입력된 정수를 모두 출력하는 프로그램작성
		 * 단, for문은 입력용 1개 ,출력용 1개사용
		 * 입력예) 11 25 3  15 6 8 7 12 0
		 * 출력예)25 9 6 7 
		 * 
		 */
		
		/*
		 
		int i;
		int cnt = 0;
		int[] a = new int[100];
		
		for(i = 0; i<=a.length; i++) // 11 25 3 9 15 6 8 7 12 0
		{
			a[i] = scn.nextInt(); 
			
			if(a[i]==0) 
			{
				break;
			}	
			cnt++;  // 1 2 3 4 5 6 7 8 9 10 
			
		}
		
		for(i=1; i<cnt; i+=2) //입력받은거까지만 i=1 -> i <
		{

			System.out.printf("%d ",a[i]);
		}
		*/
		/*
		int i, cnt = 0;
		int[] a = new int[100];
		
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
			
		if(a[i]==0)
		{
			break;
		}
			cnt++;
		}
			
		for(i=1; i<cnt; i+=2)
		{
			System.out.printf("%d ",a[i]);
		}
		*/
	// 답 ==============
		// 입)11 25 3 9 0
		// 출)25 9
		
		/*
		int i, cnt = 0; 
		int[] a = new int[100]; // int [] a;
								// a = new int[100];
								// 참조형 변수에는 주소만들어감
								
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt(); // 11 25 3 9 0 // a[0]=11 a[1]=25 a[2] = 3 a[3]=9 a[4]=0
			
			if(a[i]==0) break; // 
			cnt++;  // 1 2 3 4
		
		
		}
			/*
		for(i=1; i<cnt; i+=2) // i<=cnt하면 0까지 쓸쑤있음 그래서 i<cnt
								// 인덱스에선 홀수가 1,3임 [0][1][2][3]
								// 0이면 탈출
		{
			System.out.printf("%d ",a[i]);
		}
		*/
		
		
		/*cnt 변수를 이용하여 입력개수로 처리
		 * for(i=1; i<cnt; i+=2)
		 * {
		 * 		System.out.printf("%d",a[i]);
		 * }
		 */
		
		/*
		int j;
		//i변수를 입력개수로 처리
		for(j = 0; j < i; j++)
		{
			if(j % 2 == 1)
				System.out.printf("%d ", a[j]);
		}
		*/
	} 
 
}

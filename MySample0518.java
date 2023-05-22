import java.util.*;
public class MySample0518 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 배열
		/* 문제) 최대100개 이하의 정수를 입력받다가 0이 입력되면 종료하고
		 * 그때까지 입력된 수 중 5의 배수의 개수와 합계, 평균을 출력하는 프로그램 // sum cnt avg
		 * 입력예)35 10 23 100 64 51 5 0
		 * 출력예)5의 배수 : 4개
		 * 		합계 : 150
		 *		평균 : 37.5
		 * 
		 * 
		 */
		/*
		 * 
		int[] a = new int[100];
		int i,sum = 0, cnt = 0;
		double avg = 0;
		for(i=0; i<a.length; i++) // i 가 i<100까지 반복 i증가
		{
			a[i] = scn.nextInt();
			if(a[i]==0)break; // 입력값에 0이 입력되면 탈출
			
			if(a[i] % 5 ==0) //입력값에 5의배수가 입력될때
			{
				sum += a[i]; // sum += 입력값
				cnt++; 	//개수 1씩증가
			}
		}
		
		avg = (double)sum / cnt;
		System.out.printf("5의 배수 : %d개 \n",cnt);
		System.out.printf("합계 : %d \n",sum);
		System.out.printf("평균 : %.1f",avg);
		*/
		
		
		/* 문제) 100개 이하의 정수를 입력 받다가 0이 입력되면 0 을 제외하고 그때 까지 입력받은 
		 * 개수를 출력한 후 입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을 짝수이면 2로 나눈 몫을 출력하는 프로그램
		 * 입력예)8 10 5 15 100 0
		 * 출력얘)5개
		 * 		4 5 10 30 50 
		 * 
		 */
		/*
		int[] a = new int[100];
		int i, n;
		int cnt = 0;
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
			if(a[i]==0)break;
			cnt++;
		}
		System.out.printf("개수는 : %d개\n",cnt);
		
		for(i=0; i<cnt; i++)
		{
			if(a[i]%2 == 1)
			{
				n = a[i] * 2;
				
			}
			else
			{
				n = a[i] / 2;
				
			}
			System.out.printf("%d ",n);
		}
	*/
		//==============답
		/*
		int[] a = new int[100];
		int i, cnt = 0, val;
		
		for(i=0; i<a.length; i++)
		{
			a[i] = scn.nextInt();
			
			if(a[i]==0)break;
			
			cnt++;
		}
		System.out.printf("%d 개 \n", cnt);
		for(i = 0; i<cnt; i++)
		{
			if(a[i] %2 ==0)
				val = a[i] / 2;
			else 
				val =a[i] * 2;
			System.out.printf("%d ", val);
		}
		
		*/
		
		/* 문제) 정수 10개를 입력 받아 최대 값을 출력하는 프로그램 작성.
		 * 단, 변수는 배열변수 score와 출력용max, for문용 i만을 선언함.
		 * 정수는 0~100사이에 값만 입력받으며 나머지 값 입력시 
		 * 오류 메세지"숫자의 범위가초과되었습니다"
		 * 			"0~100가지의 숫자를 다시 입력하세요.>"
		 * 입력예)110
		 * 		"숫자의 범위가초과되었습니다"
		 * 		"0~100가지의 숫자를 다시 입력하세요.>"
		 * 입력예)95 67 88 65 76 89 58 93 77 99
		 * 출력예) 가장 큰 값은 99입니다.
		 *	
		 *	
		 */
		/*
		//해본것
		int[] score = new int[10];
		int i, max =0;
		
		for(i=0; i<score.length; i++)
		{
			score[i] = scn.nextInt();
			if(score[i]<0||score[i]>100)
			{
				
				System.out.println("숫자의 범위가 초과 되었습니다.");
				System.out.println("0~100가지의 숫자를 다시 입력하세요.>");
				
			}
			
		}
		
			
		
		for(i=0; i<score.length; i++)
		{	
			if(score[i] > max)
					{
						
						max = score[i];
					}	
		}
		System.out.printf("가장 큰값은 %d입니다.", max);
		*/
		
		// 답==============
		/*
		int[] score = new int[10];
		int i, max;
		for(i=0; i<score.length; i++)
		{
			score[i] = scn.nextInt();
			while(score[i]<0||score[i]>100) //if쓰면 오류값 계속입력하면 오류
			{
				
				System.out.println("숫자의 범위가 초과 되었습니다.");
				System.out.println("0~100가지의 숫자를 다시 입력하세요.>");
				score[i] = scn.nextInt();
				//i--;  //또는 for문에 증감안쓰고 공백	or //score[i] = scn.nextInt();  continue;						
			}
			
		}
		max = score[0];
		for(i = 1; i<score.length; i++)//0을 안넣어도됨 위에 0을넣엇으니까
		{
			if(max < score[i])
			max = score[i];
		}
		System.out.printf("가장 큰값은 %d 입니다.\n",max);
		*/
		
		
		/*문제)20이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로
		 * 출력하는 프로그램
		 * 입력예)5
		 *     35 10 35 100 64
		 * 출력예)100
		 * 		64
		 * 		35	
		 * 		35	
		 * 		10
		 *  내림차순
		 */
		
		
		
		/*
		int n;
		n = scn.nextInt();
		int i,j;
		int max;
		int[] a = new int [n];
		for(i=0; i<a.length; i++) // n입력값까지 반복 ex 5
		{
			a[i] = scn.nextInt();
		}
		
		for(i=0; i<a.length-1; i++) // 반복 0부터 4  0 1 2 3
		{
			for(j= i+1; j<a.length; j++) // j = 1 2 3 4 j<5 
			{
				if(a[i]<a[j]) // a[i] < a[j] 35 <10   < 35 <100 < 64
				{
					max = a[i];
					a[i] = a[j];
					a[j] = max;
				}
				
			}
			
		}
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d \n",a[i]);
		}
		*/
		//답============
		/*
		int n;
		n = scn.nextInt();
		int i,j,max; // 기준이 필요하니까 ij 교환해야하기떄문에 max
		int[]a = new int[n];
		
		for(i=0; i<a.length; i++) // 5 
		{
			a[i] = scn.nextInt();
		}
		for(i=0; i<a.length-1; i++)//4
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					max = a[i];
					a[i] = a[j];
					a[j] = max;
				}
			}
		}
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d \n",a[i]);
		}
		
		*/
		
		/*배열복사 
		 * 배열의 단점 선언한후 값이 고정됨
		 * 
		 * 정수 크기가 5개인 배열을 선언하고 각 10,20,30,40,50을 저장한 후
		 * 2배 크기의 배열을 선언하여 새로 선언한 배열에 복사한후 출력하는 프로그램
		 * 출력예([변경전]
		 * 		arr.length : 5
		 * 		arr[0] : 10
		 * 		arr[1] : 10
		 * 		arr[2] : 10 
		 * 		arr[3] : 10 
		 * 		arr[4] : 10 
		 *      [변경후]
		 *      arr.length : 10
		 *      arr[0] : 10
		 * 		arr[1] : 20
		 * 		arr[2] : 30 
		 * 		arr[3] : 40 
		 * 		arr[4] : 50
		 *  	arr[5] : 0
		 * 		arr[6] : 0
		 * 		arr[7] : 0 
		 * 		arr[8] : 0 
		 * 		arr[9] : 0 
		 */
		/*
		int[] arr = new int[5];
		int i, num = 10;
		for(i=0; i<arr.length; i++)
			arr[i] = num*(i+1); 
		System.out.println("[변경전]");
		System.out.printf("arr.length : %d \n",arr.length);
		for(i=0; i<arr.length; i++)
		{
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2]; // 배열 사이즈에 산술식이 들어갈수있음
		
		System.out.println("배열 복사전 주소....");
		System.out.println("arr : "+arr);
		System.out.println("tmp : "+ tmp);
		
		//배열 값 복사
		for(i=0; i< arr.length; i++)
		{
			tmp[i] = arr[i];
		}
		arr = tmp; // 중요
		
		System.out.println("배열 복사 후 주소");
		System.out.println("arr : "+arr);
		System.out.println("tmp : "+ tmp);
		
		System.out.println("[변경후]");
		System.out.println("arr.length : " + arr.length);
		
		for(i = 0; i<arr.length; i++)
		{
			System.out.printf("arr[%d] : %d  \n",i,arr[i]);
		}
		System.out.println("tmp[0]: "+ tmp[0] + ", arr[0] : " +arr[0]); // 디버깅용
		System.out.println("tmp[1]: "+ tmp[1] + ", arr[1] : " +arr[1]);
		
		tmp[1] = 99;
		
		System.out.println("값 변경후...");
	
		System.out.println("tmp[1]: "+ tmp[1] + ", arr[1] : " +arr[1]);
		*/
		
		/*문제) 정수 5개를 입력받을 배열을 선언한 후 정수 5개를 입력받아 배열에 
		 * 저장한 후 배열복사를 통해 크기가 2배인 배열에 복사하고/ 원래
		 * 배열크기 뒤부터 다시 입력 5개를 받아 출력하는 프로그램 작성
		 * 단, 추가 입력까지 모두 한 후 배열 복사 진행(arr = tmp;)
		 * 입력예)10 20 30 40 50
		 * 출력예)arr.length : 5
		 * 		10 20 30 40 50
		 * 입력예)1 2 3 4 5 
		 * 배열복사후 (출력X)
		 * 최종 출력예 10 20 30 40 50 1 2 3 4 5 // tmp
		 *	
		 */
		
		/*
		int[]arr = new int [5];
		int i;
		for(i=0; i<arr.length; i++)
		{
			arr[i] = scn.nextInt();
		}
		System.out.println("arr.length :" + arr.length);
		for(i=0; i<arr.length; i++)
		{
			System.out.printf("%d ", arr[i]);
		}
		
		int[] tmp = new int[arr.length *2];
		
		for(i=0; i< arr.length; i++)
		{
			System.out.println();
			tmp[i] = scn.nextInt();
			tmp[i] = arr[i];
		}
		arr = tmp; // 중요
		for(i = 0; i<arr.length; i++)
			
		{
			
			System.out.printf("%d ",tmp);
		}
		*/
		
		//답====================
		/*
		int[] arr = new int[5];
		int i;
		
		for(i=0; i<arr.length; i++) //5번돔
		{
			arr[i] = scn.nextInt(); //5층건물 0 1 2 3 4 값넣음
		}
		System.out.printf("arr.length : %d \n ",arr.length);
		for(i=0; i<arr.length; i++) 
		{
			System.out.printf("%d ", arr[i]);
		}
		int[] tmp = new int[arr.length * 2]; // arr 5층 tmp 10층 
											 // arr은  tmp에 담을 수 있음
		for(i=0; i<arr.length; i++)//  0 부터 10
		{
			tmp[i] = arr[i]; // int[] tmp = new int[10]; //
					         //arr[i]값을 tmp에 대입
		}
		//입력받기
		for(i = arr.length; i < tmp.length; i++) //arr건물값에서 tmp건물값 5~10
		{
			tmp[i] = scn.nextInt(); // tmp i값 5~10 층에 입력
		}
		arr = tmp; // 중요 //tmp는 10층이였는데 arr도 10층으로바뀜 (대입됨) 
		System.out.println("arr.length " + arr.length);
		for(i=0; i<arr.length; i++) //10번까지 반복
		{
			System.out.printf("%d ", arr[i]); //10개 출력
		}
		
		*/
		/*
		//랜덤 Math.ramdom()
		/*
		 * 실행결과) 0123456789
		 *		  5827164930(랜덤)
		 *		
		 *
		 */
		/*
		int[]arr = new int[10];
		int i, n, tmp;
		
		for(i=0; i<arr.length; i++)
		{
			arr[i]= i;
			System.out.print(arr[i]); // 0123456789
			
		}
		System.out.println();
		
		for(i=0; i < 10; i++)
		{
			n = (int)(Math.random() * 10); //0~9사이// 강제 형 변환 Math.random은 double임 //자바 제공
			
			
			System.out.printf("%d ", n);
			tmp = arr[0]; // i 대신 0 j대신 n
			arr[0] =arr[n];
			arr[n] = tmp;
		}
		System.out.println();
		for(i=0; i<arr.length; i++)
		{
			arr[i] = i;
			
		}
		*/
		
		
		
		
		
		/* 문제) 로또 번호 발생기 
		 * 	배열에 1부터 45까지 값을 저장한 후에 
		 * 단, Math.random()* 45  // 0~44 중 한 값 생성
		 * 0번째와  random 배열의 값을 바꾸는데 횟수를 100번실행 , 
		 * 최종 로또 번호는 앞에서부터 6개 출력
		 * 로또번호는 배열에 0~5번째 값으로 사용.
		 * 
		 * 
		 */
		/*
		int i, n, tmp, max = 0;
		int[] arr = new int [45];
		for(i=0; i<arr.length; i++)
		{
			arr[i]= i+1; // 0
		}
		System.out.println();
		
		
		for(i=0; i < 100; i++)
		{
			n = (int)(Math.random() * 45);  //0~44
			
			tmp = arr[0];
			arr[0] = arr[n];
			arr[n] = tmp;
			
			
		}	
	
		
		for(i=0;i<6; i++)
		{
			
			System.out.printf("%d ",arr[i]);
		}
		
		*/
		
		//답===========
		
		int[] b = new int[45]; //0 ~ 44
		int i, tmp, n;
		for(i=0; i<b.length; i++)
		{
			b[i] = i +1;// 1부터 채워야해서
		}
		for(i=0; i<100; i++)
		{
			n = (int)(Math.random()*45);
			
			tmp = b[0]; // 이걸 100번
			b[0] = b[n];
			b[n] = tmp; 
			
		}
		
		for(i = 0; i<6; i++)
		{
			System.out.printf("%d ",b[i]);
		}

		
		
		
	}
}


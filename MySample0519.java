import java.util.*;
public class MySample0519 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// String클래스
		
		/*
		String str = "java programing";
		char c = str.charAt(0); // j
		char[] ch = {'j','a','v','a'};
		System.out.println("str.charAt(0) : " + c);
		System.out.println("str.charAt(5) : " + str.charAt(5));
		
		System.out.println("str.length() : " + str.length());
		System.out.println("str.substring(): " + str.substring(3)); //3부터 뒤 
		System.out.println("str.substring() : " + str.substring(1, 8)); //1부터 8전까지
		
		System.out.println("str.equals(1) : " + str.equals("java programing")); // obj에 모든것(데이터타입)이 올 수 있음 
		System.out.println("str.equals(2) : " + str.equals("java"));
		
		
		int num = 10;
		String str1 = String.valueOf(num);
	
		System.out.println(str1+ ", length : "  + str1.length()); //length 2인이유 1하나 0하나이기때문에
		*/
		
		
		/*String배열
		 * 
		 */
		/*
		String[] names = {"kim","park","lee"};
		String name = "kimparklee";
		int i;
		for(i=0; i<names.length; i++)
		{
			System.out.println("names[" + i + "] :" + names[i]);
		}

		String tmp = names[2];
		System.out.println("tmp : "+tmp);
		names[0] = "yu";
		
		for(i=0; i<names.length; i++)
		{
			System.out.println("names[" + i + "] :" + names[i]);
		}
		
		*/
		
		/* char 배열과 String 클래스 변환
		 * 
		 */
		
		/*
		String str = "ABCDE";
		int i;
		char ch;
		
		for(i=0; i<str.length(); i++)
		{
			ch= str.charAt(i);
			System.out.println("str.charAt("+i+") : " + ch);
		}
		//String을 char[]로 변환
		char[] chArr = str.toCharArray();
		System.out.println(chArr);
		System.out.println(chArr + ",length : " + chArr.length);
	
		*/
		
		
		
		/* 2차원 배열
		 * 실행결과)score[0][0] = 100;
		 * 		 score[0][1] = 100;
		 * 		 score[0][2] = 100; 
		 * 		 score[1][0] = 20;
		 * 		 score[1][1] = 20;
		 * 		 score[1][2] = 20;
		 *  	 score[2][0] = 30;
		 *     	 score[2][1] = 30;
		 *     	 score[2][2] = 30;
		 *       score[3][0] = 40;
		 *       score[3][1] = 40;
		 *       score[3][2] = 40;
		 */
	
		/*
		int[][] score = new int[][] {{100,100,100},{20,20,20},{30,30,30},{40,40,40}}; //4행의 갯수 3열
		int i,j; //2차원은 가로세로 for문안에 for문
		int sum = 0;
		for(i=0; i< score.length; i++) // score.length까지만 하면 4개나옴
		{
			for(j=0; j<score[i].length; j++) // 행에서 열이 몇개인지 세는것
			{
				System.out.printf("score[%d][%d] = %d\n", i,j,score[i][j]);
				sum += score[i][j]; // score[i][j]에 입력된 모든값 더하기
			}
		}
		System.out.println("sum = " + sum);
		*/
		
		
		
		
		
		/* 문제)String 배열을 이용한 단어 맞추기.
		 * 		배열에 chair, 의자
		 * 			 computer, 컴퓨터
		 * 			 integer, 정수
		 * 입출력예) chair의 뜻은?  책상
		 * 	      틀렸습니다. 정답은 의자입니다.
		 * 
		 * 			computer의 뜻은? 컴퓨터
		 * 			정답입니다.
		 * 
		 * 			integer의 뜻은? 정수
		 * 			정답입니다.
		 * 단,문자열 비교는 equals 메서드 사용.
		 * 
		 * 입력받을때 string nextline
		 * 
		 */
		
		/*
		 
		String[][] words = {{"chair","의자"}, // [0][0],[0][1]
						   {"computer","컴퓨터"},// [1][0],[1][1] 
						   {"integer","정수"}}; // [2][0],[2][1]
		int i;
		String str;
		for(i=0; i<words.length; i++) //3번돔 0 1 2 
		{
			System.out.print(words[i][0] + "의 뜻은?");
			str = scn.nextLine();
			
			if(str.equals(words[i][1]))// String은 equals로 비교
			{
				System.out.print("정답입니다.\n");
			}
			else
			{
				System.out.print("틀렸습니다. 정답은 "+(words[i][1])+"입니다\n");
			}
		}
		*/
		//===답
		/*
		String[][] words = {{"chair","의자"}, // [0][0],[0][1]
				   {"computer","컴퓨터"},// [1][0],[1][1] 
				   {"integer","정수"}}; // [2][0],[2][1]
		/*
		 
		int i;
		String str;
		for(i=0; i<words.length; i++) //3번돔 0 1 2 
		{
			System.out.printf("%s의뜻은?", words[i][0]);
			
			str = scn.nextLine();
			
			if(str.equals(words[i][1]))
			{
				System.out.println("정답입니다\n");
			}
			else
			{
				System.out.printf("틀렸습니다. 정답은 %s입니다 \n\n",words[i][1]);
			}
		}
		*/
		
		/* 문제) 5명의 학생의 3과목 점수를 더해서 각 학생의 총점과 평균을 계산하고
		 * 과목별 총점을 계산하는 프로그램 작성.
		 * 단, 점수는 score 2차원 배열에 저장하고 출력시 번호는 %3d, 각 점수는 %5d,
		 * 평균은 %5.1f
		 * 실행결과) 번호 국어 영어 수학 총점 평균
		 * ===================================
		 * 		   1  100 100 100 300 100.0
		 * 		   2  20  20  20  60  20.0
		 * 		   3  30  30  30  90  30.0
		 * 		   4  40  40  40  120 40.0
		 * 		   5  50  50  50  150 50.0
		 * ===================================
		 *  총점 :     240 240 240
		 */
		
		/*
		int[][] score ={{100,100,100},{20,20,20},{30,30,30},{40,40,40},{50,50,50}};
		int i,j, sum = 0; 
		int totalKor = 0, totalEng = 0, totalMath = 0;
		double avg;
		System.out.print("번호    국어    영어  수학 총점   평균\n");
		System.out.print("====================================\n");
		for(i=0; i<score.length; i++)  //0부터 5 0 1 2 3 4  행
		{
			System.out.printf("%3d ",i+1); // 1 2 3 4 5
			
			
			}for(j=0; j<score[i].length; j++) // 0 부터 3 0 1 2 열 
			{
				System.out.printf("%5d ",score[i][j]); // score을 출력 0  1 2
				sum += score[i][j];
			totalKor += score[i][0];
			totalEng += score[i][1];
			totalMath += score[i][2];
			
			System.out.printf("%d ",sum);
			avg = (double)sum / score[i].length;
			System.out.printf("%5.1f \n", avg);
			
			sum=0;
		}
		System.out.println("=====================================");
		System.out.printf("총점 : %3d %3d %3d \n",totalKor,totalEng,totalMath);
		*/
		//답==========================

		int[][] score ={{100,100,100},{20,20,20},{30,30,30},{40,40,40},{50,50,50}};
		int i,j, sum = 0; 
		int totalKor = 0, totalEng = 0, totalMath = 0;
		double avg;
		System.out.print("번호    국어    영어  수학   총점   평균\n");
		System.out.println("=====================================");
		
		for(i=0; i< score.length; i++) //가로 //0 1 2 3 4
		{
			sum = 0;
			System.out.printf("%3d",i+1); // 1 2 3 4 5
			
			totalKor += score[i][0];
			totalEng += score[i][1];
			totalMath += score[i][2];
			for(j=0; j<score[i].length; j++) //세로 //0 1 2 3 4
			{
				System.out.printf(" %5d",score[i][j]);
				sum += score[i][j]; // sum = sum + score[i][j]
			}
	
			avg = (double)sum / score[i].length;
			
			System.out.printf(" %5d %5.1f",sum,avg);
			
			System.out.println();
		}
		
		
		
		System.out.println("=====================================");
		System.out.printf("총점:%5d %5d %5d\n",totalKor,totalEng,totalMath); 
		
	}
}



class Tv //public을 붙이면 안됨
{
	//인스턴스변수
	String color;   // tv 색상
	boolean power; // 전원상태(on/off)
	int channel;  // 채널 
	
	//메서드
	void power()
	{
		power = !power;  
	}
	
	void channelUp()
	{
		channel++;
	}
	
	void channelDown()
	{
		channel--;
	}
}




public class MySample0522 {

	public static void main(String[] args) {
		// 클래스 
		/*
		Tv t = new Tv();
		t.channel = 11;
		t.channelDown();
		t.channelUp();
		System.out.println("현재 채널은 " + t.channel + "입니다");
		
		//현재 채널 11에서 7번으로 변경설정
		t.power();
		t.color = "검정";
		
		for(int i = t.channel; i > 7; i--)
		{
			t.channelDown();
		}
		
		System.out.printf("tv전원은 %b 이고, 색상은 %s, 채널은 %d 입니다",t.power,t.color,t.channel);		
		*/
		
		
		/* 실행결과)  t1의 channel값은 0입니다.
		 * 		   t2의 channel값은 0입니다.
		 * 		   t1의 channel 값을 7로 변경했습니다.
		 * 		   t1의 channel 값은 7입니다.
		 * 		   t2의 channel값은 7입니다. // 참조형 대입으로 처리
		 * 
		 */
		/*
		Tv t1, t2;
		t1 = new Tv();
		t2 = new Tv();
		// 입주 청소됨 0 0 // 참조형은 입주청소
		System.out.println("t1의 channel 값은" + t1.channel + "입니다");
		System.out.println("t2의 channel 값은" + t2.channel + "입니다");
		
		t1.channel =7; 
		System.out.println("t1의 channel 값은" + t1.channel + "로 변경했습니다");
		
		
		t2 = t1;
		System.out.println("t1의 channel 값은" + t1.channel + "입니다");
		System.out.println("t2의 channel 값은" + t2.channel + "입니다");
		*/
		/*
		 * 실행결과)t1의 channel값은 0입니다.
		 *		 t2의 channel값은 0입니다.
		 *		 t1의 channel값을 5로 변경했습니다. //변수에 값대입 적용
		 *		 t2의 channel값을 11로 변경했습니다. // 변수에 값대입적용
		 *		 t1의 channel값은 11입니다.
		 *		 t2의 channel값은 11입니다.
		 *		 
		 */       
		/*
		Tv t1, t2;
		t1 = new Tv();
		t2 = new Tv();
		System.out.printf("t1의 channel 값은 "+ t1.channel + "입니다 \n");
		System.out.printf("t2의 channel 값은 "+ t2.channel + "입니다 \n");
		t1.channel = 5;
		t2.channel = 11;
		System.out.printf("t1의 channel 값을 "+ t1.channel + "로 변경했습니다.\n");
		System.out.printf("t2의 channel 값을 "+ t2.channel + "로 변경했습니다.\n");
		
		t1 = t2;
		System.out.printf("t1의 channel 값은 "+ t1.channel + "입니다 \n");
		System.out.printf("t2의 channel 값은 "+ t2.channel + "입니다 \n");
		*/
		
		/* 객체배열
		 * 
		 * 
		 */
		
		Tv[] t1 = new Tv[3]; // 0 1 2
		int i;
		
		for(i = 0; i < t1.length; i++) // 0 1 2 
		{
			t1[i] = new Tv(); // 객체생성
			t1[i].channel = i + 10;
			
			System.out.printf("전 t1[%d].channel = %d \n",i,t1[i].channel);
			
		}
		System.out.println();
		
		for(i = 0; i<t1.length; i++)
		{
			t1[i].channelUp();
			System.out.printf("후 t1[%d].channel = %d \n",i,t1[i].channel);
		}
		
		//객체배열 복사 응용 
		// jvm이 관리하는 주소를 보여줌
		System.out.println("t1 : " + t1);
		System.out.println("t1[0] : " + t1[0]);
		System.out.println("t1[1] : " + t1[1]);
		System.out.println("t1[2] : " + t1[2]);
		
		Tv a = new Tv(); // 객체생성 a라는클래스
		
		System.out.println("a :" + a);
		
		a = t1[1]; // 객체 배열복사
		
		System.out.println("후a :" + a);
		System.out.println("a.channel : " + a.channel + ", t1[1].channel " + t1[1].channel);
		
		a.channel = 20;
		
		System.out.println("후a.channel : " + a.channel + ", t1[1].channel " + t1[1].channel);
		
	}
	
}

import java.util.*;
public class MySample0519_2 {
	//클래스
	int iv; 	   // 인스턴스 변수 // 방이생김 //독립적인 저장공간
	static int cv; // 클래스변수 //공통 클래스 변수는 모든 인스턴스가 공통된 저장 공간(변수)을 공유하게 됩니다
	
	
	int methodA(int a1) //메소드 //누군가가 호출해야함
	{ 
		int lv = 5; // 지역변수 // 방이생김
		//a1 = a1 + lv;
		System.out.println("methodA() lv : " + lv);
		//System.out.println("methodA() a1 : " + a1);
		return lv;
		}
	
	public static void main(String[] args) { //문자열로 1개이상 올 수 있음
		MySample0519_2 a= new MySample0519_2();
		MySample0519_2 b= new MySample0519_2();
		MySample0519_2 c= new MySample0519_2();
		//int a1 = 10;
		//int lv = a.methodA();//a.methodA(a1); //각자 다른 메소드 
		//System.out.println("main a1 : " + a1);
		
		
		//b.methodA(); //각자 다른 메소드
		//c.methodA(); //각자 다른 메소드
		a.iv = 10; // 다른집
		b.iv = 20; // 다른집
		c.iv = 30; // 다른집
		
		System.out.println("a.iv : "+ a.iv + " b.iv : " + b.iv + " c.iv : " + c.iv);

		a.cv = 11; //같은집 클래스 변수 //클래스명이 들어가야함
		b.cv = 22; //같은집
		c.cv = 33; //입력됨 
		
		System.out.println("1 a.cv : "+ a.cv + " b.cv : " + b.cv + " c.cv : " + c.cv);

		System.out.println("1 MySample0519_2.cv :"+ MySample0519_2.cv);
		
		
		MySample0519_2.cv =55;//입력
		
		System.out.println("2 a.cv : "+ cv + " b.cv : " + cv + " c.cv : " + cv);
		
		System.out.println("2 MySample0519_2.cv :"+ MySample0519_2.cv);
		
	}

}

package chapter02.ex06;

public class Typecasting2 {

	public static void main(String[] args) {
		// 자동 타입 변환(업케스팅) vs 수동타입 변환(다운캐스팅)
		//1. 자동타입변환(업캐스팅: 낮은 자료형에서 높은자료형으로 자동으로 변환)
			//byte => short => int > long => float => double
		
		float value1= 3; //int =>float 으로 업케스팅되어 들어감
		long value2 = 5; //int =>long 으로 자동으로 업캐스팅
		double value3 =7; //int => double으로 자동으로 업캐스팅
		
		
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("=================");
		
		//2. 수동으로 타입변환 ( 다운 캐스팅: 높은자료형에서 낮은 자료형으로 변환 )
		int value4 =(int) 3.5;   //double => int 다운캐스팅
		float value5 = 7.8f;      //double => float
		
		
		System.out.println(value4);
		System.out.println(value5);
		
		
		
	}

}

package chapter02.ex3;

public class Rage_of_variable_Use {

	public static void main(String[] args) {
		// 변수의 사용 범위 (변수의 생존기간) : 선언 위치에 따라 생존 범위가 달라진다.
		
		int value1 = 3; //전역 변수
		
		{	// if, for, switch, do while,
			int value2 = 5; //지역변수
			System.out.println(value1);
			System.out.println(value2);
		}
		System.out.println(value1);
		// System.out.println(value2); 변수값을 적용한 괄호 밖에있기때문에 적용 안됨
		
		
	}

}

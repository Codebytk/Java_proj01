package chapter02.ex04;

public class PrimaryDateType1 {

	public static void main(String[] args) {
		//자료형 : 변수 명 앞에 반드시 선언, 변수의 어떤 값을 넣을지 지정(java, c, c++)
		// - 기본 자료형 : boolean, byte, short, int, long, ploat, double, char(소문자 시작)
			//메모리의 Stack 공간에 저장, (변수명: 값)
		// - 참조 자료형 : String , 배열, 객체 ... 무한대로 생성가능(대문자 시작)
			//메모리의 heap 공간에 변수의 값이 저장됨 ,
			//		stack 공간에는 변수명:heap에 값의 주소를 가지고 있다
		//리터럴 : 변수에 할당되는 값을 통칭해서 리터럴
		
		// 1. boolean : true, false
		boolean bool1 = true;     //선언과 동시에 변수값을 할당한다
		boolean bool2;           //선언후
		bool2 = false ;         //값 할당
		System.out.println(bool1);   //true
		System.out.println(bool2);   //false
		
		System.out.println("====================");
		
		// 2. 정수 (byte : 1byte , short : 2byte , int : 4byte, long : 8byte)
			 // 정수의 기본은 int
			//byte :(1byte=8bit) -2^7 ~ 2^7-1  :-128~ 127
		// byte value1 = -129; (범위를 넘어갔기 때문에 오류)
		byte value1 = -128;
		byte value2 = 127; 
		
		System.out.println(value1);
		System.out.println(value2);
			//short : (2byte = 16bit) : -2^15 ~ 2^15-1 = -32768 ~ 32767
		
		short value3 = -32768;
		short value4 = 32767;
		System.out.println(value3);
		System.out.println(value4);
		
			//int : (4byte = 32bit) -2^23 ~ 2^23-1 = -2147483648 ~ 2147483647
		
		int value5 = -2147483648;
		int value6 = 2147483647;
		System.out.println(value5);
		System.out.println(value6);
		
			//long : 8byte = 62bit: -2^63 ~ 2^63 -1 
				// long 의 변수에 값을 할당 할 때는 l, L 을 붙여줘야 한다.
				// 	붙여주지 않으면 기본적으로 int 형으로 값이 저장됨
		
		long value7 = -100L;
		System.out.println(value7);
		
		//3. 실수 (소숫점 자리) (float : 정밀도가 7자리(4byte), double : 정밀도가 15자리(8byte))
			//실수의 기본은 double
		
			//float : float 으로 지정된 변수의 값을 할당할때 리터럴에 f,F 명시를 해야된다
		float value8 = 1.123456789F ;
		System.out.println(value8); // 1.1234568
		
		double value9 = 1.12345678910111213;
		System.out.println(value9);
		
		
		//4. 문자 (char) : 영글/ 한글/ 일본어 / ...숫자, 특수문자, 한글자
		//		변수의 값을 할당할 리터럴에 ' '
			// 1. char 자료형 변수에 직접 문자로 저장하는 방법(
		char value10 ='A';
		char value11 = 'a';
		char value12 = '가';
		char value13 = '5';
		char value14 = '#';
		
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		System.out.println(value14);
			
			//2. 정수값으로 문자를 저장하는 방법 :아스키 코드 값으로 문자를 저장
		
		char value15 = 65;  // A
		char value16 = 0xac00; //0x :16진수 0 : 8진수 0b :2진수 
				//가
		char value17 = 51;	//3
		
		System.out.println(value15);
		System.out.println(value16);
		System.out.println(value17);
		
		System.out.println("=====================");
			//3. 유니코드로 저장하는 방법: 전세계의 글자를 3byte로 저장
		char value18 = '\u0041'; // a
		char value19 = '\uac00'; //가
		char value20 = '\u0033'; //3
		
		System.out.println(value18);
		System.out.println(value19);
		System.out.println(value20);
		
		/*
		 * <문제> 구글을 검색하서 자신의 이름의 유니코드를 찾아서 변수에 할당하고
		 */
		
		char aa;  //성 이
		char bb;  //이름1 태
		char cc;  //이름2 경
		//이태경
		
		aa = '\uc774';
		bb = '\ud0dc';
		cc = '\uacbd';
		
		System.out.print(aa);
		System.out.print(bb);
		System.out.println(cc);
		
		System.out.printf("%c%c%c\n",aa,bb,cc);
		
		
		//5. 문자열 (string) : 여러글자를 담을 수 있다.
			//기본자료형이 아니다. 참조 자료형(객체)
		//		변수의 값을 할당하는 리터럴에 " "
		
		String value21 = "안녕하세요. 오늘의 날씨는 매우 맑습니다.";
		
		System.out.println(value21);
		
		
		
		
	}

}
 
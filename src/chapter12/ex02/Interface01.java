package chapter12.ex02;

interface A { // 인터페이스 이름 : 첫자는 반드시 영문 대문자. // 정식표현
	// 모든 필드는 : public static final
	// static : 객체생성 없이 호출이 가능하다. A.a
	// final : 상수 (값을 수정할수가 없다)
	public static final int a = 3;

	// 모든 메소드는 public abstract
	public abstract void abc();

}

// 인터 페이스의 구현되지 않는 매소드를 구현한 클래스
class Aa implements A { // 인터페이스를 구현한 클래스

	@Override
	public void abc() {
		System.out.println("A 인터페이스를 구현한 메소드");
	}

}

//일반적인 표현, 축약표현 <==== 주로사용
interface B {
	// public static final 생략됨

	int a = 5;

	// public abstract : 모든 메소드는 선언부만 있고 구현부가 없어야 한다. (예외, default, static)
	void abc();
}

class Bb implements B {
	@Override
	public void abc() {
		System.out.println("B 인터페이스를 구현한 메소드");
	}
}

//추상클래스 : 추상메소드를 포함한 클래스 , 추상클래스 내의 추상메소드는 abstract 키를 생략하면 안됨
abstract class C {
	int m = 4; // 일반 인스턴스 필드 : 수정이 가능 함

	void bcd() {
	} // 일반메소드 : 구현부가 있는 인스턴스 메소드
	// 추상클래스 내의 추상메소드는 abstract 키를 붙여야 한다.

	abstract void abc();

}

class Cc extends C {
	@Override
	void abc() {
		System.out.println("추상클래스 C 를 구현한 메소드");

	}
}

public class Interface01 {

	public static void main(String[] args) {
		/*
		 * 인터페이스( Interface) : 내부와 외부를 연결 시켜주는 접점, 콘센트 - 객체 생성이 불가함. 타입으로 지정은 가능 - 모든
		 * 필드는 public static final 이 생략되있다 : 값을 수정할수 없다 - 모든 메소드는 public abstract 가
		 * 생략되어있다. (예외 , default, static 메소드) : 모든 메소드는 선언부만 있어야 한다. 구현부가 있으면 안됨: {} :
		 * 예외, default , static 메소드는 인터페이스에서 유일하게 구현부를 가지는 메소드 - 하나의 클래스는 하나의 부모 클래스를
		 * 상속해야 한다, 자바는 다중 상속 불가 - 하나의 클래스는 여러개의 인터페이스를 다중 상속이 가능한다.
		 * 
		 * 
		 */
		// 1. 인테페이스는 객체화 할 수가 없다. 구현되지 않는 메소드가 있기 때문에
		// A a = new A();
		// B b = new B();

		A a1 = new Aa(); 	// A : 인터페이스 , Aa : 인터페이스를 구현한 클래스
		a1.abc();			// 오버라이딩 된 메소드를 호출
		B b1 = new Bb(); 
		b1.abc();			// 오버라이딩 된 메소드 호출
	

		System.out.println("=======================");
		// 3. 인터페이스의 필드는 public static final 생략됨
		// static : 객체없이 호출이 가능함 :A.a
		// final : 값을 수정 불가

		System.out.println(A.a); // 인터페이스 명 . 필드명
		System.out.println(B.a); // 인터페이스 명 . 필드명

		// 4. 필드의 값을 수정 할 수 없다.
	//	A.a = 10;	//final 이 있으므로 값 수정이 불가
	//	B.a = 20;	//final 이 있으므로 값 수정이 불가
		System.out.println("==========추상클래스 C=========");
		//1. 추상클래스 : 객체 생성 불가
	//	C c1 = new C(); 	// C : 추상클래스 
		//2. 추상클래스 : 구현한 클래스를 객체화 해서 타입지정을 가능
		C c2 = new Cc();
		System.out.println(c2.m);	//인스턴스 필드 : 객체 생성후 호출가능
	//	System.out.println(C.m);	//인스턴스 필드 : static 이 않써져 있기 때문에 클래스이름으로 선언불가
		
		c2.m = 44;
		System.out.println(c2.m);	//44 : 값 수정이 가능함
		
		c2.bcd();		//C클래스에 있는 일반메소드 (인스턴스 메소드)
		c2.abc();		//오버라이딩 된 메소드 출력
		
		
		
	}

}

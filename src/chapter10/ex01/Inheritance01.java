package chapter10.ex01;

class Human{	//부모 클래스 (super class) : 자식 클래스의 공통된 특징을 저장(필드,메소드)
	
	//필드 (속성)
	String name;
	int age;
	void eat() {
		System.out.println("모든사람은 먹습니다.");
		
	}
	void sleep() {
		System.out.println("모든사람은 잠을 잡니다.");
	}
}

//자식클래스 : 부모 클래스의 모든 필드와 메소드를 물려 받는다.
class Student extends Human{
	// 부모 클래스 : Human
	// 자식 클래스 : Student	<=== 부모클래스의 필드와 메소드를 물려받는다.
	
	//1. 부모클래스의  모든 필드와 메소드를 그대로 자식클래스 내부에 들어와 있다.
	//2. 자식 클래스에서만 적용되는 필드와 메소드를 추가적으로 드록해서 사용.
	
	int stuID;
	void gotoSchool() {
		System.out.println("학생은 학교에 다닙니다.");
	}
}
class Worker extends Human{
	
	int workerID;
	void goToWork() {
		System.out.println("근로자는 일을 하러 일터로 갑니다.");
	}
}

class Professor extends Human{
	int professorID;
	void goToTeach() {
		System.out.println("교수님은 가르치러 갑니다.");
	}
}

class Student2 extends Student{
	// Student2--> student-->human
	// Human 의 모든 필드와 메소드 
	// Student 의 모든 필드와 메소드 상속
	
	int student2ID;
	void student2() {
		System.out.println("학생2 입니다.");
	}
}



public class Inheritance01 {

	public static void main(String[] args) {
		// 상속(Inheritance) : 부모 클래스의 필드(속성)와, 메소드를 자식 클래스 에서 물려받아서 사용함
			// 객체 지향언어의 꽃 (제일 중요함),
			// 코드의 중복된 코드를 줄여 줄 수 있음.
			// 다형성 : 부모 클래스를 상속받아서 다양한 형태로 출력
			// 배열이나 컬랙션에 부모 클래스 이름으로 (업케스팅) 저장해서 출력
		//1. 학생 객체 생성: 부모의 필드와 메소드 + 자식의 필드와 메소드 모두 사용가능
		Student s1= new Student();
		
		//부모의 필드와 메소드 출력
		System.out.println("===부모의 필드와 메소드 출력===");
		s1.name = "홍길동";
		s1.age = 30;
		System.out.println(s1.age);
		System.out.println(s1.name);
		
		s1.eat();
		s1.sleep();
		
		//자식의 필드와 메소드 출력
		System.out.println("===자식의 필드와 메소드 출력===");
		s1.stuID=2222;
		System.out.println(s1.stuID);
		
		s1.gotoSchool();
		
		System.out.println("======Human 클래스 객체 생성=======");
		
		Worker w1 = new Worker();
		//부모 클래스의 필드와 메소드
		w1.age=40;
		w1.name="이순신";
		System.out.println(w1.age);
		System.out.println(w1.name);
		
		w1.eat();
		w1.sleep();
		
		// 자신의 클래스의 필드와 메소드 출력
		w1.workerID=3333;
		System.out.println(w1.workerID);
		w1.goToWork();
		
		System.out.println("=====Student2---> Student-->Human======");
		
		Student2 s2=new Student2();
		
		//Human 의 필드와 메소드 출력
		s2.age=27;
		s2.name="심사임당";
		System.out.println(s2.age);
		System.out.println(s2.name);
		
		s2.eat();
		s2.sleep();
		System.out.println("====================================");
		s2.student2ID=1234;
		
		
		

	}

}

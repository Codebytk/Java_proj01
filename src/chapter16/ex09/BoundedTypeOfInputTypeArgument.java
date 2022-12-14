package chapter16.ex09;

//메소드에 인풋 으로 들어오는 타입을 제한
class A{}
class B extends A{}
class C extends B{}
class D extends C{}

//제너릭 클래스 
class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test{
	void method1 (Goods<A> g) {} 			//case 1 : A타입만 가능
	void method2 (Goods<?> g) {}			//case 2 : ? : 모든 클래스 올수있다.
	void method3 (Goods<? extends B> g) {}	//case 3 : ? : B를 포함해서 상속하고 있는 클래스 올수있다. B,C,D
	void method4 (Goods<? super B> g) {}	//case 4 : ? : B를 포함해서 B가 상속하는 클래스 까지 올수있다. B,A
	
	
	
}

public class BoundedTypeOfInputTypeArgument {

	public static void main(String[] args) {
		
		//메소드로 인풋괴는 제너릭 타입의 제한
		
		Test t =new Test ();
		
		//1. case1 : A 타입만 가능
		t.method1(new Goods<A>());	//Goods <A> 객체만 올수있다.
	//	t.method1(new Goods<B>());
	//	t.method1(new Goods<C>());
	//	t.method1(new Goods<D>());
		
		//2. case 2 : 모든 타입 가능
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//3. case 3: B 를 포함해서 B 를 상속하는 클래스 접근가능
	//	t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//4. case 4 : B를 포함해서 B가 상속하는 클래스 접근가능
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
	//	t.method4(new Goods<C>());
	//	t.method4(new Goods<D>());

	}

}

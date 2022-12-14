package chapter05.ex04;

public class PrimaryDateType_vs_ReferenceDateType {

	public static void main(String[] args) {
		// 기본 데이터 타입 참조 데이터 타입의 비교
		
		//1. 기본 데이터 타이에서 대입연산 (Stack값을 복사)
		int value1=3;
		int value2=value1;
		value2=7 ;
		System.out.println(value1);	//3
		System.out.println(value2);	//3===>7
		
		System.out.println("===================================");
		//2. 참조 데이터 타입에서 대입연산(Stack 값(Heap 영역의 주소)을 복사),
		int []arr1=new int[] {3,4,5};
		int []arr2= arr1;  //Heap 영역의 값을 복사하는 것이 아니라 arr1의 Stack의 주소를 복사
		arr2[0]=7;
		
		System.out.println(arr1[0]);	//7
		System.out.println(arr2[0]);	//7

		System.out.println("==============");
		
		//객체의 heap 영역의 주소 출력 : String 은 예외 사항 , <== 객체를 출력하면 객테의 값이 출력
		System.out.println(arr1); // Heap 영역의 16진수의 hash code <== Heap 메오리 주소값
		System.out.println(arr2);
		
		
	}

}

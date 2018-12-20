// 메인 메소드를 포함하고 있는 클라스
public class Constructor {
		int number;
	
	// 전역변수 number 를 ++ 시켜주는 메소드
	void numberUp() {
		++number;
	}
	
	// 컴파일러가 읽어들인 후 실행시키는 메인 메소드
	public static void main(String[] args){
		
		// Person 클라스를 객체화
		Person p1 = new Person();
		// Constructor 클라스를 객체화(배열변수)
		Constructor[] p2 = new Constructor[5];
		
		// 반복문을 통해 p2 객체참조 배열변수의 값을 뽑음
		for(int i=0; i<p2.length; i++) {
			//p2[i] 를 Constructor 클라스로 객체화 시켜 전역변수 number의 값을 쓸 수 있게 
			p2[i] = new Constructor();
			// p2[i] 객체를 통해 전역변수 number 값을 i+5 로 설정
			p2[i].number = i+5;
		}
		
		// 위 반복문에서 설정한 p2[i].number 의 값을 다시 반복문을 통해 뽑음
		for(int i=0; i<p2.length; i++) {
			// number 값을 ++ 시켜주는 함수 호출
			p2[i].numberUp();
			System.out.printf("p2[%d].number=%d%n",i,p2[i].number);
			//System.out.print(p2[i].number);
		}
		
		System.out.println(p1.personinfo());
		System.out.println(p1.personinfo2());
		System.out.println(p1.personinfo3(183));
		System.out.println(p1.personinfo3("73kg"));
	}
}
	// 클라스
	class Person {
		int age;
		int year;
		String name;
		
	// 생성자, 생성을 해주지 않아도 default로 생성자가 정의되긴 한다. 다만 위의 6번 줄에서 매개변수 자리에 인자 값이 없어야한다.
/*	public Person(int age,String name) {
		this.age = 23;
		this.name = name;
	}*/
	
		// 메소드
		public String personinfo() {
			this.age = 22;
			this.name = "하민";
			
			return "이름:" + name + ",나이:" + age;
			}
		
		public String personinfo2() {
			this.age = 23;
			this.name = "김하민";
			this.year = 2019;
			
			return "년도:" + year +",이름:" + name + ",나이:" + age;
		}
		
		public int personinfo3(int tall) {
			
			return tall; 
		}
		
		public String personinfo3(String weight) {
			
			return weight; 
		}
	}
	
	

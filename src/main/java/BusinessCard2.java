
public class BusinessCard2 {
	
	public static void main(String[]args) {
		
		// BusinessCard 클라스를 객체화.
		BusinessCard Bc = new BusinessCard();
		
		// BusinessCard 클라스에 있는 멤버변수 phone_no 에 "010-4444-6666" 라는 값을 넣는 것.
		// Bc.phone_no = "010-4444-6666";
		Bc.setPhone_no("010-5508-5235");
		// BusinessCard 클라스에 있는 setter 메소드에 매개변수로 "김하민" 이라는 값을 전달.
		Bc.setName("김하민");
		Bc.setEmail("k1mham1n@naver.com");
		Bc.setAddrees("서울특별시");
		
		// BusinessCard 클라스에 있는 멤버변수 phone_no 의 값을 출력.
		System.out.println(Bc.getPhone_no());
		System.out.println(Bc.getName());
		System.out.println(Bc.getEmail());
		System.out.println(Bc.getAddrees());
		
		BusinessCard Bc2 = new BusinessCard();
		
		Bc.setName("장우혁");
		Bc2.setName("김하민");
		
		System.out.println(Bc.getName()); // 원래는 장우혁이 출력되어야 한다.
		System.out.println(Bc2.getName()); // 원래는 김하민이 출력되어야 한다.

	}
	// BusinessCard 객체를 만들어서* phone_no 변수에 값을 넣고* 출력하는 것*.
	// 마찬가지로 BusinessCard 객체를 만들어서* name 변수에 값을 넣고* 출력하는 것*.
	
	// 출력을 하기 위해서는 System.out.println 이라는 코드가 필요하고# 멤버변수 name의 값이 필요하다#.
	
	// name 의 값을 가져오려면 멤버변수 name을 리턴해주는 getter 메소드를 호출해야한다*.
	
	
}



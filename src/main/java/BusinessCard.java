
public class BusinessCard {
	
	// private 은 외부에서 접근이 불가능하다.
	private String name;
	private String phone_no;
	
	// public 이라는 접근지정자를 가진 BusinessCard 생성자를 만들고 
	// 이 생성자가 객체화를 하면서 name * 매개변수(파라미터,인자,아규먼트 다 같은말)* 에 "김하민을 받아옴"
	/*public BusinessCard(String name) {
		// 왼쪽에 있는 name 은 멤버변수이고 오른쪽에 있는 name 은 매개변수이다.
		this.name = name;
		// BusinessCard2 클라스에서 전달해주는 매개변수 name값 "김하민" 을 멤버변수 name에 넣어주는 역할
	}*/
	
	// name	값을 생성자 없이 BusinessCard2 에 전달하는 메소드.
//	public String Merry(String name) {
//		return name;
//		// 매개변수로 받아온 name 값을 return 해준다.
//	}
	// 위 메소드는, BusinessCard2에서 Merry 라는 메소드를 호출할 때 매개변수로 "김하민" 을 전달받는다.
	
/*	public void Merry(String name) {
		name = this.name; 
		// 매개변수 name값에 멤버변수 name값을 넣어준다.
		
	}*/

	public void setName(String name) {
		this.name = name;
		// 멤버변수 name 에 BusinessCard2 클라스에서 받아온 매개변수 name 의 값을 넣어준다.
	}
	
	
	// going이라는 메소드를 만들어서 이 메소드에서 멤버변수 name 값을 갖고 와서
	// 리턴시켜주고 이 메소드를 BusinessCard2에서 호출
	public String getName() {
		return name;
	}
	// 이 메소드는, "김하민" 이라는 문자열을 가진 멤버변수 name 을 가지고 와서  
	// 이 메소드를 호출 하는 BusinessCard2 클라스에 다시 이 멤버변수 name 값을 리턴해준다.
	
	public void setPhoneNo(String phone_no) {
		this.phone_no = phone_no;
	}
	
	
	public String getPhoneNo() {
		return phone_no;
	}
	
}




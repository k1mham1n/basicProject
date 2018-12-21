import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BusinessCard {
	
	// private 은 외부에서 접근이 불가능하다.
	private String name;
	private String phone_no;
	private String email;
	private String addrees;
	
	// public 이라는 접근지정자를 가진 BusinessCard 생성자를 만들고 
	// 이 생성자가 객체화를 하면서 name 매개변수(파라미터,인자,아규먼트 다 같은말) 에 "김하민을 받아옴"
	/*public BusinessCard(String name) {
		// 왼쪽에 있는 name은 멤버변수이고 오른쪽에 있는 name은 매개변수이다.
		this.name = name;
		// BusinessCard2 클라스에서 전달해주는 매개변수 name값 "김하민" 을 멤버변수 name에 넣어주는 역할
	}*/
	
	/*public void setName(String name) {
		// 멤버변수 name 에 BusinessCard2 클라스에서 받아온 매개변수 name 의 값을 넣어준다.
		this.name = name;
	}
	
	// 이 메소드는, "김하민" 이라는 문자열을 가진 멤버변수 name 을 가지고 와서  
	// 이 메소드를 호출 하는 BusinessCard2 클라스에 다시 이 멤버변수 name 값을 리턴해준다.
	public String getName() {
		return name;
	}
	
	public void setPhoneNo(String phone_no) {
		this.phone_no = phone_no;
	}
	
	public String getPhoneNo() {
		return phone_no;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAddrees(String addrees) {
		this.addrees = addrees;
	}
	
	public String getAddrees() {
		return addrees;
	}*/
	
}




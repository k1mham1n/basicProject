// 붕어빵 틀 역할을 하는 클라스 
public class FishCake {	
	// 멤버 변수 = 붕어빵 종류와 붕어빵 판매와 재고 개수 역할을 하는 변수
	private String name;
	private int num1;
	private int num2;
	
	// 생성자
	public FishCake(String name, int num1, int num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// 멤버 메소드 = 굽기 역할을 하는 메소드 
	public void bake() {
		System.out.println(name + "붕어빵이 만들어졌습니다." + num1 + "개를 팔고" + " " + num2 + "개가 남았습니다.");
	}
}

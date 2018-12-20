
public class FishCakeMaker {	
	public static void main(String[]args) {
		// 붕어빵틀에 반죽과 팥을 넣고 굽는다 = 인스턴스화 하는 중
		FishCake a = new FishCake("슈크림",2,3);
		FishCake b = new FishCake("팥",1,1);
		FishCake c = new FishCake("피자",1,2);
		FishCake d = new FishCake("고구마",3,3);
		
		// 각각의 붕어빵과 재고 개수 = 인스턴스
		a.bake();
		b.bake();
		c.bake();
		d.bake();
	}
}

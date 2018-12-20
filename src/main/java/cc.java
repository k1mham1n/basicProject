
public class cc {
	
	public static void main(String[] args)  throws Exception{
		
		aa num1 = new aa();
		// aa 객체 생성 = 얘는 2를 더해주는 객체
		bb num2 = new bb();
		// bb 객체 생성 = 얘는 3을 곱해주는 객체
		
		// 숫자 3에다가 2를 더하고 3를 다시 곱하기
		
		// 3 * 5(3+2) = 15
		System.out.println(num2.number(num1.number(3)));
		/*
		int ss = num1.number(3);
		System.out.println(ss);
		int zz = num2.number(ss);
		System.out.println(zz);*/
		
	}
	
}

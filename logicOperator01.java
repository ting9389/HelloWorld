public class logicOperator01{
	
	public static void main(String[] args) {
		int a = 30;
		int b = 9;
		if(a < 40 && a > 10) {
			System.out.println("&&表示短路与，前后条件都满足，则为true");
		if(a > 50 && ++b < 100) {
			System.out.println("&&表示短路与，当第一个条件不被满足时，后边不再执行");
		}
		System.out.println("a=" + a + "b=" + b);
		
		if(a < 40 & a > 10) {
			System.out.println("&表示逻辑与，前后条件都满足，则为true");
		if(a > 50 & ++b < 100)  {
			System.out.println("&表示逻辑与，当第一个条件不被满足时，后边仍继续执行");
		}
		System.out.println("a=" + a + "b=" + b);
		}
		}
	}
}
	

		
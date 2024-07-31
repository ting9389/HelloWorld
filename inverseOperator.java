public class inverseOperator{
	
	public static void main(String[] args) {
		
		//	!取反，如果条件本身成立，结果为false，否则为true
		int a = 100;
		if (!(a < 20)) {
			System.out.println("!取相反");
		//	^逻辑异或	，当a和b不同时，则结果为true，否则为false。
		int b = 15;
		System.out.println((a < 10) ^ (b == 15));
		}
	}
}
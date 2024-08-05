public class TernaryOperator {
	
	public static void main(String[] args) {
		//三元运算符使用
		int a = 10;
		int b = 99;
		int result = a > b ? a ++ : b--;
		System.out.println(result);
		
		int result1 = a < b ? a ++ : b--;
		System.out.println(result1);
	}
}
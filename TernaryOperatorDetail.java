public class TernaryOperatorDetail {
	
	public static void main(String[] args) {
		//表达式1和表达式2要为可以赋给接受变量的类型（或可以自动转换）
		int a = 9;
		int b = 7;
		//String result = a < b ? a : b;	// ❌类型不匹配
		double result = a < b ? a : b;
		System.out.println(result);
		
		//三元运算符可以转成if--else语句
		if (a > b) result = a;
		System.out.println((int)result);
	}
}
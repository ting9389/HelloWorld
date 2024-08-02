public class AssignOperator{
	
	public static void main(String[] args) {
		//赋值运算符会自动进行类型转换
		byte a = 10;
		a += a;
		System.out.println("a=" + a);
	}
}
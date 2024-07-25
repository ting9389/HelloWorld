//强制类型转换细节说明
public class JavaConvertDetail{
	
	public static void main(String[] args) {
		//强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10 * 3.5 + 6 * 1.5;	//此处int转换的是10，最后结果仍为double
		int x = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(x);
		
		//char类型可以保存int的常量值，但不能保存int的变量值，需要强转换。
		char c1 = 100;
		System.out.println("c1 = " + c1);
		int m = 100;
		//char c2 = m; //错误，char不能保存int变量值，解决方法：转为char
		char c2 = (char)m;
		System.out.println("c2 = " + c2);
	}
}
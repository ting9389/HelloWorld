//自动类型转换注意和细节
public class AutoConvertDetail{
	
	public static void main(String[] args) {
		//细节1:	有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		//float d1 = n1 + 1.1;	//错误，n1+1.1的结果类型时double
		float d1 = n1 + 1.1F;	//ok。1.1F即浮点类型
		double f1 = n1 + 1.1;	//OK。直接用double
		System.out.println(d1);
		System.out.println(f1);
		
		//细节2: 当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，会报错。反之就会进行自动类型转换。
		//int n2 = 1.1;	//1.1是double型，无法赋值给int
		
		//细节3:	（byte，short）和char之间不会相互自动转换，当把具体数赋给byte时，先判断该书是否在byte范围内，如果是就可以
		byte b1 = 10;	//ok。byte范围（-128-127）
		System.out.println(b1);
		int n2 = 1;
		//byte b2 = n2;	//错误，如果是变量赋值，直接判断类型，n2是int
		//char c1 = b1;	//错误，byte不能自动转成char
		
		//细节4:	byte,short,char 他们三者可以计算，在计算时首先转换为int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short S2 = b2 + s1;	//错，b2 + s1 => int
		int s2 = b2 + s1;	//ok.
		System.out.println(s2);
		
		//细节5:	boolean 不参与转换
		
		//细节6：自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型 ，题型如下
		
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		float num300 = 1.1F;
			
		//short num500 = b4 + s3 + num200 + num300;	//错误，结果为float类型，无法赋值给short
		double num500 = b4 + s3 + num200 + num300;
		System.out.println(num500);	//ok.
		
	}
}
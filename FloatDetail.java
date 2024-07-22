public class FloatDetail{
	
	public static void main(String[] args) {
		//java的浮点类型默认为double型，声明float型常量，须后加“f或F”
		double n1 = 20.4;
		System.out.println(n1);
		
		//double n2 = 21.2F 可被执行，float为4个字节。double为8个字节，可容纳
		double n2 = 21.2F;
		System.out.println(n2);
		
		/* 22.0未加F，执行System.out.println(n3)报错cannot convert from double to float
		 * float n3 = 22.0;
		 */
		
		float n4 = 33.5F;
		System.out.println(n4);
		
		//十进制数形式：5.12	512.0f	.512（必须有小数点）
		double n5 = .123;//等价于0.123
		System.out.println(n5);
		
		//科学记数法形式	5.12e2【5.12*10的2次方】	5.12E-2【5.12%10的2次方】
		System.out.println(5.12e2);
		System.out.println(5.12E-2);
		
		//通常使用double，double比float更精确
		double n6 = 2.1234567890889;
		float n7 = 3.2435678907654F;
		System.out.println(n6);
		System.out.println(n7);
		
		/*
		 * 浮点数使用陷阱：2.7和8.1/3比较
		 * 重要：对运算结果是小数的值进行相等判断时，应使用两个数的差值的绝对值，在某个精度范围内判断
		 */
		double n8 = 2.7;
		double n9 = 8.1/3;
		System.out.println("n8=" + n8);	//输出2.7
		System.out.println("n9=" + n9);	//输出2.6999999999999997
		//比较n8和n9相等时，正确写法
		if(Math.abs(n8 - n9) < 0.0001 ) {
			System.out.println("差值非常小，认为n8=n9");
		}
		System.out.println(Math.abs(n8 - n9));
	}
}
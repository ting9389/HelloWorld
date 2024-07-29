public class ArithmeticOperator{
	
	public static void main(String[] args) {
		// /使用
		System.out.println("10 / 4 = " + 10 / 4); 		//int是整数，所以只取整数，java=2
		System.out.println("10.0 / 4 = " + 10.0 / 4);	//java=2.5
		
		double d = 10 / 4;
		System.out.println("double d = 10 / 4, d =  " + d);	//先10 / 4 = 2，然后2=>2.0	
		
		//取模，取余%
		//在%的本质是一个计算公式	a % b = a - a / b * b
		System.out.println("10 % 3 = " + 10 % 3);
		System.out.println("-10 % 3 = " + -10 % 3);
		System.out.println("10 % -3 = " + 10 % -3);
		
		//++的使用
		int i = 10;
		++i;
		System.out.println("++i =  " + i);
		i++;
		System.out.println("i++ =  " + i);
		
		/*
		 前++，表示先自增后赋值
		 后++，表示先赋值后增
		 */
		int j = 8;
		int k = ++j;
		System.out.println("k =  " + k  + "    " + "j = " + j);
	}	
}
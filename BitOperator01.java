public class BitOperator01{
	
	public static void main(String[] args) {
		int a = 1 >> 2;	//1算术右移两位，结果为0（1/2/2=0）
		int b = -1 >> 2;	//-1算术右移两位，结果为-1
		/*
		 * -1的原码：10000000	00000000	00000000	00000001
		 * -1的反码：11111111	11111111	11111111	11111110
		 * -1的补码：11111111	11111111	11111111	11111111
		 * -1>>2的补码：11111111	11111111	11111111	11111100
		 * -1>>2的反码：11111111	11111111	11111111	11111000

		 */
		
		int c = 1 << 2;	//1算术左移两位，结果为4（1*2*2=4）
		int d = -1 << 2;	//-1算术左移两位，结果为-4
		int e = 3 >>> 2;	//3无符号右移2位
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);	
		
	}
}
	
	                                
			

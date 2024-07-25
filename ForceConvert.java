public class ForceConvert{
	
	public static void main(String[] args) {
		
		//强制转换类型
		int num = (int)1.1;
		System.out.println("num = " + num);	//输出1，造成精度损失
		
		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1 = " + b1);	//造成数据溢出
	}
}
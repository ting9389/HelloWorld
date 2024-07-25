public class StringToBasic{
	
	public static void main(String[] args) {
		//基本数据类型转换为String，+“”即可
		int n1 = 100;
		float n2 = 1.1F;
		double n3 = 3.4;
		boolean b1 = true;
		String str1 = n1 + "";
		String str2 = n2 + "";
		String str3 = n3 + "";
		String str4 = b1 + "";
		System.out.println(str1 + " " + str2 + " " + str3 + " " + b1);
		
		//String类型转基本数据类型，使用基本数据类型对应的包装类的相应方法，得到基本数据类型
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);
		
		System.out.println("------------------------------");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
		System.out.println("b = " + b);
		System.out.println("num6 = " + num6);
		
		//字符串转成char：是指把字符串的第一个字符得到
		System.out.println("转为char后得到如下结果：" + s5.charAt(1));
	}
}
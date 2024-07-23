public class CharDetail{
	
	public static void main(String[] args) {
		
		//在java中，char的本质是一个整数，在输出时，是unicode码对应的字符。
		char c1 = 97;
		System.out.println(c1);
		//输出a对应的数字
		char c2 = 'a';
		System.out.println((int)c2);
		char c3 = '王';
		System.out.println((int)c3);
		//输出unicode码对应的字符
		char c4 = 29579;
		System.out.println(c4);
		
		//char类型是可以进行运算的，相当于一个整数，因为它都有对应unicode码
		System.out.println('a' + 1); //a对应的unicode码为97，所以最后输出98
		
		//课堂测试
		char c5 ='b'+ 1;
		System.out.println((int)c5);
		System.out.println(c5); //b在unicode码中对应为98，b+1=99，99在unicode码中对应的字符为c,故输出c
	}
}
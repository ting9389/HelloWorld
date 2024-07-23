

//演示char的基本使用

public class Char01{
	
	public static void main(String[] args) {
		char a = 'w';
		char b = '我';
		char c = '\t';
		char d = 97;	//字符类型可以直接存放一个数字
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);	//当输出d的时候，会输出97表示的字符--编码的概念
	}
}
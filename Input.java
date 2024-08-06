import java.util.Scanner;

public class Input{
	
	public static void main(String[] args) {
		//从控制台接收用户信息，【姓名 年龄 薪水】
		/*
		 步骤
		 1.导入Scanner类所在的包
		 2.创建Scanner对象
		 */
		Scanner myScanner = new Scanner(System.in);
		//打印“请输入名字”
		System.out.println("请输入姓名：");
		String name = myScanner.next();		//接收用户输入字符串
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();		//接收用户输入int
		System.out.println("请输入薪水：");
		double sal = myScanner.nextDouble();
		System.out.println("姓名：" + name + "年龄:" + age + "薪水：" + sal);
		
	}
}


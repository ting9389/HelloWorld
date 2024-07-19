public class Variable{
	
	public static void main(String[] args) {
		//	变量的用法
		String name = "老王";
		int age = 20;
		double score = 60.2;
		char genter = '男';
		System.out.println("这个人的个人信息如下：");
		System.out.println("姓名\t性别\t年龄\t成绩");
		System.out.println(name + "\t" + genter + "\t" + age + "\t" + score + "\t");
		name = "老李";
		System.out.println("后来改名为：" + name);
	}

}
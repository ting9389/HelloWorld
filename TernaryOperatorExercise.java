public class TernaryOperatorExercise{
	
	public static void main(String[] args) {
		//实现三个数的最大值
		int a = 3345678;
		int b = 523546576;
		int c = 72134;
		int max1 = a > b ? a : b;
		int max2 = max1 > c ? max1 : c;
		System.out.println("最大值为：" + max2);
		
		//使用一条语句完成
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("最大值为：" + max);
	}
}
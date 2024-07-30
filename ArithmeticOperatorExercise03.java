public class ArithmeticOperatorExercise03{
	
	public static void main(String[] args) {
		//假如还有59天放假，问：合XX个星期零XX天
		int days = 25911;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println("假如还有" + days + "天放假，" + "合" + weeks + "个星期" + "零" + leftDays + "天");
		
		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100），请求出华氏温度对应的摄氏温度。【234.5】
		double huaShi = 234.6;
		double sheShi = 5.0 / 9 * (huaShi-100);
		System.out.println("华氏温度" + huaShi + "对应的摄氏温度为" + sheShi);
	}
}
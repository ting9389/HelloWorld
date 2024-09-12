import java.util.Scanner;
public class NestedBranchExercises{
	
	public static void main(String[] args) {
		
		//1. 月を入力してくださいと表示し、int型で月を受け取る
		// 2. 入力された月が4月から10月の間であれば、「年齢を入力してください」と表示し、int型で年齢を受け取る
		// 3. 年齢が18歳から60歳の場合、"成人：60元"と表示する
		// 4. 年齢が18歳未満の場合、"子供：半額"と表示する
		// 5. 年齢が60歳以上の場合、"老人：1/3"と表示する
		// 6. 入力された月がその他の場合、「年齢を入力してください」と表示する
		// 7. 年齢が18歳から60歳の場合、"成人：40元"と表示する
		// 8. 年齢がその他の場合、"その他：20"と表示する
		Scanner myScanner = new Scanner(System.in);
		System.out.println("月を入力してください：");
		int month = myScanner.nextInt();
		if (month >= 4 && month <= 10) {
			System.out.println("年齢を入力してください：");
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.println("成人：60元");
			} else if (age >= 0 && age <= 18) {
				System.out.println("子供：半額");
			} else {
				System.out.println("老人：1/3");
			}
		} else if (month <= 12 && month >= 1) {
			System.out.println("年齢を入力してください：");
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.println("成人：40元");
			} else {
				System.out.println("その他：20元");
			}
		} else {
			System.out.println("月は一月から十二月までのみ入力できます。再入力してください。");
		}
	}
}
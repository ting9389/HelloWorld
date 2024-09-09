import java.util.Scanner;
public class If03 {
	
	public static void main(String[] args) {
		//要求：キーボードから保国さんの芝麻信用スコアを入力し、判断してください。
		//信用点数が100点の時は、信用が非常に良いと出力してください。
		//信用点数が80点より大きく、99点以下の時は、信用が良いと出力してください。
		//信用点数が60点より大きく、80点以下の時は、信用が普通と出力してください。
		//他の状況では、信用が不合格と表示してください。
		Scanner scanner = new Scanner(System.in);
		//文字列を読み取って、印刷する
		System.out.println("芝麻信用スコアを入力してくだい(1-100)：");
		double grades = scanner.nextInt();
		if (grades <= 1 && grades <= 100) {
			if (grades == 100) {
				System.out.println("信用が非常に良いです。");
			} else if (grades > 80 && grades <= 99) {
				System.out.println("信用が良いです。");
			} else if (grades > 60 && grades <= 80) {
				System.out.println("信用が普通です。");
			} else {
				System.out.println("信用が不合格です。");
			}
			scanner.close();
		} else {
			System.out.println("信用分は1から100の範囲でなければなりません.もう一度入力してください。");
		}
	}
}
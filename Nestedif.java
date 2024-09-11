import java.util.Scanner;
public class Nestedif{
	
	public static void main(String[] args) {
		//要求：成績と性別を入力してください。予選の成績が8.0以上であれば決勝に進出します。そうでなければ、淘汰されます。性別に応じて男子グループまたは女子グループに進出します。
		/*
		//scannerオブジェクトを作成します。
		Scanner myScanner = new Scanner(System.in);
		//予選の成績を入力してください。
		System.out.println("予選の成績を入力してください：");
		double score = myScanner.nextDouble();
		//性別を入力してください。
		System.out.println("性別を入力してください：");
		char sex = myScanner.next().charAt(0);
		
		//決勝に進出できるかどうかを判断します。
		if ((score >= 0 && score < 10) && (sex == '男' || sex == '女')) {
			if (score >= 8.0 && sex == '男') {
				System.out.println("あなたが男性で成績が8.0以上だから、男性グループの決勝に進出してください。");
			} else if (score >= 8.0 && sex == '女') {
				System.out.println("あなたが女性で成績が8.0以上だから、女性グループの決勝に進出してください。");
			} else {
				System.out.println("あなたが淘汰されました。");
			}
		} else {
			System.out.println("成績は0から10の間でのみ、性別は男性または女性のみ入力できます。再度確認の上、再入力してください。");
		}
		 */
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("予選の成績を入力してください：");
		double score = myScanner.nextDouble();
		if (score > 8.0) {
			System.out.println("性別を入力してください：");
			char gender = myScanner.next().charAt(0);
			if (gender == '男') {
				System.out.println("あなたが男性で成績が8.0以上だから、男性グループの決勝に進出してください。");
			} else if (gender == '女') {
				System.out.println("あなたが女性で成績が8.0以上だから、女性グループの決勝に進出してください。");
			} else {
				System.out.println("性別は男性または女性のみ入力できます。再度確認の上、再入力してください。");
			}
		} else {
			System.out.println("あなたが淘汰されました。");
		}
	}
}
//Scannerクラスをインポートする。
import java.util.Scanner;
public class If02 {
	
	public static void main(String[] args) {
		//Scannerオブジェクトを定義する。
		Scanner myScanner = new Scanner(System.in);
		System.out.println("年齢を入力してください：");
		//年齢を変数｀age｀に保存する。
		int age = myScanner.nextInt();
		if (age > 18) {
			System.out.println("あなたは18歳以上です。自分の行為に責任を持ち、刑務所に送られることになります。");
		} else {
			System.out.println("あなたの年齢は大きくないので、今回は許します。");

		}
		System.out.println("プログラムが続行する。");
	}
}
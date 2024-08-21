//Scannerクラスをインポートする。
import java.util.Scanner;
public class If01 {
	
	public static void main(String[] args) {
		//要求：年齢を入力して、もしその年齢が18歳以上であれば、「あなたは18歳以上です。自分の行為に責任を持ち、刑務所に送られることになります」と出力してください。
		//Scannerオブジェクトを定義する。
		Scanner myScanner = new Scanner(System.in);
		System.out.println("年齢を入力してください:");
		//年齢を変数｀age｀に保存する。
		int age = myScanner.nextInt();
		if (age > 18) {
			System.out.println("年齢を入力して、もしその年齢が18歳以上であれば、「あなたは18歳以上です。自分の行為に責任を持ち、刑務所に送られることになります」と出力してください。");
		}
		System.out.println("プログラムが続行する");
	}
}
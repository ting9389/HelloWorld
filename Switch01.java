import java.util.Scanner;
public class Switch01{
	
	public static void main(String[] args) {
		/*
		 要求：
		 1.char型（a~g）を受け取るプログラムを作成してください。
		 2.aは月曜日、bは火曜日を表し、以降同様に続きます。
		 3.ユーザーの入力に基づいて、対応する情報を表示してください。switch文を使用して実現すること。
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("a〜gの中から一つの文字を入力してください：");
		char letter = myScanner.next().charAt(0);
		switch (letter) {
			case 'a' :
				System.out.println("今日は月曜日です。");
				break;
			case 'b' :
				System.out.println("今日は火曜日です。");
				break;
			case 'c' :
				System.out.println("今日は水曜日です。");
				break;
			case 'd' :
				System.out.println("今日は木曜日です。");
				break;
			case 'e' :
				System.out.println("今日は金曜日です。");
				break;
			case 'f' :
				System.out.println("今日は土曜日です。");
				break;
			case 'g' :
				System.out.println("今日は日曜日です。");
				break;
			default:
				System.out.println("入力した文字が正しくなく、該当するものがありません。");
			
		}
		System.out.println("switchを抜けて、プログラムの実行を続けます。");
	}
}
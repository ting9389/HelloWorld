public class IfExercise01 {
	
	public static void main(String[] args) {
		//要求1：一番目の数が10以上で、二番目の数が20未満なら、両方を加算した結果を出力します。
		//二つの｀double｀型の変数を定義する。
		double n1 = 12.7;
		double n2 = 4.0;
		if (n1 > 10.0 && n2 < 20.0) {
			System.out.println("n1 + n2 = " + (n1 + n2));
		}
		
		//要求2:二つの変数｀int｀型を定義して、両方を加算して、その結果が3と5で割り切れるかどうかを確認し、メッセージを出力します。
		//二つの変数｀int｀型を定義をする。
		int a1 = 5;
		int a2 = 11;
		//解決策1：
		if ((a1 + a2) % 3 == 0 && (a1 + a2) % 5 == 0) {
			System.out.println("a1とa2を加算した結果は、３と5で割り切れました。");
		}else {
			System.out.println("a1とa2を加算した結果は、3と5で割り切れませんでした。");
		}
		//解決策２：
		if ((a1 + a2) % 3 == 0) {
			if ((a1 + a2) % 5 == 0) {
				System.out.println("a1とa2を加算した結果は、３と5で割り切れました。");
			}
		} else {
			System.out.println("a1とa2を加算した結果は、3と5で割り切れませんでした。");
		}
		
		//要求３：ある年が閏年かどうか、判断してください。判断条件は以下のいずれかです：その年が4で割り切れるが、100で割けれない；または、400で割り切れること。
		//変数｀int｀型を定義をする。
		int x = 2023;
		if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
			System.out.println(x + "年は閏年です。");
		} else {
			System.out.println(x + "年は閏年ではありません。");
		}
	}
}
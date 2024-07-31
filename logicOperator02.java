public class logicOperator02{
	
	public static void main(String[] args) {
		
		//	｜｜表示短路或，｜表示逻辑或
		int a = 1;
		int b = 4;
		//	短路或，其中一个条件为真，则结果为真
		if(a < 4 || b > 6) {
			System.out.println("短路或｜｜，有一个条件为真，则结果为真");
		//	短路或，第一个条件为真，不执行后面程序
		if(a == 1 || ++b < 1) {
			System.out.println("短路或｜｜，有一个条件为真，则结果为真");
		}
		System.out.println("a=" + a + "b=" + b);
		//	短路或，第一个条件为假，则执行后面程序
		if(a != 1 || ++b < 5) {
			System.out.println("短路或｜｜，第一个条件为假，第二个条件为真则结果为真");
		}
		System.out.println("a=" + a + "b=" + b);
		
		//	 逻辑或，其中一个条件为真，则结果为真
		if(a < 3 | b < 2) {
			System.out.println("逻辑或｜，有一个条件为真，则结果为真");
		//	逻辑或，第一个条件无论是否为真，都执行后续程序
		if(a == 3 | ++b < 10) {
			System.out.println("a=" + a + "b=" + b);
		}
		}
		}
	}
}
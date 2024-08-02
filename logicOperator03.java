public class logicOperator03{
	
	public static void main(String[] args) {
		//练习1
		int x = 5;
		int y = 5;
		if(x++==6 & ++y==6) {	//逻辑与&：不管第一个条件是否为false，都执行第二个条件；a和b都为true，结果为true。（x++==6 False,x=6;++y==6 True,y=6;）
			x = 11;	//（不执行）
		}
		System.out.println("我是练习1，结果如下:\n" + "x=" + x + ",y=" + y);	//x=6,y=6
		
		//练习2
		int a = 5;
		int b = 5;
		if(a++==6 && ++b==6) {	//短路与&&：第一个条件为false，不都执行第二个条件；a和b都为true，结果为true。（a++==6 False,a=6;++b==6 不执行,b=5;）
			a = 11;	//（不执行）
		}
		System.out.println("我是练习2，结果如下:\n" + "a=" + a + ",b=" + b);	//a=6,b=5
		
		//练习3
		int c = 5;
		int d = 5;
		if(c++==5 | ++d==5) {	//逻辑或|：不管第一个条件是否为true，都执行第二个条件；a和b只要有一个为true，结果为true。（c++==5 true,c=6;++d==5 False,d=6;）
			c = 11;	//（执行）
		}
		System.out.println("我是练习3，结果如下:\n" + "c=" + c + ",d=" + d);	//c=11,d=6
		
		//练习4
				int e = 5;
				int f = 5;
				if(e++==5 || ++f==5) {	//短路或|｜：第一个条件为true，第二个条件不会判断；a和b只要有一个为true，结果为true。（e++==5 true,++f==5 不执行,f=5;）
					e = 11;	//（执行）
				}
				System.out.println("我是练习4，结果如下:\n" + "e=" + e + ",f=" + f);	//e=11,f=5
				
		//练习5
				boolean g = true;
				boolean h = false;
				short z = 46;
				if((z++ == 46) && (h = true)) z++;	//z++ == 46 z = 47 true; h=true, z++48
				if((g = false) || (++z==49)) z++;	//g=false ,++z==49 true, z++=50
				System.out.println("我是练习5，结果如下:\n" + "z=" + z);	//50
				
	}
}
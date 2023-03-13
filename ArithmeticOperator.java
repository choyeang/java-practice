public class ArithmeticOperator{
	public static void main(String[]args) {
		//使用
		//System.out.println(10/4);//从数学来看时2.5 但是在java中是2
		//System.out.println(10.0/4);//保留小数点 2.5
		//double d = 10/4;//java中10/4 =2，2.0=》2
	
		//System.out.println(d);//2.0
		
		//%取模，取余
		//取模公式 a%b= a-a/b*b
		//System.out.println(10%3);//1
		//System.out.println(-10%3);//-1
		//System.out.println(10%-3);//10-10/（-3）*（-3）=10-9=1
		//System.out.println(-10%-3);//-10-(-10)/(-3)*(-3)=-10+9=-1
		
		//++的使用
		int i = 10;
		i++;//自增 等价于i=i+1；
		++i;//自增 等价于i=i+1；
		System.out.println("i="+i);//12
		
		//作为表达式使用
		//前++：++i先自增后赋值
		//后++：I++先赋值后自增
		int j =8;
		int k = ++j;//
		System.out.println("k="+k+"j="+j);
		
		int m = 8;
		int n = m++;
		System.out.println("m="+m+"n="+n);

		
		
	}
}
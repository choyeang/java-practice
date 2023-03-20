public class LogicOperator01{
	public static void main(String[]args) {
		 //逻辑运算符的使用 &&和&
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok");
		}
		
		//&使用
		if(age > 20& age < 90);{
			System.out.println("yes");
		}
		
		//区别
		int a = 4;
		int b = 9;
		if(a < 1 && ++b < 50) {
			System.out.println("ok01");
			System.out.println("a =" + a +"b=" +b);
		}
	}
}
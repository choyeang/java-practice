public class AutoConvertDetail{
	public static void main(String[]args) {
		//有多种类型数据混合运算时
		//系统首先自动将所有数据转换成容量最大的那种数据类型进行计算
		int n1 = 10;
		//float d1 =n1 +1.1 错误 结果类型是double】
		//double d1 = n1+1.1对 结果类型是double
		float d1=n1 + 1.1F;//对，n1 + 1.1 结果类型是float
		//细节2 当我们把精度大的数据类型赋值给精度小的数据时，就会报错，反之将会进行自动转换。
		//int d1 =1.1 错误的 double》int
		//细节3byte，short和char之间不会相互自动转换
		//当把数值赋给byte时，先判断该书是否在byte范围内，如果是就对
		byte b1 = 10;//对，-128--127
		//int n2 = 1;
		//byte b2 = 1 错误，原因：如果是变量赋值，判断类型
		//char c1 = b1;//错误，原因byte 不能自动转成char
		//细节4byte，short，char 它们三者可以计算，在计算时首先转换为int类型
		byte b2 = 1;
		byte b3 =2;
			
		short s1 = 1;
		//short s2 = b2 + s1;//错，b2+s1>int
		int s2 = b2 + s1;
		//byte b4 = b2 +b3//错
		
	
		



		
	}
}
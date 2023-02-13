public class chardetail{
	public static void main(String[]args) {
		//char的半只是一个整数，在输出时，是unicode码对应的字符
	
	    char c1 =97;//unicode97=a
		System.out.println(c1);//输出结果是a
		char c2 ='a';//输出a对应数字
		System.out.println((int)c2);
		char c3 ='韩';
		System.out.println((int)c3);//38889
		char c4 =38889;
		System.out.println(c4);//韩
		char c5 = 'b' + 1;//b的unicode是98 98+1=99
		System.out.println((int)c5);//99
		System.out.println(c5);//99 对应数字的ASCII编码表99为c
				
			
				
				
		
		
		
	}
}
public class ArithmenticOperatorExecise01{
	public static void main(String[]args) {
		//需求：
		//假如还有59天放假，问合XX个星期零XX天
		//思路分析
		//（1）使用int days保存天数
		//（2）一个星期是7天 星期数weeks： days/7 零XX天leftdays days%7
		//（3）输出
		
		int days = 59;
		int weeks = days/7;
		int leftdays = days%7;
		System.out.println(days + "天 合"+ weeks + "星期零" + leftdays +
				"天");
		
		//需求
		//定义一个变量保存华氏温度，华氏温度转摄氏温度的公式位
		//5/9*（华氏温度-100），求出华氏温度对应的摄氏温度
		//一定要考虑数学公式和Java语言的特性
		
		double huashi = 1345.7;
		double sheshi = 5.0/9.0*(huashi - 100);
		System.out.println("华氏温度"+ huashi + "对应的摄氏温度 = "+ sheshi);
	}
}
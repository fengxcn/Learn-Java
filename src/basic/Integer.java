package basic;

/**
 * 
 * @author fengxuan
 * 
 *         整数
 *
 */
public class Integer {

	public static void main(String[] args) {
		int i = (100 + 200) * (99 - 88);
		int j = 7 * (5 + (i - 9));

		System.out.println(i); // 3300
		System.out.println(j); // 23072

		// 整数运算永远是精确的，即使是除法也是精确的，因为两个整数相除只能得到结果的整数部分
		int x = 100 / 9;
		System.out.println("x=" + x); // x=11

		//求余运算使用%
		int y = 100 % 9;
		System.out.println("y=" + y); // x=1
		
		//整数由于存在范围限制，如果计算结果超出了范围，就会产生溢出
		int m = 2147483640;
        int n = 15;
        int sum = m + n;
        System.out.println("sum="+sum); // -2147483641

	}

}

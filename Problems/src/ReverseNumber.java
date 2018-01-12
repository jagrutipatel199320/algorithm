import java.lang.Math.*;
public class ReverseNumber {
	
	public static int reverse(int n) {
		int rnum = 0;
        int sign =n < 0 ? -1 : 1;

		int num = Math.abs(n);
		while(num > 0) {
		int digit = num%10;
		rnum = rnum*10 + digit;
		num = num/10;
		}
		return sign * rnum;
	}
	public static void main(String[] args) {
		
		int number = -30120;
		int result =reverse(number);
		System.out.print(result);
		
	}
	
}

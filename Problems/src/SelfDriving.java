import java.util.ArrayList;

public class SelfDriving {
	public static ArrayList<Integer> selfDividingNum(int first, int last) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 for(int i= first; i<= last; i++) { 
			 if(selfDividing(i)){
			 result.add(i);
			 }
		 }

		 return result;
	}
	
	public static boolean selfDividing(int n) {
		int num = n;
		while(num>0) {
			int digit = num % 10;		
			if(digit == 0 || n%digit != 0)	return false;			
			else num = num/10;
				
	}
		return true;
	}
	
	public static ArrayList<Integer> selfDividingNum1(int first, int last) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 for(int i= first; i<= last; i++) {
			 if(selfDividing1(i)){
			 result.add(i);
			 }
		 }
		 return result;
	}
	
	public static boolean selfDividing1(int n) {
		for(char c : String.valueOf(n).toCharArray()) {
			if( c == '0'|| (n%(c - '0') > 0) ) {
				return false;
			}
		}
		return true;
			
	}

	public static void main(String[] args) {
		int first = 11;
		int last = 100;
		long startTime = System.currentTimeMillis();	
		//ArrayList<Integer> result = selfDividingNum(first,last);
		long endTime = System.currentTimeMillis();	

		//System.out.print(result);
		//System.out.println("Time complexity : " +(endTime-startTime));
		
		long startTime1 = System.currentTimeMillis();	
		ArrayList<Integer> result1 = selfDividingNum1(first,last);
		long endTime1 = System.currentTimeMillis();	

		System.out.print(result1);
		System.out.println("Time complexity : " +(endTime1-startTime1));
		
	}
		
	
}

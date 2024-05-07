package lecture_3;
import java.util.*;
public class digitfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        
        int ans = digit_frequency(n,d);
        System.out.println(ans);
	}
	
	public static int digit_frequency(int n,int d) {
		int count = 0;
		while(n != 0) {
			int ld = n % 10;
			n = n / 10;
			
			if(ld == d) {
				count = count + 1;
			}
		}
		
		return count;
	}

}

package april_batch;
import java.util.*;
public class sum_of_n_naturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sum = 0;
        for(int i=1;i <= n;i++) {
        	sum = sum + i;
        }
        
        System.out.println(sum);
        
	}

}

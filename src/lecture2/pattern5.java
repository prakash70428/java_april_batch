package lecture2;
import java.util.*;
public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int space = 0;
        int star = n;
        
        while(row <= n) {
        	//space
        	int i=1;
        	while(i <= space) {
        		System.out.print("  ");
        		i = i + 1;
        	}
        	
        	//star
        	int j=1;
        	while(j <= star) {
        		System.out.print("* ");
        		j = j + 1;
        	}
        	
        	//next row prepration
        	row = row + 1;
        	System.out.println();
        	space = space + 2;
        	star = star - 1;
        }
	}

}

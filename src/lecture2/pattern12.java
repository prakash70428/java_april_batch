package lecture2;
import java.util.*;
public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int spaces = n - 1;
        int star = 1;
        int val = 1;
        
        while(row <= n) {
        	//spaces
        	int i=1;
        	while(i <= spaces) {
        		System.out.print("\t");
        		i = i + 1;
        	}
        	
        	//star
        	int j=1;
        	while(j <= star) {
        	    System.out.print(val + "\t");
        	    val = val + 1;
        	    j = j + 1;
        	}
        	
        	//next row prepration
        	row = row + 1;
        	System.out.println();
        	spaces = spaces - 1;
        	star = star + 2;
        	
        }
	}

}

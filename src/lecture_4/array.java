package lecture_4;
import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        //user input
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        //output
        for(int i=0 ; i < n;i++) {
        	System.out.print(arr[i] + " ");
        }
        
	}

}

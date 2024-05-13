package lecture2;
import java.util.*;
public class pattern14 {

	public static void main(String[] args) {
			Scanner scn =new Scanner(System.in);
			int n=scn.nextInt();
			
			int row=1;
			int space=n/2;
			int star=1;
			int val = 1;
			
			while(row<=n){
			     //space
			      int i=1;
			      while(i<=space){
			          System.out.print("  ");
			          i=i+1;
			      }
			      //star
			      int j=1;
			      int p = val;
			      while(j<=star){
			          System.out.print(p + " ");
			          if(j < star/2+1) {
			        	  p++;
			          }else {
			        	  p--;
			          }
			          
			          j=j+1;
			      }
			      
			    //next row preparation
			    //  mirror concept
			    if (row < n/2+1){
			    	 star=star+2;
			          space=space-1; 
			          val++;
			    }else{
			    	  star=star-2;
				      space=space+1;
				      val--;
			     }
			    
			    row=row+1;
				System.out.println();
				
			}	
		}	
}

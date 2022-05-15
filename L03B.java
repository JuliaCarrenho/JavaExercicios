package DoWhile_While;

import java.util.*;


public class L03B {
   public static void main (String[]args) {
	   Scanner sc = new Scanner (System.in);
	   int x = 0;
	   int y = 0;
	   
	   while(x <= 100){
		   y = x + y;
		   x++;
	   }
	   System.out.println(y);
   }
}

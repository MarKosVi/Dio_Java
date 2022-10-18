package metodos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        
        System.out.println(somatorio(N));
		
	}
	
	public static int somatorio(int n) {
	      if(n == 0) {
	    	  return 0;
	      }else {
	    	  return n+somatorio(n-1);
	      }
	    }
	
}

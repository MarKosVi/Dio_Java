package metodos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner(System.in);
        
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        System.out.println(BuscaSequencial(leitor.nextInt(), elementos));
        
      
    }
    
    static String BuscaSequencial(int n, int[] arr) {
      for(int i = 0; i<arr.length; i++){
        if(arr[i] == n) 
          return "Achei "+n+" na posicao "+i;
      }
      return "Numero "+n+" nao encontrado!";
    }
	
}

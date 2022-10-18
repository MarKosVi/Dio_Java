package metodos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        System.out.println(FizzBuzz(num));
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

    }
    
    
    static String FizzBuzz(int n) {
      if(n%3 == 0 && n%5 == 0) return "FizzBuzz";
      if(n%3 == 0) return "Fizz";
      if(n%5 == 0) return "Buzz";
      
      return ""+n;
	    }
	
}

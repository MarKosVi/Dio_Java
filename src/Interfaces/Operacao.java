package Interfaces;

public class Operacao implements OperacaoMatematica {
	
	@Override
	public void Soma(double op1, double op2) {
		System.out.println("Soma: "+ (op1+op2));
	}
	
	@Override
	public void Subtracao(double op1, double op2) {
		System.out.println("Subtracao: "+ (op1-op2));
	}
	
	@Override
	public void Divisao(double op1, double op2) {
		System.out.println("Divisao: "+ (op1/op2));
	}


	@Override
	public void Multiplicacao(double op1, double op2) {
		System.out.println("Multiplicacao: "+ (op1*op2));
		
	}
	
	
	
}

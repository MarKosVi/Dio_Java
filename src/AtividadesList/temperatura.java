package AtividadesList;

import java.util.List;

public class temperatura {
	
	private int valorTemperatura;
	private String nomeMes;
	
	
	public temperatura(int valorTemperatura, String  nomeMes) {
		this.nomeMes = nomeMes;
		this.valorTemperatura = valorTemperatura;
	}


	public int getValorTemperatura() {
		return valorTemperatura;
	}


	public void setValorTemperatura(int valorTemperatura) {
		this.valorTemperatura = valorTemperatura;
	}


	public String getNomeMes() {
		return nomeMes;
	}


	public void setNomeMes(String nomeMes) {
		this.nomeMes = nomeMes;
	}
	
	public int getMedia(List<temperatura> t) {
		int soma = 0;
		for(int i = 0; i<t.size(); i++) {
			soma += this.getValorTemperatura();
		}
		return soma/t.size();
	}
	
	
	@Override
	public String toString() {
		return "[" + nomeMes + " - Temperatura =" + valorTemperatura+ "]\n";
	}
	
	
}

package AtividadesList;

public class Questoes {

	private String pergunta; 
	private boolean resp = false;
	
	
	public Questoes ( String pergunta) {
		this.pergunta = pergunta;
	}


	public String getPergunta() {
		return pergunta;
	}


	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}


	public boolean isResp() {
		return resp;
	}


	public void setResp(boolean resp) {
		this.resp = resp;
	}
	
	
	@Override
	public String toString() {
		return " "+pergunta+"? \n";
	}

	
	
}

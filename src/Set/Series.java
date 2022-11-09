package Set;

public class Series {
	
	private String nome;
	private String genero;
	private int tempoEpisodio;
	
	public Series(String nome, String genero, int tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(int tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	
	

}

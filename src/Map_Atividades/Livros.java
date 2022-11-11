package Map_Atividades;

public class Livros implements Comparable<Livros>{
	
	private String nome;
	private Integer paginas;
	
	
	public Livros(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getPaginas() {
		return paginas;
	}


	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
	@Override
	public String toString() {
		return " Livro: "+nome+" - "+"Paginas: "+paginas;
	}


	@Override
	public int compareTo(Livros o) {
		return this.getNome().compareToIgnoreCase(o.getNome());
	}
	
}

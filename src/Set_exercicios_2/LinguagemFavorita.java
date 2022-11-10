package Set_exercicios_2;

public class LinguagemFavorita implements Comparable <LinguagemFavorita> {

	private String nome;
	private int ano;
	private String ide;
	
	public LinguagemFavorita(String nome, int ano, String ide) {
		this.nome = nome;
		this.ano = ano;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}
	
	@Override
	public String toString() {
		return " Nome: "+nome+
				" - Ano Lancamento: "+ano+
				" - Ide: "+ide+" \n";
	}

	@Override
	public int compareTo(LinguagemFavorita o) {
		if(this.getNome().compareToIgnoreCase(o.getNome()) == 0) {
			return this.getIde().compareToIgnoreCase(o.getIde());
		}
		return this.getNome().compareToIgnoreCase(o.getNome());
	}
	
	
}

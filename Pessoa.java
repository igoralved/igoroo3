package src;

public class Pessoa {

	private String nome;
	private int idade;
	private Pessoa pai, mae;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.pai = null;
		this.mae = null;
	}
	
	public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
		this.nome = nome;
		this.idade = idade;
		this.pai = pai;
		this.mae = mae;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Pessoa getPai() {
		return pai;
	}
	
	public Pessoa getMae() {
		return mae;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setPai(Pessoa pai) {
		this.pai = pai;
	}
	
	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	
	public boolean temPai() {
		return pai != null;
	}
	
	public boolean temMae() {
		return mae != null;
	}
	
	public boolean eOrfao() {
		return pai == null && mae == null;
	}
	
	public void print() {
		System.out.println("Meu nome é " + nome);
		if(eOrfao()) {
			System.out.println("Nao tenho pai nem mae");
		}else {
			imprimesetemmae();
			imprimesetempai();
		}
	}

	private void imprimesetempai() {
		if(temPai()) {
			System.out.println("Meu pai e " + pai.getNome());
		}else {
			System.out.println("Nao tenho pai");
		}
	}

	private void imprimesetemmae() {
		if(temMae()) {
			System.out.println("Minha mae e " + mae.getNome());
		}else {
			System.out.println("Nao tenho mae");
		}
	}
	
}

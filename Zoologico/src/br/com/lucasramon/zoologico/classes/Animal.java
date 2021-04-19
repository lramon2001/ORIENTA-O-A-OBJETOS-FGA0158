package br.com.lucasramon.zoologico.classes;

public abstract class Animal implements Animavel {
	  
	private String nome;
	private String especie;
	private int idade;
    protected Boolean estaVivo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public final void morrer() {
		this.estaVivo=false;
	}
	
	public boolean estaVivo() {
		return this.estaVivo();
	}
	
	
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.estaVivo=true;
	}
	
	

	public Animal() {
		this.estaVivo=true;
		
	}

	public abstract void emitirBarulho();
	
	public boolean ehAdulto() {
		if(estaVivo) {
			return this.idade>=1;

		}
		else {
			return false;
		}
	
	}

}

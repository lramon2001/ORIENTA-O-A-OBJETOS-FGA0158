package br.com.lucasramon.zoologico.classes;

public class Cachorro extends Animal {

	public Cachorro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cachorro(String nome, String especie, int idade) {
		super(nome, especie, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("Au au au");
		}
		else {
			System.out.println("O cachorro morreu =-)");
		}
	
		
	}

}

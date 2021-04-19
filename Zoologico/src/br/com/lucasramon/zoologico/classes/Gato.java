package br.com.lucasramon.zoologico.classes;

public class Gato extends Animal {

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String nome, String especie, int idade) {
		super(nome, especie, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("miau miau miau");
		}
		else {
			System.out.println("Gato morto");
		}
		
	}
	
	
	  

}

package br.com.lucasramon.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
	
	private String nome;
	private List<Animal> animais;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Veterinario() {
		animais= new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal a) {

		animais.add(a);

	}
	
	
	
	
	
	
	
	
	

}

package br.com.lucasramon.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

	private String nome;
	private List<Animal>animais;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Zoologico(List<Animal> animais) {
		animais= new ArrayList<Animal>();
	}
	
	public Zoologico() {
		super();
		animais= new ArrayList<Animal>();
	}

	public void adicionarAnimal(Animal a) {
		
			animais.add(a);
		
		
	}
	
	public void removerAnimal (int index) {
		animais.remove(index);
	}
	
	public void listarAnimais() {
		System.out.println("Animais do zoológico");
		
		for (int i = 0; i < animais.size(); i++) {
			
			if (animais.get(i) != null) {
				System.out.println("      " + animais.get(i).getNome());

			}
		}
	}
	
	
	
}

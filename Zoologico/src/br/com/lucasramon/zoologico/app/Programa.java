ratempackage br.com.lucasramon.zoologico.app;

import br.com.lucasramon.zoologico.classes.*;

public class Programa {

	public static void main(String[] args) {

	    Animal gato= new Gato();
	    gato.setNome("Josué");
	    gato.setEspecie("Gato");
	    gato.setIdade(2);
	    Zoologico zoo = new Zoologico();
	    zoo.setNome("Zoo Inor");
	    zoo.adicionarAnimal(gato);
	    //zoo.listarAnimais();
	    zoo.removerAnimal(0);
	    zoo.listarAnimais();
	    
		
	}

}

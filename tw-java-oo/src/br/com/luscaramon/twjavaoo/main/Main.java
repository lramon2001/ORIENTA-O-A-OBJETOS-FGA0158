package br.com.luscaramon.twjavaoo.main;

import br.com.lucasramon.twjavaoo.classes.Carro;
import br.com.lucasramon.twjavaoo.classes.Moto;
import br.com.lucasramon.twjavaoo.classes.Veiculo;
import br.com.lucasramon.twjavaoo.exceptions.ChassiInvalidoException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		try {
			
			Veiculo jetta = new Carro();
			jetta.setNome("Jetta");
			jetta.setMarca("VW");
			jetta.ligar();
			Veiculo vectra = new Carro();
			vectra.setNome("Vectra");
			vectra.setMarca("GM");
			vectra.setChassi("ABCDr");
			vectra.abastecer(20);
			vectra.ligar();	
			((Carro)vectra).setQuantidadePortas(4);
			//vectra.abastecer(15);
			System.out.println(String.format("O veliculo está ligado? %b", vectra.isOn()));
			Veiculo f800gs=new Moto();
			f800gs.setMarca("BMW");
			f800gs.setNome("f800gs");
			f800gs.ligar();
			f800gs.acelerar(50);
			System.out.println(f800gs.getVelocidade());	
			f800gs.frear(10);
			f800gs.getVelocidade();
			System.out.println(f800gs.getVelocidade());
			f800gs.preparar();
			
		}
		catch(ChassiInvalidoException e) {
			System.out.println("Deu merda,capitão "+e.getMessage());
		}
		
			}

}

package Interfaces;

import br.com.lucasramon.twjavaoo.exceptions.AbastcimentoVeiculoLigadoException;
import br.com.lucasramon.twjavaoo.exceptions.VeiculoDesligadoExceptions;

public interface VeiculoInterface {
	void  ligar();
	void abastecer(float litros) throws AbastcimentoVeiculoLigadoException; 
	void acelerar(float velocidade) throws VeiculoDesligadoExceptions;
	void frear(float velocidade) throws VeiculoDesligadoExceptions;
}

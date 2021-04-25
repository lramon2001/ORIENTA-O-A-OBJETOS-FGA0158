package br.com.lucasramon.twjavaoo.exceptions;

public class ChassiInvalidoException extends Exception {
	
	private static final long serialVersionUID = -6765245270993994319L;

public ChassiInvalidoException(String chassi) {
	super(String.format("Este chassi é inválido [%s]", chassi));
 }

	
}

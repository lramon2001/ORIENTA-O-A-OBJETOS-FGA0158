package br.com.lucasramon.twjavaoo.classes;

import br.com.lucasramon.twjavaoo.exceptions.VeiculoDesligadoExceptions;

public final class Moto extends Veiculo{

	public Moto() {
		super();
		this.quantidadeRodas=2;
		
	}
	
	@Override
	public void acelerar(float velocidade) throws VeiculoDesligadoExceptions {
		if(this.ligado) {
			this.setVelocidade(this.getVelocidade() + velocidade);
		}
		else {
			throw new VeiculoDesligadoExceptions();
		}
	
		
	}
	@Override
	public void frear (float velocidade) throws VeiculoDesligadoExceptions{
		if (this.ligado && this.velocidade>0) {
			this.setVelocidade(this.getVelocidade() - velocidade);
		}
		else {
			throw new VeiculoDesligadoExceptions();
		}
		
	

}

	@Override
	public void preparar() {
		System.out.println("Colocar capacete; \n"
				+ "Verificar se o pezinho está erguido");
		
	}
}

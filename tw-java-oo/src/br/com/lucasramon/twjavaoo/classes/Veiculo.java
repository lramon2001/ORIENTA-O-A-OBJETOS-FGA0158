package br.com.lucasramon.twjavaoo.classes;


import Interfaces.VeiculoInterface;
import br.com.lucasramon.twjavaoo.exceptions.*;

public abstract class Veiculo implements VeiculoInterface{
	
	protected String nome;
	protected String chassi;
	protected String marca;
	protected int quantidadeRodas;
	protected float tanque;
	protected int quantidadePortas;
	protected boolean ligado;
	protected float velocidade;
	
	
	public Veiculo() {
		super();
		this.ligado=false;
		this.setVelocidade(0);
	}

	public void ligar() {
		System.out.println("O veículo ligou!");
		this.setVelocidade(0);
		this.ligado=true;
	}
	
	public void desligar() {
		System.out.println("O veículo desligou!");
		this.setVelocidade(0);
		this.ligado=false;
	}
    
	public boolean isOn() {
		return ligado;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) throws ChassiInvalidoException {
		if(chassi.length()==5) {
			this.chassi = chassi;
		}
		else {
		    throw new ChassiInvalidoException (chassi);
		}
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public float getTanque() {
		return tanque;
	}

	public void setTanque(float tanque) {
		this.tanque = tanque;
	}
	
	public void abastecer(float litros) throws AbastcimentoVeiculoLigadoException {
		if(!this.ligado) {
			this.tanque+=litros;
		}
		else {
			throw new AbastcimentoVeiculoLigadoException();
		}
	}
	public void acelerar(float velocidade) throws VeiculoDesligadoExceptions {
		if(this.ligado) {
			this.setVelocidade(this.getVelocidade() + velocidade);
		}
		else {
			throw new VeiculoDesligadoExceptions();
		}
	
		
	}
	
	public void frear (float velocidade) throws VeiculoDesligadoExceptions{
		if (this.ligado && this.velocidade>0) {
			this.setVelocidade(this.getVelocidade() - velocidade);
		}
		else {
			throw new VeiculoDesligadoExceptions();
		}
		
	}
	
	public abstract void preparar();

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
}
	
	
	
	



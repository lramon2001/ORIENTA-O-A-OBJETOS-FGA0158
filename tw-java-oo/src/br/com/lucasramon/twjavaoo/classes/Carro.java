package br.com.lucasramon.twjavaoo.classes;


public final class Carro extends Veiculo {
    private int quantidadePortas;
	public Carro() {
		super();
		this.quantidadeRodas=4;
		
	}
	
	public Carro(String nome,String chassi,String marca,int quantidadeRodas,float tanque) {
		this.nome=nome;
		this.chassi=chassi;
		this.quantidadeRodas=4;
		this.marca=marca;
		this.quantidadeRodas=quantidadeRodas;
		this.tanque=tanque;
		this.ligado=false;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	@Override
	public void preparar() {
		System.out.println("colocar cinto;\n"
				+ "verificar portas(se estão fechadas)."
				);
		
	}

	
	

}

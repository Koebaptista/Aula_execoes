package entities;

public class PessoaJuridica extends Contribuintes {
	
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	@Override
	public Double imposto() {
		Double soma;
		if ( numeroFuncionarios >= 10) {
			
			soma = (rendaAnual *14) /100;
			
		}
		else {
			soma = (rendaAnual *16) /100;
			
		}
		return soma;
	}
	
}

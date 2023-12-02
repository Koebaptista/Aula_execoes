package entities;

public class PessoaFisica extends Contribuintes{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double imposto() {
		
		Double soma;
		
		if(rendaAnual < 20000.00) {
			
			soma = (rendaAnual *15) /100;
		}
		else{
			soma = (rendaAnual *25) /100;
		}
		return soma - (gastosSaude /2);
	}
	
	
	
}


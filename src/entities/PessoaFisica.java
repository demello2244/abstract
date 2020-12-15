package entities;

public class PessoaFisica extends Contribuinte{

	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		if(rendaAnual<20000) {
			return rendaAnual * 0.15-(gastoSaude*0.5);
		}
		else {
			return rendaAnual * 0.25-(gastoSaude*0.5);
		}
	}
	
	
}

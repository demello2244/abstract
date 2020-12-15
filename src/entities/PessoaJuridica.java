package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer nFuncionario;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionario) {
		super(nome, rendaAnual);
		this.nFuncionario = nFuncionario;
	}

	public Integer getnFuncionario() {
		return nFuncionario;
	}

	public void setnFuncionario(Integer nFuncionario) {
		this.nFuncionario = nFuncionario;
	}

	@Override
	public Double imposto() {
		if(nFuncionario <=10) {
			return rendaAnual*0.16;
		}
		else {
			return rendaAnual*0.14;
		}
	}
	
	
}

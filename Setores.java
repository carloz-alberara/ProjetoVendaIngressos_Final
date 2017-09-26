
public class Setores implements IimprimirDados {

	private String tipoSetor;
	private double valorUnitario;
	private int capacidade;
	private String descricaoSetor;

	// Para cadastrar novos Setores. Isso deve ser feito apenas por Admin!

	public void cadastrarSetores(String tipoSetor, double valorUnitario, int capacidade, String descricaoSetor,
			int vagasEstacionamento) {

		this.valorUnitario = valorUnitario;
		this.capacidade = capacidade;
		this.descricaoSetor = descricaoSetor;
		this.tipoSetor = tipoSetor;

		System.out.println("##### Dados Cadastrados com sucesso! #####");

	}

	// Metódo para apenas imprimir todos dos dados cadastrados para um setor
	// cadastrado!
	// Nesse método há o uso de uma Interface;

	public void dadosCadastrados() {

		System.out.println("######## Dados do Setor do Evento ########");
		System.out.println("Tipo do Setor: " + this.tipoSetor + "/nDescrição do Setor: " + this.descricaoSetor
				+ "/nValor do Ingresso para esse setor: " + this.valorUnitario + "/nCapacidade do Setor: "
				+ this.capacidade + "/nDescrição do Ambiente: " + this.descricaoSetor);
	}

	// Cada setor pode possuir uma valor único. Camarote pode ser mais caro que
	// pista. Área VIP pode ser mais cara que Social;

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}

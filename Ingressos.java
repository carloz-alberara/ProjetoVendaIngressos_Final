import java.util.Random;

public class Ingressos implements IimprimirDados {

	private int idIngresso;
	private double valorIngresso;
	private int numeroPoltrona;
	private boolean clientPresent;
	private String dataCompra;
	private String formaPagamento;

	
	// Geradores de números aleatórios para num_poltrona e ID série de ingressos vendidos;
	Random gerarID_Ingresso = new Random();
	Random gerarNumeroPoltrona= new Random();
	
	
	/* public void ingressoVendido(int idIngresso, double valorIngresso, int numeroPoltrona, String dataCompra,
			String formaPagamento, boolean clientPresent) {

		this.idIngresso = idIngresso;
		this.valorIngresso = valorIngresso;
		this.numeroPoltrona = numeroPoltrona;
		this.dataCompra = dataCompra;
		this.formaPagamento = formaPagamento;
		this.clientPresent = clientPresent;

	}
	
	*/

	
	// Verificar dados de um Ingresso adquirido!
	// Nesse método há o uso de uma Interface;
	public void dadosCadastrados() {

		System.out.println("\t######## Dados do Ingresso ########");
		System.out.println("ID do Ingresso " + this.idIngresso + "/nValor total Ingresso: " + this.valorIngresso
				+ "/nNúmero da Poltrona: " + this.numeroPoltrona + "/nData de Realização da Compra: " + this.dataCompra
				+ "/nForma de Pagamento escolhida: " + this.formaPagamento);
	}

	// Para quando desejar-se recolher dados para operações!
	public double getValorIngresso() {
		return this.valorIngresso;
	}

	// Para que quando chamado, o sistema possa dar desconto caso seja a vista e, no
	// cartão, não ter desconto;
	public String getFormaPagamento() {
		return this.formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	// Usar uma função de gerar números aleatórios para inserir um ID aleatório no
	// ingresso;
	public void setIdIngresso(int idIngresso) {
		this.idIngresso = gerarID_Ingresso.nextInt(50);
	}

	// Usar uma função de gerar números aleatórios para inserir um número para
	// poltrona, aleatório;
	public void setNumeroPoltrona(int numeroPoltrona) {
		this.numeroPoltrona = gerarNumeroPoltrona.nextInt(50);
	}

	// Caso o cliente confirme presença, ele deve confirmá-la! 'True' para
	// "Presente" ou 'False' para "Ausente";
	public void setClientPresent(boolean clientPresent) {
		this.clientPresent = clientPresent;
	}

	// Esse método quando chamado, apresentará apenas uma mensagem dizendo se o
	// cliente confirma ou não a sua presença!
	public void getClientPresent() {

		if (this.clientPresent == true)
			System.out.println("/t/t Cliente confirma presença!");
		else
			System.out.print("/t/t Cliente não confirmou presença!");
	}

}

// import java.util.ArrayList;

public class Eventos implements IimprimirDados {

	private String nomeEvento;
	private String tipoEvento;
	private String descricao;
	private String dataRealizacao;
	private String sinopse;
	private String elenco;
	private double valorUnitario;
	private int capacidade;
	private String descricaoAmbiente;
	private int vagasEstacionamento;

	/*
	 * Metodo para Cadastrar, atulizar e editar dados de Eventos!
	 * 
	 * Para realizar um novo cadastro, você precisa inserir, sequencialmente, os
	 * seguintes dados:
	 * 
	 * Eventos nome_evento = new Eventos();
	 * 
	 * nome_evento.cadastrarEvento(nomeEvento, tipoEvento, descricao,
	 * dataRealizacao, sinopse, elenco);
	 *
	 */

	// Cadastrar um novo Evento!

	public void cadastrarEventos(String nomeEvento, String tipoEvento, String descricao,
			String dataRealizacao, String sinopse, String elenco, double valorUnitario,
			int capacidade, String descricaoAmbiente, int vagasEstacionamento) {

		this.nomeEvento = nomeEvento;
		this.tipoEvento = tipoEvento;
		this.descricao = descricao;
		this.dataRealizacao = dataRealizacao;
		this.sinopse = sinopse;
		this.elenco = elenco;
		this.valorUnitario = valorUnitario;
		this.capacidade = capacidade;
		this.descricaoAmbiente = descricaoAmbiente;
		this.vagasEstacionamento = vagasEstacionamento;

	}

	// Verificar dados cadastrados para um Evento;
	// Nesse método há o uso de uma Interface;

	public void dadosCadastrados() {

		System.out.println("######## Dados do Evento ########");
		System.out.println("Nome do evento: " + this.nomeEvento + "/nTipo do Evento: " + this.tipoEvento
				+ "/nDescrição do Evento: " + this.descricao + "/nData de Realização: " + this.dataRealizacao
				+ "/nSinopse: " + this.sinopse + "/nElencoo: " + this.elenco + "/nValor do Ingresso: "
				+ this.valorUnitario + "/nCapacidade do Ambiente: " + this.capacidade + "/nDescrição do Ambiente: "
				+ this.descricaoAmbiente + "/nVagas para estacionamento: " + this.vagasEstacionamento);
	}

	// Métodos opcionais para buscar dados de determinado Evento, como também, o
	// adminstrador poderá fazer modificações futuras!

	public String getNomeEvento() {
		return this.nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	// Alterações e busca por Nome do Evento;
	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	// Alterações e busca por Valor do ingresso para Evento;
	public double getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	// Alterações e busca por Descrição do Evento;
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Alterações e busca por Data de Realização do Evento;
	public String getDataRealizacao() {
		return this.dataRealizacao;
	}

	public void setDataRealizacao(String dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	// Alterações e busca por Sinopse do Evento;
	public String getSinopse() {
		return this.sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	// Alterações e busca por Elenco que compõe o Evento;
	public String getElenco() {
		return this.elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	// Alterações e busca por Capacidade Total do Evento;
	public int getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	// Alterações e busca por Descrição do Ambiente;
	public String getDescricaoAmbiente() {
		return this.descricaoAmbiente;
	}

	public void setDescricaoAmbiente(String descricaoAmbiente) {
		this.descricaoAmbiente = descricaoAmbiente;
	}

	// Alterações e busca por Quantidade de Vagas para Estacionamento;
	public int getVagasEstacionamento() {
		return this.vagasEstacionamento;
	}

	public void setVagasEstacionamento(int vagasEstacionamento) {
		this.vagasEstacionamento = vagasEstacionamento;
	}

}

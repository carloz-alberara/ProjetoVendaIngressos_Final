
public class Eventos implements IimprimirDados{
	
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
	
	
	
	/* Metodo para atulizar ou editar dados de Eventos!
	* 
	* Para realizar um novo cadastro, você precisa inserir, sequencialmente, os seguintes dados: 
	*  
	* Eventos nome_evento = new Eventos();
	* 
	* nome_evento.cadastrarEvento(nomeEvento, tipoEvento, descricao, dataRealizacao, 
	* 							sinopse, elenco);
	*
	*/
	
	public void cadastrarEventos (String nomeEvento, String tipoEvento, String descricao,
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
	
		System.out.println("##### Dados Cadastrados com sucesso! #####");
			
	}
	
	public void dadosCadastrados() {
		
		System.out.println("######## Dados do Evento ########");
		System.out.println("Nome do evento: " + this.nomeEvento + "/nTipo do Evento: "+ this.tipoEvento
							+ "/nDescrição do Evento: " + this.descricao + "/nData de Realização: " + this.dataRealizacao
							+ "/nSinopse: " + this.sinopse + "/nElencoo: " + this.elenco + "/nValor do Ingresso: " + this.valorUnitario
							+ "/nCapacidade do Ambiente: " + this.capacidade + "/nDescrição do Ambiente: " + this.descricaoAmbiente
							+ "/nVagas para estacionamento: " + this.vagasEstacionamento);
	}
	
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getTipoEvento() {
		return tipoEvento;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataRealizacao() {
		return dataRealizacao;
	}
	public void setDataRealizacao(String dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getDescricaoAmbiente() {
		return descricaoAmbiente;
	}

	public void setDescricaoAmbiente(String descricaoAmbiente) {
		this.descricaoAmbiente = descricaoAmbiente;
	}

	public int getVagasEstacionamento() {
		return vagasEstacionamento;
	}

	public void setVagasEstacionamento(int vagasEstacionamento) {
		this.vagasEstacionamento = vagasEstacionamento;
	}
	
}

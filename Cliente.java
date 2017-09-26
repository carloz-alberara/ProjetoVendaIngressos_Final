

public class Cliente extends Pessoa implements IimprimirDados {
	
	/* Metodo para atulizar ou editar dados do Cliente!
	* 
	* Para realizar um novo cadastro, você precisa inserir, sequencialmente, os seguintes dados: 
	*  
	* Cliente cliente 1 = new Cliente();
	* 
	* Cliente1.cadastrarCliente(nome, cpf, email, telefone, 
	* 							datanascimento, endereco, login, senha);
	*
	*/
	
	protected String categoriaCliente;

	
	public Cliente (String nome, String cpf, String email,
			 String telefone, String dataNascimento, String endereco,
			 String login, String senha, String categoriaCliente) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.login = login;
		this.senha = senha;
		this.categoriaCliente = categoriaCliente;
			
	}
	
	
	// Verificar dados cadastrados para cada cliente 
	// Nesse método há o uso de uma Interface;
	public void dadosCadastrados() {
		
		System.out.println("######## Seus Dados Pessoais ########");
		System.out.println("Nome: " + this.nome + "/nCPF: "+ this.cpf + "/nE-mail: " + this.email
							+ "/nTelefone: " + this.telefone + "/nData de Nascimento: " + this.dataNascimento
							+ "/nEndereço: " + this.endereco + "/nUser: " + this.login + "/nSenha: *****");
	}

	
	// O cliente precisa dizer se ele é estudante, idoso ou nenhum desses;
	public String getCategoriaCliente() {
		return this.categoriaCliente;
	}

	public void setCategoriaCliente(String categoriaCliente) {
		this.categoriaCliente = categoriaCliente;
	}

}


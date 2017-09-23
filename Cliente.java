

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

	
	public Cliente (String myName, String cpfNum, String endMail,
			 String phone, String dataNasc, String endress,
			 String user, String key, String categoriaCliente) {
		
		this.nome = myName;
		this.cpf = cpfNum;
		this.email = endMail;
		this.telefone = phone;
		this.dataNascimento = dataNasc;
		this.endereco = endress;
		this.login = user;
		this.senha = key;
		this.categoriaCliente = categoriaCliente;
		
	
		System.out.println("##### Dados Cadastrados com sucesso! #####");
			
	}
	
	// Verificar dados cadastrados para cada cliente 
	// Nesse método há o uso de uma Interface;
	
	
	public void dadosCadastrados() {
		
		System.out.println("######## Seus Dados Pessoais ########");
		System.out.println("Nome: " + this.nome + "/nCPF: "+ this.cpf + "/nE-mail: " + this.email
							+ "/nTelefone: " + this.telefone + "/nData de Nascimento: " + this.dataNascimento
							+ "/nEndereço: " + this.endereco + "/nUser: " + this.login + "/nSenha: *****");
	}

	
	public String getCategoriaCliente() {
		return categoriaCliente;
	}

	public void setCategoriaCliente(String categoriaCliente) {
		this.categoriaCliente = categoriaCliente;
	}

}


// import java.util.ArrayList;

public class Administrador extends Pessoa implements IimprimirDados {

	/*
	 * Metodo para atulizar ou editar dados do Administrador!
	 * 
	 * Para realizar um novo cadastro, você precisa inserir, sequencialmente, os
	 * seguintes dados:
	 * 
	 * Administrador admin = new Administrador();
	 * 
	 * admin.cadastrarAdministrador(nome, cpf, email, telefone, datanascimento,
	 * endereco, login, senha);
	 *
	 */

	public Administrador(String nome, String cpf, String email, String telefone, String dataNascimento, String endereco,
			String login, String senha) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.login = login;
		this.senha = senha;
		this.acessAdmin = true; // Testar para ver se é o admin!

	}

	// Verificar dados cadastrados para um Administrador
	// Nesse método há o uso de uma Interface;
	public void dadosCadastrados() {

		System.out.println("######## Seus Dados Pessoais ########");
		System.out.println("Nome: " + this.nome + "/nCPF: " + this.cpf + "/nE-mail: " + this.email + "/nTelefone: "
				+ this.telefone + "/nData de Nascimento: " + this.dataNascimento + "/nEndereço: " + this.endereco
				+ "/nUser: " + this.login + "/nSenha: *****");
	}

	// Será que posso inserir esse método dessa forma e nessa classe?

	/*
	 * public void inserirEventos(ArrayList<Eventos> listaEventos, Eventos
	 * eventoAdcionado) {
	 * 
	 * listaEventos.add(eventoAdcionado); }
	 * 
	 */

}

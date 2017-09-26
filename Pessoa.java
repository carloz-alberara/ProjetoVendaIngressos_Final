

 // Classe Mãe para as classes filhas Cliente e Administrador! Uso de Herança!
public class Pessoa {
	
	protected String login;
	protected String senha;
	protected String nome;
	protected String cpf;
	protected String email;
	protected String endereco;
	protected String dataNascimento;
	protected String telefone;
	protected boolean acessAdmin;

	
	public String getLogin() {
		return this.login;
	}
		
	public void setLogin(String login) {
		this.login = login;
		System.out.println("Login alterado com Sucesso!");
		System.out.println("Seu novo login foi alterado para: " + this.login);
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
		System.out.println("Senha alterada com Sucesso!");
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Seu nome foi alterado com Sucesso!");
		System.out.println("Seu nome foi alterado para: " + this.nome);
	}
		
	public String getCpf() {
		return this.cpf;
	}	
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
		System.out.println("E-mail alterado com Sucesso!");
		System.out.println("Seu E-mail foi alterado para: " + this.email);
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
		System.out.println("Endereço alterado com Sucesso!");
		System.out.println("O seu endereço foi alterado para: " + this.endereco);
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
		System.out.println("Número de telefone alterado com Sucesso!");
		System.out.println("O seu contato telefônico foi alterado para: " + this.telefone);
	}
	
	public boolean isAdmnin() {
		return this.acessAdmin;
	}

}

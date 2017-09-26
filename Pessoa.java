

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
		return login;
	}
		
	public void setLogin(String user) {
		this.login = user;
		System.out.println("Login alterado com Sucesso!");
		System.out.println("Seu novo login foi alterado para: " + this.login);
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String key) {
		this.login = key;
		System.out.println("Senha alterada com Sucesso!");
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String myName) {
		this.nome = myName;
		System.out.println("Seu nome foi alterado com Sucesso!");
		System.out.println("Seu nome foi alterado para: " + this.nome);
	}
		
	public String getCpf() {
		return cpf;
	}	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String endMail) {
		this.email = endMail;
		System.out.println("E-mail alterado com Sucesso!");
		System.out.println("Seu E-mail foi alterado para: " + this.email);
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endress) {
		this.endereco = endress;
		System.out.println("Endereço alterado com Sucesso!");
		System.out.println("O seu endereço foi alterado para: " + this.endereco);
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String phone) {
		this.telefone = phone;
		System.out.println("Número de telefone alterado com Sucesso!");
		System.out.println("O seu contato telefônico foi alterado para: " + this.telefone);
	}
	
	public boolean isAdmnin() {
		return this.acessAdmin;
	}

}

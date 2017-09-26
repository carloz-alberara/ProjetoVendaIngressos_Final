import java.util.ArrayList;
import java.util.Iterator;



public class Sistema {

	private ArrayList<Cliente> listaClientes;
	private ArrayList<Eventos> listaEventos;
	private ArrayList<Ingressos> listaIngressos;
	private ArrayList<Setores> listaSetores;
	private Administrador Admin1;
	

	// Para buscar elementos: private ArrayList<Cliente> listaCliente;

	public Sistema() {

		// Construtores

		this.listaClientes = new ArrayList<>();
		this.listaEventos = new ArrayList<>();
		this.listaIngressos = new ArrayList<>();
		this.listaSetores = new ArrayList<>();
		
		// this.admin = new Administrador(null, null, null, null, null, null, null,
		// null);

	}

	/* %%%%%%%%%%%%%%%%% MÉTODOS DO SISTEMA %%%%%%%%%%%%%%%%%% */

	// Adciona-se apenas um único administrador;
	public void adcUnicoAdmin(Administrador admin) {
		this.Admin1 = admin;
		System.out.println("##### Dados Cadastrados com sucesso! #####");
	}

	// Pode adcionar-se 'n' clientes;
	public void adcionarClientes(Cliente cliente) {
		this.listaClientes.add(cliente);
		System.out.println("##### Dados Cadastrados com sucesso! #####");
	}

	// Quando um ingresso for adquirido;
	public void ingressosAdquiridos(Ingressos ticket) {
		this.listaIngressos.add(ticket);
		System.out.println("\t##### Ingresso Gerado. Obrigado pela compra! #####");;
	}

	// Para administrador poder adcionar Eventos;
	public void adcionarEventos(Eventos eventos) {
		this.listaEventos.add(eventos);
		System.out.println("##### Dados Cadastrados com sucesso! #####");
	}

	// Para administrador poder adcionar Setores que compõe o Evento;
	public void adicionarSetor(Setores typeSetor) {
		this.listaSetores.add(typeSetor);
		System.out.println("##### Dados Cadastrados com sucesso! #####");
	}

	/*
	 * %%%%%%%%%%%%%%%% MÉTODOS GRÁFICOS PARA INTERFACE DO SISTEMA %%%%%%%%%%%%%%%%%%
	 */

	// Random  = new Random();

	// Página inicial do sistema (Opçoes disponíveis);
	public void menuInicializaSistema() {

		System.out.println("\t******** SISTEMA DE VENDAS DE INGRESSOS *********/n/n/n");
		System.out.println("\tDigite uma das opções: ");
		System.out.println("\t(1) Cadastro de usuários");
		System.out.println("\t(2) Procurar por Eventos");
		System.out.println("\t(3) Fazer Login");
		System.out.println("\t(0) Sair");

	}

	/* %%%%%%%%%%%%%%%%%%% Menus para Cliente %%%%%%%%%%%%%%%%%%%%%%%% */

	// Menu para Clientes, após login:
	public void menuClientes() {

		System.out.println("\t**************************************************\n");
		System.out.println("\t\t****** SEJA MUITO BEM-VINDO, *******");
		System.out.println("\t**************************************************\n");
		System.out.println("\t(1) Buscar evento");
		System.out.println("\t(2) Comprar Ingresso");
		System.out.println("\t(3) Fazer Pagamento");
		System.out.println("\t(4) Alterar meus dados pessoais");
		System.out.println("\t(0) Sair do menu");

	}

	// Menu que aparece para o cliente quando deseja-se modificar dados pessoais;
	public void menuAlterDadosCliente() {

		System.out.println("\t**************************************************\n");
		System.out.println("\t\t****** ALTERAÇÃO DE DADOS PARA CLIENTES **********");
		System.out.println("\t**************************************************\n");
		System.out.println("\t(1) Alterar Nome");
		System.out.println("\t(2) Alterar Contato Telefônico");
		System.out.println("\t(3) Alterar E-mail");
		System.out.println("\t(4) Alterar Senha de acesso");
		System.out.println("\t(0) Sair do Menu");

	}

	// solicitando se o cliente deseja comprar ingresso;
	public void menuComprarIngresso() {

		System.out.println("\t**************************************************\n");
		System.out.println("\t\t****** COMPRA DE INGRESSOS POR CLIENTES ********");
		System.out.println("\t**************************************************\n");
		System.out.println("\t(1) Deseja compra ingresso a vista? Tem 5% de desconto!");
		System.out.println("\t(2) Deseja compra ingresso no cartão Não há descontos!");
		System.out.println("\t(3) Digite essa opção se você for Idoso (Gratuidade)!");		
		System.out.println("\t(4) Digite essa opção se você for Estudante (50% de desconto)!");
		System.out.println("\t(0) Sair do Menu");
		
	}

	// Menu que aparece para Clientes para que possam ver os eventos disponíveis;
	// Somente essas categorias serão adicionadas;
	public void menuEventos() {

		System.out.println("\n\t*************************************************\n");
		System.out.println("\t\t**** EVENTOS OFERTADOS **** \n");
		System.out.println("\t***************************************************\n");
		System.out.println("\t(1) Esporte");
		System.out.println("\t(2) Filme");
		System.out.println("\t(3) Peça");
		System.out.println("\t(4) Show");
		System.out.println("\t(0) Sair do Menu");

	}

	// Menu para escolha do Setor;
	public void menuSetor() {

		System.out.println("\n\t*************************************************\n");
		System.out.println("\t\t**** SETORES OFERTADOS **** \n");
		System.out.println("\t***************************************************\n");
		System.out.println("\t(1) Pista");
		System.out.println("\t(2) Área VIP");
		System.out.println("\t(3) Camarote");
		System.out.println("\t(4) Social");
		System.out.println("\t(0) Sair do Menu");

	}

	/*
	 * %%%%%%%%%%%%%%%%%%%% MENUS PARA ADMINISTRADOR DO SISTEMA %%%%%%%%%%%%%%%%%%%%%%
	*/

	// Menu para Administrador, após login:
	public void menuAdmin() {
		System.out.println("\t**************************************************\n");
		System.out.println("\t\t****** Acesso privilegiado ao Administrador	********");
		System.out.println("\t**************************************************\n");
		System.out.println("\t(1) Cadastrar evento");
		System.out.println("\t(2) Buscar evento");
		System.out.println("\t(3) Alterar meus dados pessoais");
		System.out.println("\t(4) Retirar Eventos");
		System.out.println("\t(0) Sair do menu");

	}

	// Menu para Administrador, após login:
	void menuAlterarDadosEventos() {
       	System.out.println("\t**************************************************\n");
       	System.out.println("\t\t****** Acesso privilegiado ao Administrador ********");
       	System.out.println("\t\t****** ALTERAÇÃO DE DADOS DE UM EVENTO ********");
       	System.out.println("\t**************************************************\n");
    	System.out.println("\t(1) Alterar Nome");
    	System.out.println("\t(2) Alterar data De Realizacao");
    	System.out.println("\t(3) Alterar Horário");
    	System.out.println("\t(4) Alterar Endereço");
    	System.out.println("\t(0) Voltar");
    	
	}

	
	// Verificando se o 'login' e 'senha' para um cliente informado é igual ao 'login' e 'senha' que foram cadastrados; 
	public boolean autenticarAcessoCliente(String login, String senha) {
       	System.out.println(" Aguarde, login sendo autenticado....");

       	for(Cliente client : listaClientes) {
       		if(client.getLogin().equals(login) && client.getSenha().equals(senha)) {
       			return true; }
       	}
       	return false;
    }

	
	
	// Verificando se o 'login' e 'senha' para o Administrador cadastrado se é igual ao login e senha que foram cadastrados; 
	public boolean autenticarAcessoAdmin(String login, String senha) {
       	System.out.println(" Aguarde, login sendo autenticado....");

       		if(Admin1.getLogin().equals(login) && Admin1.getSenha().equals(senha)) {
       			return true; }
       		else {
       	       	return false;
       		}
    }
	
	
	public void procurarEvento(String nameEvent, String date) {
       	System.out.println(" Aguarde, Evento sendo procurado....");

       	for(Eventos eventos : listaEventos) {
       		if(eventos.getNomeEvento().equals(nameEvent) && eventos.getDataRealizacao().equals(date)) {
       	       	System.out.println("Evento " + eventos.getNomeEvento() + " encontrado para a data escolhida!"); }
       		else {
       			System.out.println("Evento " + eventos.getNomeEvento() + " não encontrado devido a data ou nome escolhidos não estarem no sistema. Desculpe!"); }	
       	}  	
    }
	
	
	public void procurarSetor(String namesetor) {
       	System.out.println(" Aguarde, Setor sendo procurado....");

       	for(Setores setor : listaSetores) {
       		if(setor.getTipoSetor().equals(namesetor)) {
       	       	System.out.println("Setor " + setor.getTipoSetor() + " foi encontrado!"); }
       		else {
       			System.out.println("Evento " + setor.getTipoSetor() + " não foi encontrado devido ao nome do setor escolhido não estar no sistema. Desculpe!"); }	
       	}
    }


}

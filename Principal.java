
import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		int opcao = 10;

		// Instaciando um novo sistema!
		Sistema SistemaExec = new Sistema();
		
		// Gerador de identificadores únicos para poltronas e ID de ingressos;
		Random gerarID_Ingresso = new Random();
		Random gerarNumeroPoltrona = new Random();
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		// Mensagem de Boa-Vindas!
		System.out.println("\t############# SISTEMA PARA VENDAS DE INGRESSOS PARA DIVERSOS EVENTOS ###############\n");

		
		// Único Administrador para o Sistema!
		Administrador AdminUnico = new Administrador("Carlos", "1001144", "cajjfjsosisi", "47885544777", "25/07/2014",
				"Gerkdjsjdhfe, 45", "carlos", "123456");
		SistemaExec.adcUnicoAdmin(AdminUnico);
		
		// ticket(int Random, double valor_ingresso, int Random, String dataCompra, int formaPagam, boolean ClienteEstevePresente)
		Ingressos ticket1 = new Ingressos(gerarID_Ingresso.nextInt(50), 50.00, gerarNumeroPoltrona.nextInt(50), "26/09/2017", 1, true);
		
		Cliente client1 = new Cliente("Tesla", "1001144", "cajjfjsosisi", "47885544777", "25/07/2014","Gerkdjsjdhfe, 45", "tesla", "123456", "estudante");
		
		
		
		
		SistemaExec.menuClientes();
		opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			SistemaExec.adcionarClientes(client1);
			break;

		case 2:
			SistemaExec.procurarEvento("sabadao", "21/07/2017");
			break;

		case 3:
			SistemaExec.autenticarAcessoCliente("tesla", "123456");
			break;

		default:
			System.out.println("\t Você resolveu sair do sistema! ");
			System.exit(0);
		}
		
		
		

	}

}

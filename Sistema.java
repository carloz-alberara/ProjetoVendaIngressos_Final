
import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {
	
	private ArrayList<Cliente> listaCliente;
	private ArrayList<Eventos> listaEventos;
	private Administrador admin0;
	
	Scanner digt;
	
	public Sistema() {
		
		//this.listacliente.get(int INDEX).dadosCadastrados();
		this.listaCliente = new ArrayList<>();
		this.listaEventos = new ArrayList<>();
	
		this.digt = new Scanner(System.in);
	}
	
	
	public void adcUnicoAdmin(Administrador admin) {
		this.Admin0 = admin;
	}
	
	
	public void adcionarClientes(Cliente cliente) {
		this.listaCliente.add(cliente);
	}
		
	
	
	Administrador Admin0 = new Administrador("Carlos", "1001144", "cajjfjsosisi", 
			"47885544777", "25/07/2014", "Gerkdjsjdhfe 45", "gagal", "123456");
	
	
	Administrador Admin0 = new Administrador("Carlos", "1001144", "cajjfjsosisi", 
			"47885544777", "25/07/2014", "Gerkdjsjdhfe 45", "gagal", "123456");
	
	
	
	
	
	
	
	
	
	}



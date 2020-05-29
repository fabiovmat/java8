package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0; //metodo de classe ...utilizacao do nome da classe 'opcional'
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();//objeto carro
		carro1.setAno(2020);
		carro1.setCor("preto");
		carro1.setFabricante("Audi");
		carro1.setModelo("TT");
		carro1.setPlaca("43343");
		carro1.setIdcarro(01);
		carro1.setValorDiaria(200.00f);
		totalCarros = totalCarros +1;
		
		Cliente cliente1 = new Cliente();//objeto cliente
		cliente1.setIdCliente(01);
		cliente1.setCnh("434343");
		cliente1.setNome("Fabio Matt");
		cliente1.setCpf("999.999.999-xx");
		
		
		
		//Cliente cliente2 = new Cliente();//objeto cliente2
		//Carro carro2 = new Carro();//objeto carro2
		SisalucarApp sisalucarApp = new SisalucarApp();
		sisalucarApp.realizarLocacao(carro1.getIdcarro(), cliente1.getIdCliente(), carro1.getValorDiaria());
		
		

		
	}
	
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		
		Locacao locacao = new Locacao();
		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setIdLocacao(1);
		locacao.setDatainicial(LocalDate.now());
		locacao.setDatafinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * 99.90f);
		
	} 
	
	public static void gerarRelatorioLocacao(LocalDate ...datas ) { /*usando varargs*/
		
		
		float totalFaturado = 2 * 99.90f;
		System.out.println(totalFaturado);
		
		
		
		
	}
	
	
	

}

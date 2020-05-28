package unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();//objeto carro
		carro1.ano = 2020;
		carro1.cor = "preto";
		carro1.fabricante = "Audi";
		carro1.modelo = "TT";
		carro1.placa = "43343";
		carro1.idcarro = 01;
		carro1.valorDiaria = 200.00f;
		
		Cliente cliente1 = new Cliente();//objeto cliente
		cliente1.idCliente = 01;
		cliente1.cnh = "434343";
		cliente1.nome = "Fabio Matt";
		cliente1.cpf = "999.999.999-xx";
		
		
		
		//Cliente cliente2 = new Cliente();//objeto cliente2
		//Carro carro2 = new Carro();//objeto carro2
		

		

		
	}
	
	public void realizarLocacao(long idCarro, long idCliente) {
		
		Locacao locacao = new Locacao();
		locacao.idCarro = idCarro;
		locacao.idCliente = idCliente;
		locacao.idLocacao = 1;
		locacao.datainicial = LocalDate.now();
		locacao.datafinal = LocalDate.now().plusDays(2);
		locacao.valorLocado = 2 * 99.90f;
		
	} 
	
	public void gerarRelatorioLocacao(LocalDate ...datas ) { /*usando varargs*/
		
		
		float totalFaturado = 2 * 99.90f;
		System.out.println(totalFaturado);
		
		
		
		
	}
	
	
	

}

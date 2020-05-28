package unidade3.sisalucar;

public class Carro {

	long idcarro;
	String placa;
	String fabricante;
	String modelo;
	int ano;
	String cor;
	float valorDiaria;
	Revendedor revendedor;
	
	
	public Carro(long idcarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria) {
		super();//chama construtor da superclasse
		this.idcarro = idcarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
	}
		public Carro(long idcarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria,
			Revendedor revendedor) {
		super();
		this.idcarro = idcarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
		this.revendedor = revendedor;
	}
		public Carro() {
			
		}
	
	
		public static void main(String[] args) {
			Carro carro3 = new Carro(1,"ABC-2001", "Volks", "GOL", 2001,"Prata", 190f,Revendedor.ABCVEICULOS);
			System.out.println(carro3);
			
			
			
		}
}

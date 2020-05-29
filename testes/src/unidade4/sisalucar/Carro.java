package unidade4.sisalucar;

public class Carro {

	private long idcarro;
	private String placa;
	private String fabricante;
	private String modelo;
	private int ano;
	private String cor;
	private float valorDiaria;
	private Revendedor revendedor;
	
	
	
	
	
	
	public long getIdcarro() {
		return idcarro;
	}
	public void setIdcarro(long idcarro) {
		this.idcarro = idcarro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public Revendedor getRevendedor() {
		return revendedor;
	}
	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}
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

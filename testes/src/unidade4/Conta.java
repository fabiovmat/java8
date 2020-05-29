package unidade4;

public class Conta {

	//atributos
	private int numero ;
	private double saldo;
	private double limite;
	private String nome;
	
	//metodos
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean saca(double valor) {
		
		if (valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Saque realizado");
			return true;
					}else {
						System.out.println("Nao conseguiu realizar o saque!");
						return false;
					}
	}
	
	public void deposita(double valor) {
		
		saldo = saldo + valor;
	}
	
	//utilizando passagem por referencia
	public void transfere(Conta destino, double valor){
		
		if (valor <= saldo) {
		
		this.saldo = this.saldo - valor;
		destino.deposita(valor);
		System.out.println("Deposito de " +valor+ "efetuado com sucesso");
			
		}else {
			
			System.out.println("Nao foi possivel realizar a transferencia");
		}	
		
	}
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.transfere(conta2, 50);
		
		
	}
	
	
	
}

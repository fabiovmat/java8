package unidade4.sisalucar;

public enum Revendedor {
	
	ABCVEICULOS("101010/0001","Rua XXX, 10","Voolkswagen"), 
	SIMAOVEICULOS("010101/0002","Av. Morumbi 2500","Honda"), 
	EMANUELVEICULOS("1111111/0001","Av. das Nacoes 100","Toyota");
	
	String cnpj;
	String endereco;
	String fabricante;
	private Revendedor(String cnpj, String endereco, String fabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}
	
	
	
	

}

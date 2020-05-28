package unidade3.sisalucar;

import java.time.LocalDate;

public class Locacao {

	long idLocacao;
	long idCarro;
	long idCliente;
	float valorLocado;
	LocalDate datainicial;
	LocalDate datafinal;
	public Locacao(long idLocacao, long idCarro, long idCliente, float valorLocado, LocalDate datainicial,
			LocalDate datafinal) {
		super();
		this.idLocacao = idLocacao;
		this.idCarro = idCarro;
		this.idCliente = idCliente;
		this.valorLocado = valorLocado;
		this.datainicial = datainicial;
		this.datafinal = datafinal;
	}
	
	public Locacao(){
		
	}
	
}

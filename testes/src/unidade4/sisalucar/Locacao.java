package unidade4.sisalucar;

import java.time.LocalDate;

public class Locacao {

	private long idLocacao;
	private long idCarro;
	private long idCliente;
	private float valorLocado;
	private LocalDate datainicial;
	private LocalDate datafinal;
	
	
	
	public long getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(long idLocacao) {
		this.idLocacao = idLocacao;
	}

	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public float getValorLocado() {
		return valorLocado;
	}

	public void setValorLocado(float valorLocado) {
		this.valorLocado = valorLocado;
	}

	public LocalDate getDatainicial() {
		return datainicial;
	}

	public void setDatainicial(LocalDate datainicial) {
		this.datainicial = datainicial;
	}

	public LocalDate getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}

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

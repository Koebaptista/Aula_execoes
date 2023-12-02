package entities;

import java.time.LocalDate;

public class Contrato_hora {
	private LocalDate data;
	private Double valor_hora;
	private Integer horas;
	 
	public Contrato_hora(){
		
	}
	
	public Contrato_hora(LocalDate data, Double valor_hora, Integer horas) {
		this.data = data;
		this.valor_hora = valor_hora;
		this.horas = horas;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(Double valor_hora) {
		this.valor_hora = valor_hora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double valor_Total() {
		double soma = valor_hora * horas;
		
		return soma;
	}
	
	
	
}


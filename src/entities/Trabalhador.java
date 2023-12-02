package entities;

import java.util.List;
import java.util.ArrayList;
import entities.Departamento;
import entities.Contrato_hora;
import entities.enums.Worker_Level;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trabalhador {
	private String nome;
	private Worker_Level level;
	private Double salario_base;
	
	private Departamento depart;
	private List<Contrato_hora> lista = new ArrayList<>(); 
	
	public Trabalhador() {
		
	}
	public Trabalhador(String nome, Worker_Level level, Double salario_base, Departamento depart) {
		this.nome = nome;
		this.level = level;
		this.salario_base = salario_base;
		this.depart = depart;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Worker_Level getLevel() {
		return level;
	}
	public void setLevel(Worker_Level level) {
		this.level = level;
	}
	public Double getSalario_base() {
		return salario_base;
	}
	public void setSalario_base(Double salario_base) {
		this.salario_base = salario_base;
	}
	public Departamento getDepart() {
		return depart;
	}
	public void setDepart(Departamento depart) {
		this.depart = depart;
	}
	public List<Contrato_hora> getLista() {
		return lista;
	}
	public void AddContract(Contrato_hora contract) {
		
		lista.add(contract);
	}
	
	public void removeContract(Contrato_hora contract) {
		
		lista.remove(contract);
	}
	
	public Double income(Integer ano, Integer mes) {
		double soma = salario_base;
		for(Contrato_hora x : lista) {
			
			if(x.getData().getYear() == ano && x.getData().getMonthValue() == mes) {
				soma +=  x.valor_Total();
			}
		}	
		return soma;
	}
	
}

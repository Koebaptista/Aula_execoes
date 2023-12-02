package entities;

import java.util.Date;
import entities.enums.Order_Status;

public class Pedido {
	
	private Integer id;
	private Date moment;
	private Order_Status status;


public Pedido() {
	
}
public Pedido(int id, Date moment, Order_Status status){
	
	this.id = id;
	this.moment = moment;
	this.status = status;
}

public Integer getId() {
	return this.id;
}
public void setId(int id) {
	this.id = id;
}
public Date getMoment() {
	return this.moment;
}
public void setMoment(Date moment) {
	this.moment = moment;
}
public Order_Status getStatus() {
	return status;
}
public void setStatus(Order_Status status) {
	this.status = status;
}
public String toString() {
	return "Pedido [id=" + id + ", moment=" + moment + ", status=" + status + "]";
}


	
	
}



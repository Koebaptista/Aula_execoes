package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus_1;

public class Order {
	private LocalDateTime date;
	private OrderStatus_1 status;
	
	private Client client;
	private List<OrderItem> orderItem_List = new ArrayList<>();
	
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Order() {
		
	}
	public Order(LocalDateTime date, OrderStatus_1 status, Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public OrderStatus_1 getStatus() {
		return status;
	}
	public void setStatus(OrderStatus_1 status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrderItem> getOrder_Item_list() {
		return orderItem_List;
	}
	
	public void addItem(OrderItem item) {
		orderItem_List.add(item);
	}
	
	public void removeItem(OrderItem item) {
	orderItem_List.remove(item);
}
	public Double Total() {
		Double soma = 0.0;
		for (OrderItem x : orderItem_List) {
			soma += x.subTotal();
		}
		return soma; 
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("order moment: ");
		sb.append(date.format(fmt1) + "\n");
		sb.append("Order status:"+ status +"\n");
		sb.append("Client: " + client.getName());
		sb.append(" " + client.getEmail() + " - " + client.getDate().format(fmt2) + "\n");
		sb.append("Order items:\n");
		
		for (OrderItem x : orderItem_List) {
			sb.append(x.toString2() + "\n");
		}
		sb.append("Total price:" + "$" +String.format("%.2f", Total()));
		
		return sb.toString();
		
		
		
		
	}
	

}

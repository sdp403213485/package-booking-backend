package tws.entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class OrderForm {
	private String orderNumber;
	private String reciverName;
	private String reciverTel;
	private String weight;
	private String status;
	private String orderTime;
	
	public OrderForm() {
		super();
	}
	public OrderForm( String orderNumber, String reciverName, String reciverTel, String weight, String status,
			String orderTime) {
		super();
		this.orderNumber = orderNumber;
		this.reciverName = reciverName;
		this.reciverTel = reciverTel;
		this.weight = weight;
		this.status = status;
		this.orderTime = orderTime;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getReciverName() {
		return reciverName;
	}
	public void setReciverName(String reciverName) {
		this.reciverName = reciverName;
	}
	public String getReciverTel() {
		return reciverTel;
	}
	public void setReciverTel(String reciverTel) {
		this.reciverTel = reciverTel;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	
	
	
}



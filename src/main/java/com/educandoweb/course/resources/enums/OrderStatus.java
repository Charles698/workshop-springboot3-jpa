package com.educandoweb.course.resources.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	// Atributo do código enum
	private int code;
	
	// Construtor com código enum
	private OrderStatus(int code) {
		this.code = code;
	}
	
	// Método para pegar o código enum
	public int getCode() {
		return code;
	}
	
	// Método estático para converter código enum em String
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalAccessError("Invalid OrderStatus code");
	}
}

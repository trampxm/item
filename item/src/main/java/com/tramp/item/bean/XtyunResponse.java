package com.tramp.item.bean;

public class XtyunResponse {
	
	private String message;
	private String status;
	private Object data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "XtyunResponse [message=" + message + ", status=" + status + ", data=" + data + "]";
	}
	
}

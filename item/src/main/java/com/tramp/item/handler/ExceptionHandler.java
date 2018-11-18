package com.tramp.item.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tramp.item.bean.XtyunResponse;

@ControllerAdvice
public class ExceptionHandler {

	@ResponseBody
	@org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
		XtyunResponse xtyunResponse = new XtyunResponse();
		
		e.printStackTrace();
		xtyunResponse.setMessage("error:" + e.getMessage());
		xtyunResponse.setStatus("500");
		return xtyunResponse;
	}
	
}

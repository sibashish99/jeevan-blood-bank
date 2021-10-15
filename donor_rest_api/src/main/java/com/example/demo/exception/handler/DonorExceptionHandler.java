package com.example.demo.exception.handler;

import java.time.LocalDateTime;

import org.springframework.web.context.request.WebRequest;

import com.example.demo.exception.DonorErrorHandler;

public class DonorExceptionHandler {
	
	public DonorErrorHandler handleAllEXceptions(Exception ex,WebRequest req) {
		return new DonorErrorHandler(LocalDateTime.now(),ex.getMessage(),req.getDescription(false));
	}

}

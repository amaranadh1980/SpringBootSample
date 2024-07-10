package com.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomException {
	@ExceptionHandler(ServletRequestBindingException.class)
	public ResponseEntity<Object> handleHeaderException(Exception ex,WebRequest req){
		List<String> details= new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse res= new ErrorResponse("OOPS....header is missing", details);
		return new ResponseEntity(res,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception ex,WebRequest req){
		List<String> details= new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse res= new ErrorResponse("Server error found", details);
		return new ResponseEntity(res,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
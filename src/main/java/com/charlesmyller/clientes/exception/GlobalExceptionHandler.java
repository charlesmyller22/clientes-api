// Class to handle exception Globally
package com.charlesmyller.clientes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NoSuchElementFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse handleException(NoSuchElementFoundException ex) {
		return new ErrorResponse(
			HttpStatus.NOT_FOUND.value(), ex.getMessage());
	}

	@ExceptionHandler(value = CustomerAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex) {
		return new ErrorResponse(HttpStatus.CONFLICT.value(),
				ex.getMessage());
	}
}

package me.dio.controller.exception;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	private final Logger logger  = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handle(IllegalArgumentException rulesException) {
		 return new ResponseEntity<>(rulesException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handle(NoSuchElementException rulesException) {
		 return new ResponseEntity<>("ID não encontrado", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> handle(Throwable rulesException) {
		logger.error("Erro inesperado, veja os logs", rulesException);
		 return new ResponseEntity<>("Erro Inesperado no Servidor", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

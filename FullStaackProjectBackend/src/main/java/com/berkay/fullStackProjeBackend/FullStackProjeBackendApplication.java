package com.berkay.fullStackProjeBackend;

import com.berkay.fullStackProjeBackend.core.exceptions.types.UnauthorizedException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@SpringBootApplication
@RestControllerAdvice
public class FullStackProjeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackProjeBackendApplication.class, args);
	}

	@ExceptionHandler({ UnauthorizedException.class})
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public String handleException(UnauthorizedException exception) {
		return "Unauthorized";
	}

	@ExceptionHandler({ResponseStatusException.class})
	public String handle(ResponseStatusException ex){
		return "Unauthorized";
	}
}

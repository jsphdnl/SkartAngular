package com.spinhighq.skart.exceptions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.RequestAttributes;



/**
 * 
 * @author bharath
 * 
 */

@Configuration
@ControllerAdvice
public class GlobalExceptionHandler {

	private long currentTime = System.currentTimeMillis();

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NotFoundException.class)
	@ResponseBody
	ErrorInfo handleNotFound(HttpServletRequest req, NotFoundException ex) {

		return new ErrorInfo(currentTime, "Not Found",
				HttpStatus.NOT_FOUND.value(), ex.getMessage(),
				req.getRequestURI());
	}

	/*@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(UnauthorizedException.class)
	@ResponseBody
	ErrorInfo handleUnauthorized(HttpServletRequest req,
			UnauthorizedException ex) {

		return new ErrorInfo(currentTime, "Unauthorized",
				HttpStatus.UNAUTHORIZED.value(), ex.getMessage(),
				req.getRequestURI());
	}

	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler(DuplicateException.class)
	@ResponseBody
	ErrorInfo handleDuplicate(HttpServletRequest req, DuplicateException ex) {

		return new ErrorInfo(currentTime, "Duplicate",
				HttpStatus.METHOD_NOT_ALLOWED.value(), ex.getMessage(),
				req.getRequestURI());
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BadRequestException.class)
	@ResponseBody
	ErrorInfo handleBadRequest(HttpServletRequest req, BadRequestException ex) {

		return new ErrorInfo(currentTime, "BadRequest",
				HttpStatus.BAD_REQUEST.value(), ex.getMessage(),
				req.getRequestURI());
	}*/

	/* Customize Spring boot Built-in Error Messages */
	@Bean
	public ErrorAttributes errorAttributes() {
		return new DefaultErrorAttributes() {
			@Override
			public Map<String, Object> getErrorAttributes(
					RequestAttributes requestAttributes,
					boolean includeStackTrace) {
				Map<String, Object> errorAttributes = super.getErrorAttributes(
						requestAttributes, includeStackTrace);
				errorAttributes.keySet().remove("exception");

				return errorAttributes;
			}

		};
	}

}

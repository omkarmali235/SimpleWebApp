package com.omkar.simpleWebApp;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.omkar.simpleWebApp.model.Product;

@Aspect
@Component //dealing with cross platform concerns 
public class AspectLogging {

	private static final Logger LOGGER = LoggerFactory.getLogger(AspectLogging.class);
	@Before("execution (public * com.omkar.simpleWebApp.service.ProductService.getProducts())")
	public void logBefore() {
		LOGGER.info("logging get before request");
	}
	
	@After("execution (public * com.omkar.simpleWebApp.service.ProductService.getProducts())")
	public void logAfter() {
		LOGGER.info("logging get after request");
	}
	
	@AfterReturning("execution (public * com.omkar.simpleWebApp.service.ProductService.getProducts())")
	public void logAfterReturning() {
		LOGGER.info("logging get after returning request");
	}
	@AfterThrowing("execution (public * com.omkar.simpleWebApp.service.ProductService.getProducts())")
	public void logAfterThrowing() {
		LOGGER.info("logging get after throwing request");
	}
}

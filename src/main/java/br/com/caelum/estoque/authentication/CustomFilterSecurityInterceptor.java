package br.com.caelum.estoque.authentication;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

public class CustomFilterSecurityInterceptor extends FilterSecurityInterceptor {

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	}
}

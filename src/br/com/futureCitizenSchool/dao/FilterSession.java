package br.com.futureCitizenSchool.dao;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterSession {
	private boolean initFilterExceptions;

	public FilterSession(boolean initFilterExceptions) {

		this.initFilterExceptions = initFilterExceptions;
	}

	public boolean isInitFilterExceptions() {
		return initFilterExceptions;
	}

	public void setInitFilterExceptions(boolean initFilterExceptions) {
		this.initFilterExceptions = initFilterExceptions;
	}

	public void init(FilterConfig config) {
		initFilterExceptions = true;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;

		try {
			if (httpRequest.isRequestedSessionIdValid()) { // aqui voc� valida a sess�o
				chain.doFilter(request, response);
			} else {
				HttpServletResponse httpResponse = (HttpServletResponse) response;
				httpResponse.sendRedirect(httpRequest.getContextPath() + "/erro/sessaoexpirada.jsp");/*e aqui voc�
																										// pode chamar a
																										// p�gina de
																										// login se
																										// quiser*/
			}
		} catch (Exception e) {
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			httpResponse.sendRedirect(httpRequest.getContextPath() + "/erro/erro.jsp");
		}
	}

	public void destroy() {
	}
}
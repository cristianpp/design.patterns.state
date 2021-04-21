package com.br.designpatterns.state;

public class DomainExpception extends RuntimeException {

	private static final long serialVersionUID = -4366166897091449081L;

	public DomainExpception(String messages) {
		super(messages);
	}
}

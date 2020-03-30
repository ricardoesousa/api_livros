package com.algaworks.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7389546583819806303L;
	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	 public AutorNaoEncontradoException (String mensagem, Throwable causa) {
		 super (mensagem, causa);
	 }
}

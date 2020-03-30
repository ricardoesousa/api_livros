package com.algaworks.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7389546583819806303L;
	public LivroNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	 public LivroNaoEncontradoException (String mensagem, Throwable causa) {
		 super (mensagem, causa);
	 }
}

package com.algaworks.socialbook.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LivroNaoEncontradoException(String mensagem) {
		
	}
	 public LivroNaoEncontradoException (String mensagem, Throwable causa) {
		 super (mensagem, causa);
	 }
}

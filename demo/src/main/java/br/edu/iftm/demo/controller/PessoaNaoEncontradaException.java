package br.edu.iftm.demo.controller;

public class PessoaNaoEncontradaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public PessoaNaoEncontradaException(Integer id) {
        super("Não encontrei pessoa " + id);
      }

}

package br.edu.iftm.demo.controller;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@ControllerAdvice
public class PessoaNaoEncontradaAdvice {
        @ResponseBody
        @ExceptionHandler(PessoaNaoEncontradaException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String employeeNotFoundHandler(PessoaNaoEncontradaException ex) {
                return ex.getMessage();
        }

        @ExceptionHandler
        public ResponseEntity<String> deleteError(EmptyResultDataAccessException ex) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado!");
        }

}

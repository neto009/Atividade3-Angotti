package br.edu.iftm.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String nome;

        public Pessoa() {
        }

        public Pessoa(String nome) {
                this.nome = nome;
        }

        public Integer getId() {
                return this.id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getNome() {
                return this.nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }
}

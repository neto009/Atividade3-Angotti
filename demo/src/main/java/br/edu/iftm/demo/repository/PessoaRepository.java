package br.edu.iftm.demo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import br.edu.iftm.demo.domain.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
    @Override
    List<Pessoa> findAll();
}

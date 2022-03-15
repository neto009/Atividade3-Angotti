package br.edu.iftm.demo.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.iftm.demo.controller.PessoaNaoEncontradaAdvice;
import br.edu.iftm.demo.controller.PessoaNaoEncontradaException;
import br.edu.iftm.demo.domain.Pessoa;
import br.edu.iftm.demo.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;

    public List<Pessoa> todos() {
        return repository.findAll();
    }

    public Pessoa novo(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Optional<Pessoa> busca(Integer id) {
        return repository.findById(id);
    }

    public Pessoa atualiza(Pessoa pessoa, Integer id) {

        if(repository.existsById(id)){
        pessoa.setId(id);
        return repository.save(pessoa);
        }

        throw new PessoaNaoEncontradaException(id);
    }

    public void exclui(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}

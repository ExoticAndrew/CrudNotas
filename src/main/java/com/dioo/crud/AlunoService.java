package com.dioo.crud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlunoService {
    private final AlunoRepository repository;
    public void salvar (Aluno aluno){
        repository.save(aluno);
    }
    public Aluno buscarPorId(Long id){
        return repository.findById(id).orElseThrow(()-> new IllegalArgumentException("Aluno não encontrado"));
    }
    public Aluno atualizar(Long id, Aluno novoaluno) {
        Aluno aluno = buscarPorId(id);
        aluno.setNome(novoaluno.getNome());
        aluno.setNota1(novoaluno.getNota1());
        aluno.setNota2(novoaluno.getNota2());
      return repository.save(aluno);

    }
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}


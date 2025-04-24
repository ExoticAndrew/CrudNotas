package com.dioo.crud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {
    private final AlunoService  alunoservice;
    @PostMapping
    public void salvar(@RequestBody Aluno aluno){
        alunoservice.salvar(aluno);
    }
    @DeleteMapping("/{id}")
    public void  deletar(@PathVariable Long id){
        alunoservice.deletar(id);
    }
    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable Long id){
        return alunoservice.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno novoAluno){
        return alunoservice.atualizar(id,novoAluno);
    }
}

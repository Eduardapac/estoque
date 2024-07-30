package br.com.eduarda.estoque.services;

import br.com.eduarda.estoque.model.Produto;
import br.com.eduarda.estoque.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }
}
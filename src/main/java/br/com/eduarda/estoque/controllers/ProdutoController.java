package br.com.eduarda.estoque.controllers;

import br.com.eduarda.estoque.model.Categoria;
import br.com.eduarda.estoque.model.Produto;
import br.com.eduarda.estoque.repositories.ProdutoRepository;
import br.com.eduarda.estoque.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping()
    public List<Produto> listarTodosProdutos(){
        return produtoRepository.findAll(Sort.by("nomeproduto").ascending());
    }
    @PostMapping()
    public ResponseEntity<Produto> inserir(@RequestBody Produto produto){
        Produto produtoSalvar = produtoService.salvar(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvar);
    }
}

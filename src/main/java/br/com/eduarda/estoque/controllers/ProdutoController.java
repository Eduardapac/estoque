package br.com.eduarda.estoque.controllers;

import br.com.eduarda.estoque.model.Produto;
import br.com.eduarda.estoque.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")

public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    public ResponseEntity<Produto> inserir(@RequestBody Produto produto){
        Produto produtoSalvar = produtoService.salvar(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvar);
    }
}

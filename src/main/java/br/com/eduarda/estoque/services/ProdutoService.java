package br.com.eduarda.estoque.services;

import br.com.eduarda.estoque.model.Categoria;
import br.com.eduarda.estoque.model.Produto;
import br.com.eduarda.estoque.repositories.ProdutoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto){

        return produtoRepository.save(produto);
    }
    public Produto atualizar(Integer id, Produto produto){
        Produto produtoSalva = buscarProdutoExistente(id);

        BeanUtils.copyProperties(produto, produtoSalva, "id");

        return  produtoRepository.save(produtoSalva);
    }

    private Produto buscarProdutoExistente(Integer id) {
        Optional<Produto> produtoSalva = produtoRepository.findById(id);

        if(!produtoSalva.isPresent()) {
            throw new IllegalArgumentException();
        }
        return produtoSalva.get();
    }
}

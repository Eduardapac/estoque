package br.com.eduarda.estoque.repositories;

import br.com.eduarda.estoque.model.Produto;
import br.com.eduarda.estoque.repositories.produto.ProdutoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>, ProdutoRepositoryQuery {
}

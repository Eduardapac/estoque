package br.com.eduarda.estoque.repositories;

import br.com.eduarda.estoque.model.Categoria;
import br.com.eduarda.estoque.repositories.categoria.CategoriaRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>, CategoriaRepositoryQuery {
}

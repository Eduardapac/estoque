package br.com.eduarda.estoque.repositories.categoria;

import br.com.eduarda.estoque.model.Categoria;
import br.com.eduarda.estoque.repositories.filter.CategoriaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CategoriaRepositoryImpl implements CategoriaRepositoryQuery{


    @Override
    public Page<Categoria> filtrar(CategoriaFilter categoriaFilter, Pageable pageable) {
        return null;
    }
}

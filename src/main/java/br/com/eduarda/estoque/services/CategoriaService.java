package br.com.eduarda.estoque.services;

import br.com.eduarda.estoque.model.Categoria;
import br.com.eduarda.estoque.repositories.CategoriaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria salvar(Categoria categoria){

        return categoriaRepository.save(categoria);
    }

    public Categoria atualizar(Integer id, Categoria categoria){
        Categoria categoriaSalva = buscarCategoriaExixstente(id);

        BeanUtils.copyProperties(categoria, categoriaSalva, "id");

        return  categoriaRepository.save(categoriaSalva);
    }
    private Categoria buscarCategoriaExixstente(Integer id) {
        Optional<Categoria> categoriaSalva = categoriaRepository.findById(id);

        if(!categoriaSalva.isPresent()) {
            throw new IllegalArgumentException();
        }
        return categoriaSalva.get();
    }
}

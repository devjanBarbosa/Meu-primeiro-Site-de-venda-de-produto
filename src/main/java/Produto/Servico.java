package Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servico {

    @Autowired
    ProdutoRepositorio repositorio;

    public List<Produto> findall(){
        return repositorio.findAll();
    }
}

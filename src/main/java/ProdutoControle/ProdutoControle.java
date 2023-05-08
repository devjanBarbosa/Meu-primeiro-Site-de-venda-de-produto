package ProdutoControle;

import Produto.Produto;
import Produto.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoControle {

    @Autowired
    private ProdutoRepositorio repositorio;

    @GetMapping
    public List<Produto> getall(){
        List<Produto> lista = repositorio.findAll();
        return lista;




    }
}

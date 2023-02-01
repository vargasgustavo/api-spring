package com.apostila.demo;

import com.apostila.demo.model.Produto;
import com.apostila.demo.model.ProdutoDAO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.List;

@RestController
public class Controller {
    @CrossOrigin(origins = "*")
    @GetMapping("/teste")
    public String teste() {
        return "Deu certo!";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/produto")
    public String Editar(@RequestBody Produto p) {
        ProdutoDAO dao = new ProdutoDAO();
        System.out.println(dao.salvar(p));
        return "Produto atualizado!";
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.GET)
    @GetMapping("/produto_localizar/{nome}")
    public List<Produto> Search(@PathVariable(value = "nome") String p) {
        System.out.println(p);
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produto = dao.localizar(p);
        return produto;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.DELETE)
    @DeleteMapping("/produto_excluir/{codigo}")
    public String Excluir(@PathVariable(value = "codigo") int p) {
        ProdutoDAO dao = new ProdutoDAO();
        System.out.println(dao.excluir(p));
        return "Produto excluído!";
    }
}

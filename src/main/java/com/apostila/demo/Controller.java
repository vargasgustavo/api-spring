package com.apostila.demo;

import com.apostila.demo.model.Produto;
import com.apostila.demo.model.ProdutoDAO;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/teste")
    public String teste(){
        return "Deu certo!";
    }
    @PostMapping("/produto")
    public String Editar(@RequestBody Produto p){
        ProdutoDAO dao = new ProdutoDAO();
        System.out.println(dao.salvar(p));
        return "Produto atualizado!";
    }
//    @GetMapping("/produto")
//    public Array<Produto> Search(@RequestBody Produto p){
//        ProdutoDAO dao = new ProdutoDAO();
//        Produto produto = dao.localizar(1);
//        if (p!=null) {
//            return produto;
//        }
//        else {
//            System.out.println("Produto não encontrado!");
//        }
//    }
}

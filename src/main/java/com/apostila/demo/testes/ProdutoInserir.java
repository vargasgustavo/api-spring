package com.apostila.demo.testes;

import com.apostila.demo.model.Produto;
import com.apostila.demo.model.ProdutoDAO;

public class ProdutoInserir {

	public static void main(String[] args) {
		
		Produto p = new Produto(1, "Chocolate gostoso", 3.12, 10);
		ProdutoDAO dao = new ProdutoDAO();
		System.out.println(dao.salvar(p));

	}

}
